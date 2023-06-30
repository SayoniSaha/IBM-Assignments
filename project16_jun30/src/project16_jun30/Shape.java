package project16_jun30;

public interface Shape {
	
    double getArea();
    
    public static void main(String[] args) {
    	double h_r=10; double w=20;
		Rectangle rectangle = new Rectangle(h_r, w);
		
		double r=5;
        Circle circle = new Circle(r);
        
        double h_t=8; double b=10;
		Triangle triangle = new Triangle(h_t, b);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
    }
}
