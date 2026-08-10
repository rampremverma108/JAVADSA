import java.util.ArrayList;
public class PairSUM{
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        boolean found = false;

        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    System.out.println("Pair found: (" + list.get(i) + ", " + list.get(j) + ")");
                    found = true;
                }
            }
        }

        if(!found){
            System.out.println("No pair found with the given sum.");
        }
    }
}