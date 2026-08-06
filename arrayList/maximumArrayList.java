import java .util.ArrayList;
public class maximumArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(30);
        numbers.add(15);

        int max = findMaximum(numbers);
        System.out.println("The maximum value in the ArrayList is: " + max);
    }

    public static int findMaximum(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The list is empty.");
        }

        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}