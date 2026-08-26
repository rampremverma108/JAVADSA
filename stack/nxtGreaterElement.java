import java.util.*;

public class nxtGreaterElement{
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        Stack<Integer> stack = new Stack<>();
        int nxtGreater[] = new int[arr.length];
        
        for(int i = arr.length-1; i>=0; i--){
            //1 while
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }
            //2 if else
            if(stack.isEmpty()){
                nxtGreater[i] = -1;
            }else {
                nxtGreater[i] = arr[stack.peek()];
            }
            //3 push in stack
            stack.push(i);
        }

        for(int i =0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i]+ " ");
        }
        System.out.println();
    }
}