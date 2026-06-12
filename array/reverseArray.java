import java.util.*;

public class ReverseArray{
public static void reverse(int numbers[]){
    int first = 0;
    int last = numbers.length-1;
    while(first < last){
        //swap
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] =temp;
        first++;
        last--;
    }
}
    public static void main(String args[]){
     //it take extra memory 
    //     int arr[] = {2,4,6,8,10};
    //     int revArr[] = new int[arr.length];
    //     int j=0;
    //     for(int i=arr.length -1; i>=0; i--){
    //         revArr[j]  = arr[i];
    //         j++;
    //     }
    //     System.out.println(Arrays.toString(revArr));
    // }
                int numbers[] = {2,4,6,8,10};
                reverse(numbers);
                for(int i =0; i<numbers.length; i++){
                    System.out.print(numbers[i]+ " ");
                }
}
}