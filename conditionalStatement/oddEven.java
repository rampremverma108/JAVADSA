import java.util.*;

public class oddEven{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number to know Even or Odd: ");
        int nu = sc.nextInt();

        if(nu%2==0){
          System.out.println(nu+": Number is Even"); 
        }else{
            System.out.println(nu+": Number is Odd");
        }
    }
}