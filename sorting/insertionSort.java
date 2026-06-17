import java.util.*;

public class Sort{
public static void insertationSort(int arr[]){
for(int i =0; i<arr.length; i++){
    int curr =arr[i];
    int prev = i-1;
    // finding  the correct pass 
    while(prev >=0 && arr[prev] > curr){
        arr[prev+1] = arr[prev];
        prev--;
    }
    //insertion
    arr[prev+1]= curr;
    }
}
public static void main(String args[]){
int arr[] = {5,4,1,3,2};
insertationSort(arr);
System.out.println(Arrays.toString(arr));
}
}