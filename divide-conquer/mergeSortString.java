import java.util.Arrays;
public class MergeSort{

    public static void mergeSort(String[] arr, int left, int right){
          if (left < right) {
            int mid = left + (right - left) / 2;
            // left 
            mergeSort(arr, left, mid);
            // right
            mergeSort(arr, mid + 1, right);
            // add
            merge(arr, left, mid, right);
        }
    }

public static void merge(String[] arr, int left, int mid, int right) {
        // size of subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // temp array
        String[] L = new String[n1];
        String[] R = new String[n2];

        // copy data
        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        // temp arry merge
        int i = 0, j = 0;
        int k = left;   //main array index

        while (i < n1 && j < n2) {
            // compareTo() used for comparing array
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
            }

        // remaining in left
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        //if remaining in right 
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]){
        String arr[] = {"sun", "earth", "mars", "mercury"};
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

//output:- {"earth", "mars", " mercury", "sun"}