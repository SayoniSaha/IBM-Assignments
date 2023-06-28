package project14_28jun;

public class Shape {
    private double height;
    private double width;

	public double calculateShape(double height, double width) {
        this.height = height;
        this.width = width;
        double a = height * width;
        return a;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public static void main(String[] args) {
        Shape shape = new Shape();

        double rHeight = 10;
        double rWidth = 20;
        double rArea = shape.calculateShape(rHeight, rWidth);
        System.out.println("Rectangle Area: " + rArea);

        double sHeight = 10;
        double sWidth = 10;
        double sArea = shape.calculateShape(sHeight,sWidth);
        System.out.println("Square Area: " + sArea);
    }
}
