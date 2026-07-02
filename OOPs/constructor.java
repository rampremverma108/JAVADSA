public class Constructor{
    public static void main(String args[]){
        Student s1 = new Student();
        // Default Constructor: Yeh tab call hota hai jab 'new Student()' se object banta hai
    }
}

class Student {
    String name;
    int roll;
    
    // * User-defined Default Constructor
    // * Object initialization ke waqt automatic execute hota hai.
    Student() {
        System.out.println("constructor is called...");
    }
}