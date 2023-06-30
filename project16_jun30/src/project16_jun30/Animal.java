package project16_jun30;

public interface Animal {
    void bark();
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
