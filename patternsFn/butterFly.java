public class butterFly{

public static void butterrFlyPattern(int n){
    //1st halfand
    //  1st star
    for(int i=1; i<=n; i++){
        for(int j =1; j<=i; j++){
            System.out.print("*");
        }

        //space 2*(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //star -i 2nd star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //2nd half
    for(int i=n; i>=1; i--){

        for(int j =1; j<=i; j++){
            System.out.print("*");
        }

        //space 2*(n-i)
        for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
        }

        //star -i last star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String args[]){
        butterrFlyPattern(10);
    }
}


//OUTPUT ButterFly
//   *      *
//   **    **
//   ***  ***
//   ********
//   ********
//   ***  ***
//   **    **
//   *      *