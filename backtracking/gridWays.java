public class GridWays{
    public static int gridRoot(int i, int j, int n, int m){
        //only move right and down
        //base case
        if(i == n-1 && j == m-1){   //condition for last cell
        return 1;
        }else if(i == n || j == n){  //boundry condition
            return 0;
        }
        int w1 = gridRoot(i+1, j, n, m);
        int w2 = gridRoot(i, j+1, n, m);
        return w1 + w2;
    }

    public static void main(String args[]){
        int n = 3 , m = 3;
        System.out.println("There is the way to get goal: "+gridRoot(0, 0, n, m));
    }
}