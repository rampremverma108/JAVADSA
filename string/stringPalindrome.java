import java.util.*;

public class checkPalindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to check is Palindrome? ");
        String str = sc.next();
        boolean isPalindrome = true;
        int n = str.length();

        for(int i = 0; i< n/2; i++){
           if( str.charAt(i) != str.charAt(n-i-1)){
            isPalindrome = false;
            break;
        }
    }
    if (isPalindrome) {
            System.out.println("Palindrome word");
        } else {
            System.out.println("Not a Palindrome word");
        }
}
}