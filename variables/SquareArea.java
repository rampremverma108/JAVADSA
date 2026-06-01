import java.util.*;
public class SquareArea{
    public static void main(String[] args){
        System.out.print("Enter side of Square in meter to get Area of Square:");
    Scanner sc = new Scanner(System.in);
    int side = sc.nextInt();
     int Area = side*side;
     System.out.println("Area of Square: "+ Area+" m^2");    }
}