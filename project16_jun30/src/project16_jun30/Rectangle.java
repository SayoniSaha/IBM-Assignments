package project16_jun30;

public class Rectangle implements Shape{
	private double l;
    private double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double getArea() {
        return l * w;
    }
}
