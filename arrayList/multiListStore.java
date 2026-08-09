import java.util.ArrayList;

public class MultiListStore {
    public static void main(String[] args) {
       
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        //first list
        ArrayList<Integer> list1 = new ArrayList<>();
        // second list 
        ArrayList<Integer> list2 = new ArrayList<>();
        //third list
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int i=1; i<=5; i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        multiList.add(list1);
        multiList.add(list2);    
        multiList.add(list3);
        System.out.println(multiList);

        //nested for loop to print each list
        for(int i=0; i<multiList.size(); i++){
            ArrayList<Integer> currList = multiList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
         }
    }
}