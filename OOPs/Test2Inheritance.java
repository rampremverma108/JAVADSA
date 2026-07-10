public class Test2Inheritance{
    public static void main(String args[]){
        //Vehical obj1 = new Car();
        //obj1.print1();   //Error only access Base class bcoz reffernce Vehical 

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
    void print1(){
        System.out.println("Drived class (Car)");
    }
}