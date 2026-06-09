import java.util.*;

public class sumofDigit{
public static void digitSum(int n){
    int sum =0;
    while(n>0){
    int lastDigit = n%10;  // to get lastaDigit
    sum += lastDigit;
    n = n/10;  //to get quotient 
}
System.out.println("Sum of Digit : "+ sum);
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit to get Sum of All : ");
        int n = sc.nextInt();
       digitSum(n);
       sc.close();
    }
}