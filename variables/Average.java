import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers to get Average");
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Average= (a+b+c)/3;
        System.out.println("Average value is: "+Average);
    }
}