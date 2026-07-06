public class Multi_Inheritance{
    public static void main(String args[]){
      Dog Sukhy = new Dog();
      Sukhy.eat();
      Sukhy.legs = 4;
      Sukhy.name = "Sukhy";
      System.out.println(Sukhy.legs+" Legs");
      System.out.println(Sukhy.name);
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
class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String name;
}