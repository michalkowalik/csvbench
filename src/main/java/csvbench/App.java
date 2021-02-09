package csvbench;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import csvbench.readers.JacksonReader;

/**
 * Hello world!
 *
 */
public class App {
    private static String bigFilePath = "/Users/kom1mu20/src/priv/optdData/a_sciana1ok.txt";

    public static void main(String[] args) throws IOException
    {
        System.out.println( "Jackson csv" );
        Instant start = Instant.now();
        new JacksonReader(bigFilePath).parse();
        Instant end = Instant.now();
        System.out.printf("parsing with jackson took %s\n", Duration.between(start, end));
    }
}
