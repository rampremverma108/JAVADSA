import java.util.*;

public class Additionuser{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For Addition:\nEnter two numbers:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = (A +B);
        System.out.println("Sum of Numbers: "+sum);
    }
}