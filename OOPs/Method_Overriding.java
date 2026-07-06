public class Method_Overriding{
    public static void main(String args[]){
       Deer D = new Deer();
       D.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat anything by animal");
    }
}

class Deer{
 void eat(){
        System.out.println("Eat grass by deer");
    }
}
//Note :-The work that file, which has object.