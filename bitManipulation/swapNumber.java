public class swapNum{
    public static void swap(int a, int b){
        a ^= b;
        b ^= a;
        a ^= b;
       System.out.println("After Swap -> a = " + a + ", b = " + b);
    }
    public static void main(String args[]){
        int a = 9;
        int b = 4;
        System.out.println("Before swap -> a = " + a + ", b = " + b);
        swap(a ,b);
    }
}