import java.util.*;

public class sumMatrix{
    public static void sumRow(int nums[][]){
        int sumRow = 0;
        for (int j = 0; j<nums[1].length; j++){
            sumRow = sumRow + nums[1][j];
        }
        System.out.println("The sum of Row 1 is : "+sumRow);
    }
    public static void main(String args[]){
        int nums[][] = {{1,4,9},
                        {11,4,3},
                        {2,2,3}};
                      sumRow(nums);
    }
}