import java.util.*;

public class Shopkeeper{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();
        
        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();
        
        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float totalCost = pencil + pen + eraser;
        float gstTax = totalCost * 0.18f;

        float finalBill = totalCost + gstTax;

       System.out.println("\n--- YOUR BILL ---");
        System.out.println("Base Total: $%.2f%n :"+ totalCost);
        System.out.println("GST (18%):  $%.2f%n :"+ gstTax);
        System.out.println("Total Due:  $%.2f%n :"+ finalBill);
    }
    
}