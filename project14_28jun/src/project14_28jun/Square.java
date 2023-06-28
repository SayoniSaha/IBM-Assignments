package project14_28jun;

public class Square extends Shape{
	public Square() {
        setHeight(10);
        setWidth(10);
        MyColor myColor = MyColor.BLUE;
        System.out.println("Square color: " + myColor.getColor());
    }

}
