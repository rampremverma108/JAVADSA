import java.util.*;

public class testEven{
    public static boolean isEven(int n){
        boolean isEven = true;
        // if(n%2!=0){
        //     return false;
        // }
        // return isEven;
        return (n % 2 ==0);  //optimised code
    }
    public static void main(String sdfd[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check even or not : ");
        int n = sc.nextInt();
        System.out.print("Result: "+ isEven(n));
        sc.close();
    }
}