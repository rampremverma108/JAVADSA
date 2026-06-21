import java.util.*;

public class stringLength{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentance to know their length/words: ");
        String Sentance =sc.nextLine();
        System.out.print("The number of WOrds in your Sentence with space count is : "+Sentance.length());
    }
}