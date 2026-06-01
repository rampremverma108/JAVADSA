import java.util.*;

public class switchcase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers for Food: ");
        int item = sc.nextInt();

    switch(item) {
        case 1 : System.out.println("You Got 'SAMOSA");
         break;   
        case 2 : System.out.println("You Got 'Chai");
         break;   
        case 3 : System.out.println("You Got 'Biskut");
        break;
        default: System.out.println("ohh its Dream");
            
    }
    }
}