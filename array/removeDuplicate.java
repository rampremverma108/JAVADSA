import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 1, 2};
        int n = arr.length;
        
        int[] temp = new int[n];
        int count = 0;

        // Loop through the original array
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            
            // Check if arr[i] is already in temp
            for (int j = 0; j < count; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If not found, add it to temp
            if (!isDuplicate) {
                temp[count] = arr[i];
                count++;
            }
        }

        // Print the unique elements up to the count
        System.out.print("Unique Array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}