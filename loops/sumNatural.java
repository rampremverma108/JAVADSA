import java.util.*;

public class sumNatural{
    public static void main(String[] args){
        System.out.print("Input n number till sum : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int sum = 0;
        while(start <= n){
            sum +=start;
            start++;
        }
        System.out.print(sum+" ");
    }
}