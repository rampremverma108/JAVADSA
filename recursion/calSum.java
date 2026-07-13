public class sumNatural{
    public static void main(String args[]){
        int n = 5;
        System.out.print("Sum from 1 to "+n+" is: "+(calSum(n)));
    }

public static int calSum(int n){
    if(n == 1){
        return 1;
    }
    int Snm1 = calSum(n-1);
    int Sn = n + Snm1;
    return Sn;
}
}