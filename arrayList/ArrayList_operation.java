import java.util.ArrayList;

public class ArrayList_representation{
    public static void main(String[] args){
    //its same as Classname objectname = new Classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list2.add("Hello");
        list2.add("World");
        System.out.println(list2);
    }
}