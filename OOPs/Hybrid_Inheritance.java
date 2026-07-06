class Hybrid_Inheritance {
    public static void main(String args[]) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.walk();
        myDog.bark();

        System.out.println("----------------");

        Bird myBird = new Bird();
        myBird.eat();
        myBird.fly();
    }
}

// Base Class (Grandparent)
class Animal {
    void eat() {
        System.out.println("Eating start");
    }

    void breathe() {
        System.out.println("Breathe Necessary to live");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammals {
    void bark() {
        System.out.println("barks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flys");
    }
}
