import java.util.ArrayList;
public class maxArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(6);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("The maximum value in the ArrayList is: " + max);
    }
}