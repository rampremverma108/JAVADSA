import java.util.*;

public class Matrices {

// searching
public static boolean search( int matrix[][], int key){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length;j++){
        if (matrix[i][j] == key){
            System.out.println("found at cell ("+ i +","+j +")");
            return true;
        }}}
    System.out.println("key not found");
    return false;
}

    public static void main(String[] args) {
      int matrix[][] = new int [3][3];
      int m=matrix.length, n =matrix[0].length;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter matrix element in formet:\nr11,r21,r31,\nr21,r22,r23\nr31,r32,r33");
      for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            matrix[i][j] = sc.nextInt();
        }}
//output
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    // call search fn
    search(matrix, 5);

}
}