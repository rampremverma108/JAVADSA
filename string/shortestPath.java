//Given a route containing 4 direction(E,W,N,S), firnd the shortest path to reach direction.

import java.util.*;

public class Path{
    public static float getPath(String direction){
        int x =0;
        int y =0;
        for(int i =0; i<direction.length(); i++){
            char dir = direction.charAt(i);
            if(dir == 'S'){
                y--;
            }else if(dir == 'N'){
                y++;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }
        }
         int X2 = (x*x);
         int Y2 = (y*y);

        return (float)Math.sqrt(X2 +Y2);
    }
    public static void main(String args[]){
        String direction = "NSEW";
        System.out.println(getPath(direction));
    }
}