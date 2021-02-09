package csvbench.readers;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import csvbench.models.Point;

public class JacksonReader {

    private final String filePath;
    private final List<Point> points;

    public JacksonReader(String bigFilePath) {
        this.filePath = bigFilePath;
        this.points = new ArrayList<>();
    }

    public void parse() throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.builder()
        .addColumn("x")
        .addColumn("y")
        .addColumn("z")
        .addColumn("r")
        .addColumn("g")
        .addColumn("b")
        .addColumn("intensity")
        .addColumn("extra1")
        .build();

        ObjectReader oReader = csvMapper.readerFor(Point.class)
        .with(schema.withoutHeader().withColumnSeparator(' '));

        try (Reader reader = new FileReader(filePath)) {
            MappingIterator<Point> mi = oReader.readValues(reader);

            while(mi.hasNext()) {
                points.add(mi.next());
            }
        }
        System.out.printf("Read and parsed %d points\n", points.size());
	}
    
}
