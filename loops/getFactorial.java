// Q: Write a program to find the factorialof any number entered by the user.

import java.util.*;

public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive number to get Factorial : ");
        int num = sc.nextInt();
        int fact = 1;
        if ( num == 0){
            System.out.print("Factorial of Zero is : 1");
        }else{
        for (int i = 1; i<=num; i++){
            fact *=i;
          
        }
        System.out.print("Factoril of "+num+" is : " +fact);
    }
    }
}