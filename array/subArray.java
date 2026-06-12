import java.util.*;

public class subArray{
public static void sub_Array(int numbers[]){
    int totsubArray  = 0;
    for(int i=0; i<numbers.length; i++){
        int start =i;
        for(int j =i; j<numbers.length; j++){
            int end =j;
            for(int k=start; k<=end ; k++){
                System.out.print(numbers[k]+" ");
            }
            totsubArray++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("total subArray : "+ totsubArray);
}
public static void main(String args[]){
    int numbers[] ={2,4,6,8,10};
    sub_Array(numbers);
}
}