package project14_28jun;

public enum MyColor {
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private String color;

    private MyColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
