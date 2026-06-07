
import java.util.*;

public class primeRange{

    // checking here prime number
public static boolean isPrime(int n){
      if (n <= 1){
        return false;
    }
   boolean isPrime  = true;
    for(int i = 2; i<=Math.sqrt(n); i++){
        if (n%i ==0){
            isPrime =false;
        }
    }
    return isPrime;
}

//check for prime range
public static void primeInRange( int n){
    for (int i=2; i <=n;i++){
        if(isPrime(i)){
            System.out.print(i+" ");
        }
    }
    System.out.println();
}


public static void main(String args[]){
        System.out.print("Enter the number to know is it prime or  prime range in between them: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(n + " is " + (isPrime(n) ? "a prime number." : "not a prime number."));
        System.out.println(""+primeInRange(n));
    }
}