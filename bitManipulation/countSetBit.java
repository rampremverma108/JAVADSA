public class countSetBit{
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n =n>>1;
        }
    }
    public static void main(String args[]){
        System.out.println(countSetBit(15));
    }
}

//output: 4, in 15 there is 4 one.