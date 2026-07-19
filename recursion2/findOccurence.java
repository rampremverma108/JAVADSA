import java.util.Scanner;

public class FindOccurrences {

    // Recursive function जो indices (positions) प्रिंट करेगा
    public static void findAllIndices(int arr[], int n, int key, int currentIndex) {
        
        // 1. Base Case: अगर index चलते-चलते array के size (N) के बराबर हो जाए, तो रुक जाओ
        if (currentIndex == n) {
            return;
        }

        // 2. Self Work: चेक करो कि current index पर रखी वैल्यू Key के बराबर है या नहीं
        if (arr[currentIndex] == key) {
            System.out.print(currentIndex + " ");
        }

        // 3. Recursive Call: अगले index (currentIndex + 1) को चेक करने के लिए आगे बढ़ो
        findAllIndices(arr, n, key, currentIndex + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Array का size (N) इनपुट लें
        System.out.print("Enter the size of the array (N): ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        // Array के elements इनपुट लें
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // ढूंढने वाली Key इनपुट लें
        System.out.print("Enter the Key to find: ");
        int key = sc.nextInt();
        
        System.out.print("Occurrences (Indices): ");
        
        // Function Call: शुरुआत हमेशा 0th index से होगी
        findAllIndices(arr, n, key, 0);
        
        System.out.println(); // Output के बाद clean new line के लिए
       // sc.close();
    }
}