public class floydTringle{
    public static void main(String args[]){
        int number = 1;
        for(int line =1; line<=5; line++){
            for(int count=1; count<= line; count++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}