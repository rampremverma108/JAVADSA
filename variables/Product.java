import java.util.*;

public class Product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("For Product:\nEnter two numbers:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int product = (A*B);
        System.out.println("Product of Numbers: "+product);
    }
}