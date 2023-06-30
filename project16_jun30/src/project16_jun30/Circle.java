package project16_jun30;

public class Circle implements Shape{
	private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI *r*r;
    }
}
