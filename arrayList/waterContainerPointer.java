//2 pointer Approach 
import java.util.ArrayList;

public class WaterContainerPointer{
    public static int storewater(ArrayList<Integer> height){
        int maxWater = 0;
        int left = 0;
        int right = height.size()-1;

        while(left<right){
            int area = Math.min(height.get(left), height.get(right));
            int width = right-left;
            int currentarea = area*width;
            maxWater = Math.max(maxWater, currentarea);

            if(height.get(left)<height.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<Integer>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));
    }
}