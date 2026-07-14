public class PowerN{

public static int xPn(int x, int n){
    if( n == 0){
        return 1;
    }

return x * xPn(x, n-1);
}
    public static void main(String args[]){
        System.out.println(xPn(2,10));
    }
}