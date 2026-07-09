public class StaticKeywordExample{
    public static void main (String args[]){
        Student s1 = new Student();
        s1.schoolName = "SPS";

        Student s2 =new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";  // it will change name from everywhere
        //bcoz static define in memory only one time.
        // --- BADLAAV CHECK KARNE KE LIYE YAHAN PRINT KAREIN ---
        System.out.println(s1.schoolName); // Output: ABC
        System.out.println(s2.schoolName); // Output: ABC
        System.out.println(s3.schoolName); // Output: ABC
       
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

}