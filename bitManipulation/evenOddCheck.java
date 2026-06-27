import java.util.Scanner;
public class evenOddCheck{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number to check Even or Odd : ");
    int n = sc.nextInt();
    int bitMask = 1;
    if((n & bitMask ) == 0){
        System.out.println("Even Number");
    }else{
        System.out.println("Odd Number");
    }
}
}