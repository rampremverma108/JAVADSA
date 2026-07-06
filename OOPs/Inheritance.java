public class Inheritance{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}
//base class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats the Food");
    }

    void breathe() {
        System.out.println("breath to live");
    }
}

//Drived Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.print("Swim in water");
    }
}