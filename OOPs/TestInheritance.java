public class TestInheritance{
    public static void main(String args[]){
        Vehical obj1 = new Car();
        obj1.print();
        Vehical obj2 = new Vehical();
        obj2.print(); 
    }
}

class Vehical{
    void print(){
        System.out.println("Base class (Vehical)");
    }
}

class Car extends Vehical{
    void print(){
        System.out.println("Drived class (Car)");
    }
}