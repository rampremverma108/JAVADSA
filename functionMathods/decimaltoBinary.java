import java.util.*;

public class decimaltoBinary{  
    public static void main(String args[]){
        System.out.print("Enter Number to convert into Binary : ");
        Scanner sc = new  Scanner(System.in);
        int num = sc.nextInt();
        int power = 0;
        int bin = 0;
        int myNum = num;
        while( num > 0){
            int rem = num%2;
            bin = bin + (rem* (int) Math.pow(10, power) );
            power++;
            num = num/2;
        }
        System.out.println("Binary Number of "+myNum+" is: " + bin);
        sc.close();
    }
}