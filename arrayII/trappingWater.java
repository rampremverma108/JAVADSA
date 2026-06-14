import java.util.*;

public class trappeWater{

public static int trappedRainwater(int height[]){

    int n = heigh.length;
    //calculate left max boundary -array
    int leftMax[] = new int[n];
    leftMax[0] =height[0];
    for(int i =1; i<n; i++){
        leftMax[i] =Math.max(heighth[i], leftMax[i-1]);
    }

    //calculate right max boundary -array
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i=n-2; i>=0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }


int trappedWater =0;
//loop
for(int i=0; i<n; i++){
    //waterLevel = min(leftmax bound, rightmax bound)
    int waterLevel = Math.min(leftMax[i], rightMax[i]);

    ///trape water = waterLevel -height[i]
    trappedWate += waterLevel -height[i];
}
return trappedRainwater;
}

    public static void mian(String args[]){
        int height[] = {4,2, 0,6,3,2,5,};
        system.out.println(trappedRainwater(height));
    }
}