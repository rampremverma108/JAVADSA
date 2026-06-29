public class checkPowerOfTwo{
    public static void checkPowerOfTwo(int n){
       //return (n&(n-1)) == 0;
       if( (n&(n-1)) == 0){
        System.out.println(n+" is the power of two");
       }else{
         System.out.println(n+" not the power of two");
       }
    }
    public static void main(String args[]){
        //System.out.println(checkPowerOfTwo(16));
        checkPowerOfTwo(16);
    }
}
//OUTPUT:- 2
