package project16_jun30;

public class Triangle implements Shape {
	private double h;
	private double b;

    public Triangle(double h, double b) {
    	this.h = h;
        this.b = b;
    }

    public double getArea() {
        return 0.5 * b*h;
    }
}
