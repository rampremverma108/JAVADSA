public class invertedHalfPyramid{

public static void half_Inverted_Pyramid(int n){
    // int spaces = 4;
    // int star = 1;
    for (int i =1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }
         System.out.println();
    }
}

    public static void main(String args[]){
        half_Inverted_Pyramid(4);
    }
}