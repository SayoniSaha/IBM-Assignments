package project16_jun30;

public interface Flyable {
    void fly_obj();
    
    public static void main(String[] args) {
        Flyable[] flyObj = {new Spacecraft(), new Airplane(), new Helicopter()};

        for (Flyable x : flyObj) {
            x.fly_obj();
        }
    }
}
