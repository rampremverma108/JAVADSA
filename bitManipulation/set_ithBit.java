import java.util.Scanner;
public class ith_bit{
public static int set_ithBit(int n, int i ){
    int bitMask = 1<<i;
    return n | bitMask;

}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number of get Ith bit : ");
    int n = sc.nextInt();
    System.out.print("Input place to know Ith bit : ");
    int i = sc.nextInt();
    System.out.println(set_ithBit(n, i));
}
}
//OUTPUT: 14   if n = 20, i =2