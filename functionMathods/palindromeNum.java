import java.util.*;

public class palindromeNum{
public static boolean isPalindrome(int n){
int myNum = n;
int rem;
int rev =0;
while(n>0){
    rem = n % 10;
    rev = (rev *10)+ rem ;
    n = n / 10;
// if (myNum == rev) {
//             System.out.println(myNum + " is a palindrome.");
//         } else {
//             System.out.println(myNum + " is NOT a palindrome.");
//         }
}
// return rev;
return myNum == rev;
}

public static void main(String args[]){
    System.out.print("Enter number to know if it's a palindrome: ");
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(isPalindrome(n)? n + " is a Palindrome.":n + " is NOT a Palindrome." );
    sc.close();
}
}