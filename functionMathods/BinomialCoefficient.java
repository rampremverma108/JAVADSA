import java.util.*;

public class BinomialCoefficient{
    public static int factorial(int n){
        int f = 1;
        for(int i =1; i<=n; i++){
            f = f*i;  
        }
        return f;
    }

    public static int calculateNCR(int n, int r){
         int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n-r);
        int result = nfact / (rfact * nmrfact);
        return result;
    }

   

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter value of r : ");
        int r = sc.nextInt();
        System.out.println("Binomial coefficant is : "+ calculateNCR(n,r));
        sc.close();
    }
}