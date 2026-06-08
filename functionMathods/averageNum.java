import java.util.*;

public class averageNum{
public static float avg(float n1, float n2, float n3){
    float sum = n1+ n2 +n3;
    float average = sum/3;
    return average;
}
public static void main(String args[]){
    System.out.print("Enter 3 numbers to get an Average.\nEnter 1st No : ");
    Scanner sc = new Scanner(System.in);
    float n1 = sc.nextFloat();
    System.out.print("Enter 2nd No : ");
    float n2 = sc.nextFloat();
    System.out.print("Enter 3rd No : ");
    float n3 = sc.nextFloat();
    System.out.println(avg(n1,n2,n3));
}
}