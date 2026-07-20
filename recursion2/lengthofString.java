import java.util.Scanner;

public class StringLength{
    public static int getStringLength(String line){
        if (line.equals("")) {
            return 0;
        }
        return 1 + getStringLength(line.substring(1));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence to know length even space calculated : ");
        String line = sc.nextLine();

        int length = getStringLength(line);

        System.out.println("Length of string is: " + length);
    }
}