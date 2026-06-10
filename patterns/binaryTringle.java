public class binaryTringle{
    public static void main(String args[]){
        for(int line =1; line<=5; line++){
            for (int j = 1; j <= line; j++) {
            // if (j %2 !=0){
            //     System.out.print("1");
            // }else{
            //     System.out.print("0");
            // }
                if((line+j)%2 == 0){
                   System.out.print("1"); 
                }else{
                    System.out.print("0");
                }
           }
           System.out.println();
        }
        }
}