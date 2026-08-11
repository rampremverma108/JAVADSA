import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        //sorting our arraylist
        Collections.sort(nums);

        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.size();

        if (n == 1) {
            return nums;
        }

        //checking element
        for (int i = 0; i < n; i++) {
            boolean isLonely = true;

            //check our prevoius element
            if (i > 0) {
                if (nums.get(i) == nums.get(i - 1) || nums.get(i) == nums.get(i - 1) + 1) {
                    isLonely = false;
                }
            }

            // checking next element
            if (i < n - 1) {
                if (nums.get(i) == nums.get(i + 1) || nums.get(i) == nums.get(i + 1) - 1) {
                    isLonely = false;
                }
            }

            // adding in list if it is lonely
            if (isLonely) {
                result.add(nums.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        System.out.println(findLonely(nums)); // Output: [8, 10]
    }
}