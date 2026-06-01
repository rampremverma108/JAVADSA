import java.util.*;


public class reverseNumberset{
    public static void main(String[] args){
        System.out.print("Input number to get reverse number : ");
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     int rev = 0;

while(number > 0){
    
    int lastdigit = number % 10;
    rev =(rev*10)+lastdigit;
    number /=10;
}
System.out.print("The reverse Numbmer is : "+rev);
    }
}