import java.util.*;

public class printNum{
    public static void specificPrint(int array[][], int key){
        int numCounter = 0;
        for(int i = 0; i<array.length; i++){
            for(int j =0; j<array[0].length; j++){
                if(array[i][j] == key)
               numCounter++;
        }
    }
    System.out.println("The number "+key+" comes in array "+numCounter+" times.");
    }
public static void main(String args[]){
    int array[][] = {{4,7,8},
                     {8,8,7}};
        specificPrint(array, 8);
}
}