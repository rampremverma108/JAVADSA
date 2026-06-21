import java.util.*;

public class string_charAt{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Input Sentence/Para : ");
       String str = sc.nextLine();
       System.out.print("Enter number to get word at that place : ");
       int nu = sc.nextInt();
       int lengthno = str.length();
       if (nu <= lengthno){
        System.out.print("The word/space is :-"+str.charAt(nu));
       }else
       {
        System.out.print("Your have entered greater number then the number of words in Sentance");
       }
    }
}