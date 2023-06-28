package project14_28jun;

public class Rectangle extends Shape {
    public Rectangle() {
        setHeight(10);
        setWidth(20);
        MyColor myColor = MyColor.GREEN;
        System.out.println("Rectangle color: " + myColor.getColor());
    }
}
