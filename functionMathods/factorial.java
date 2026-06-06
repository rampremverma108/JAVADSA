import java.util.*;

public class factorial{
    public static int calfact(int n){
        int f = 1;
        for(int i =1; i<=n; i++){
            f = f*i;  
        }
        return f;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get Factorial: ");
        int n = sc.nextInt();
        System.out.println("factorial is : "+ calfact(n));
    }
}