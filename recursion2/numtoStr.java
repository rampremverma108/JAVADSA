import java.util.Scanner;

public class Num_String{
    public static void printWords(int num, String words[]) {
        if (num == 0) {
            return;
        }
        printWords(num / 10, words);
        // for last digit
        int lastDigit = num % 10;
        System.out.print(words[lastDigit] + " ");
    }

    public static void main(String args[]){
    String words[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(words[0]);
        } else {
            printWords(num, words);
            System.out.println();
        }
    }
}