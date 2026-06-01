import java.util.*;

public class CircleAreaa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("To Calculate the Area of Circle...\nGive Radius:");
       float R = sc.nextFloat();
       float pi = 3.141f;
       float Area = (pi*R*R);
       System.out.println("Area of Circle: "+Area);
    }
}