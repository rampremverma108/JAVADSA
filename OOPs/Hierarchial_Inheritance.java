class Hierarchial_Inheritance{
    public static void main(String args[]){
        Bird B1 = new Bird();
        B1.eat();
        //B1.walk();  it not print bcoz it from another class
        B1.fly();
    }
}

class Animal{
    void eat(){
        System.out.println("Eating start");
    }

    void breathe(){
        System.out.println("Breathe Necessary to live");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}