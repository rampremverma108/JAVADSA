abstract class Car {
    // Static block - runs once when class is loaded
    static {
        System.out.print("1");
    }

    // Parent constructor
    public Car(String name) {
        super();
        System.out.print("2");
    }

    // Instance block - runs before parent constructor body
    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    // Instance block - runs before child constructor body
    {
        System.out.print("4");
    }

    // Child constructor
    public BlueCar() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] gears) {
        // Triggers the instantiation chain
        new BlueCar(); 
    }
}