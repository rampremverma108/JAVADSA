import java.util.*;

public class largestinArray{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // use for -infinity
        int smallest = Integer.MAX_VALUE;  // +infinite

        for(int i=0; i<numbers.length; i++){
            //to get largest value
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            //to get lowesr value
             if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest Value in Array : "+ smallest);
            return largest;
    }

public static void main(String args[]){
    int numbers[] = {1,2,6,3,5};
    System.out.println("Largest Value in Array : "+ getLargest(numbers));
}
}