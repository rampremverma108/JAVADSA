import java.util.*;

public class transopose{
    public static void swappingMatrix(int array[][]){
        int transpose[][] = new int[3][2];
            for(int i =0; i<array.length; i++){
            for(int j=0; j<array[0].length;j++){
                transpose[j][i] = array[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        int array[][] = {{2,5,9},
                         {5,2,7}};
        swappingMatrix(array);
    }
}