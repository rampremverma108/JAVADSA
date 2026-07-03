public class Constructor{
    public static void main(String args[]){
        Student s1 = new Student();
    }
}

class Student {
    String name;

    Student() {
        System.out.println("Non-parametrize constructor is calling...");
        //This is non parametrize constructor because there is NO PARAMETER and ARGUMENT calling....
    }
}