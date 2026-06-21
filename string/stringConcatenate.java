import java.util.*;

public class stringConcatenate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("To get your full name enter your first/middle/last name...");
        System.out.print("Enter First name : ");
        String first =sc.next();
        System.out.print("Enter Middle name : ");
        String middle =sc.next();
        System.out.print("Enter Last name : ");
        String last =sc.next();
        System.out.print("Your full name : "+ first +" "+ middle+ " "+ last);
    }
}