//Stack implementation using ArrayList in Java
import java.util.ArrayList;

public class stackCreationArrayList {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
        //pop
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
        
    public static void main(String[] args){
        
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

    System.out.println("Print the stack without removing the elements");
    for(int i = 0; i < s.list.size(); i++){
            System.out.print(s.list.get(i)+" ");
        }
    System.out.println();

    System.out.println("Print the stack by removing the elements");
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    System.out.println();

    }
}