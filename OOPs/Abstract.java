public class OOPS{
    public static void main(String args[]){
    // 1. Constructor Chaining: Animal -> Horse -> Mustang
    Mustang myHorse = new Mustang();


System.out.println("\n--- Testing Horse (Abstraction in action) ---");
        Horse h = new Horse();
        h.eat();
        h.walk();

 System.out.println("\n--- Testing Chicken ---");
        Chiken c = new Chiken();
        c.eat();
        c.walk();
    }
}

abstract class Animal{
    String color;

// Abstract classes can have constructors
Animal() {
    System.out.println("Animal constructor called");
}

    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
Horse(){
    System.out.println("Horse constructor called");
}

    void changeColor(){
        color = "dark brown";
    }
    void walk(){
    System.out.println("walk on 4 legs");
    }
}

class Chiken extends Animal{
    void walk(){
    System.out.println("walk on 2 legs");
}
}
// Multi-level inheritance subclass
class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}