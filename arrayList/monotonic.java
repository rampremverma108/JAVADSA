import java.util.ArrayList;

public class Solution {
    public static boolean isMonotonic(ArrayList<Integer> nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.size(); i++) {
            // Agar agla element chhota hai, toh increasing nahi ho sakta
            if (nums.get(i) < nums.get(i - 1)) {
                increasing = false;
            }
            // Agar agla element bada hai, toh decreasing nahi ho sakta
            if (nums.get(i) > nums.get(i - 1)) {
                decreasing = false;
            }
        }

        // Agar dono mein se koi bhi ek true hai, toh list monotonic hai
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1); 
        nums1.add(2);
        nums1.add(2); 
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);
        System.out.println(isMonotonic(nums1)); // Output: true

        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(1); nums3.add(3); nums3.add(2);
        System.out.println(isMonotonic(nums3)); // Output: false
    }
}