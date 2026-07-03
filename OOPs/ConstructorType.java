public class Constructor {
    public static void main(String args[]) {
        // 1. Non-parameterized constructor call
        Student s1 = new Student();   //suitable Constructor call itself we say CONSTRUCTOR OVERLOADING
        
        // 2. Parameterized constructor calls (Notice we use s2 and s3 here)
        Student s2 = new Student("Ram");
        Student s3 = new Student(12345);
    }
}

class Student {
    String name;
    int rollno;

   // Non-parameterized Constructor
    Student() {
        System.out.println("Non-parameterized constructor is calling...");
    }
    
    // Parameterized Constructor (String)
    Student(String name) {
        this.name = name;
        System.out.println("Parameterized constructor (String) called for: " + this.name);
    }
    
    // Parameterized Constructor (int)
    Student(int rollno) {
        this.rollno = rollno;
        System.out.println("Parameterized constructor (int) called with roll no: " + this.rollno);
    }
}