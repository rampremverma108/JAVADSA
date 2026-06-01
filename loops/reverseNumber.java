import java.util.*;


public class reverseNumber{
    public static void main(String[] args){
        System.out.print("Input number to get reverse number : ");
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();

    while(number > 0){
    int lastdigit = number%10;
    System.out.print(lastdigit);
    number /=10;
    }
    System.out.println();
    }
}