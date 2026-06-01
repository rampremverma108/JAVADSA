import java.util.*;

public class oneton{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n to print")
        int n = sc.nextInt();
        int start = 1;
        while(start <= n){
            System.out.print(start+" ");
            start++;
        }
    }
}