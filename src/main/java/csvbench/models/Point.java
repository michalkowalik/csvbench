package csvbench.models;

public class Point {
    private Integer id;
    private Double x;
    private Double y;
    private Double z;
    private Double intensity;
    private Double r;
    private Double g;
    private Double b;
    private Double extra1;
    private Double extra2;
    private Double extra3;

    public Point() {
        // nothing to see here
    }

    public Integer getId() {
        return id;
    }

    public Double getExtra3() {
        return extra3;
    }

    public void setExtra3(Double extra3) {
        this.extra3 = extra3;
    }

    public Double getExtra2() {
        return extra2;
    }

    public void setExtra2(Double extra2) {
        this.extra2 = extra2;
    }

    public Double getExtra1() {
        return extra1;
    }

    public void setExtra1(Double extra1) {
        this.extra1 = extra1;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getG() {
        return g;
    }

    public void setG(Double g) {
        this.g = g;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public Double getIntensity() {
        return intensity;
    }

    public void setIntensity(Double intensity) {
        this.intensity = intensity;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
