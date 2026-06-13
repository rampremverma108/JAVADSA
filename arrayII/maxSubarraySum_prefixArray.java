import java.util.*;

public class maxSubarraySum_prefixArray{

    public static void prefix_sumaArray(int array[]){
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            int prefix[] = new int[array.length];

            prefix[0] = array[0];
            //calculate array
            for(int i = 1; i<prefix.length; i++){
                prefix[i] = prefix[i-1] + array[i];
            }

             for(int i=0; i<array.length; i++){
            int start =i;
            for(int j=i; j<array.length; j++){
                int end =j;
               
               currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

               if(maxSum < currSum){
                maxSum = currSum;
               }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
         prefix_sumaArray(array);
    }
}