import java.util.ArrayList;

public class ArrayList_representation{
    public static void main(String[] args){
    //its same as Classname objectname = new Classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list2.add("Hello");
        list2.add("World");
        System.out.println(list2);

        int element = list.get(1);
        System.out.println(element);

        //delete
        list.remove(1);
        System.out.println(list);

        //set
        list.set(1, 5);
        System.out.println(list);

        //contains
        System.out.println(list.contains(5));

    //size
        System.out.println("Size of the list is: " + list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}