import java.util.*;
public class binarytoDecimal {

    // conversion logic
    public static void bintoDec(long binNum) {
        long myNum = binNum;
        int power = 0;
        long decNum = 0;
        while (binNum > 0) {
            long lastDigit = binNum % 10;
            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Error: This is not a valid binary number!");
                return;
                }
            decNum = decNum + (lastDigit * (long) Math.pow(2, power));
            //i know Math.pow returns a double, so we cast it to (long)
            power++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    // main
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number to convert into Decimal Number : ");
        long binNum = sc.nextLong(); 
        bintoDec(binNum);
    }
}