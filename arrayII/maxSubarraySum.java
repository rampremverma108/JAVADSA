import java.util.*;

public class MaxSubArraySum{

    public static void maxSubarray_Sum(int array[]){
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;

             for(int i=0; i<array.length; i++){
            int start =i;
            for(int j=i; j<array.length; j++){
                int end =j;
                currSum = 0;
                for(int k = start; k <= end; k++){ //print
                    currSum += array[k];
                }
                System.out.println(currSum);
               if(maxSum < currSum){
                maxSum = currSum;
               }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
         maxSubarray_Sum(array);
    }
}