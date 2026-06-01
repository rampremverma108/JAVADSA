import java.util.*;

public class checkfever{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in F : ");
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.println("You have Fever.");
        }else{
            System.out.println("You are Healthy");
        }
    }
}