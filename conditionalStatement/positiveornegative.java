import java.util.*;

public class positiveornegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to know it positive or negtive : ");
        int nu = sc.nextInt();
        if(nu>0){
            System.out.println("Number is Positive.");
        }else{
            System.out.println("Number is Negative.");
        }
    }
}