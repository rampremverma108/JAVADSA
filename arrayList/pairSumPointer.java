import java.util.ArrayList;

public class PairSumPointer {

      public static boolean pairSum2(ArrayList<Integer> list, int target) {
            int bp = -1; // breaking point
            int n = list.size();
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
                }
            }
            int lp = (bp == -1) ? 0 : bp + 1; // smallest element
            int rp = (bp == -1) ? n - 1 : bp; // largest element
            while(lp != rp) {
                //case 1
                if(list.get(lp) + list.get(rp) == target) {
                    return true;
                }

                //case 2
                if(list.get(lp) + list.get(rp) < target) {
                    lp = (lp + 1) % list.size();
                } else {
                //case 3
                    rp = (n + rp - 1) % n;
                }
            }
            return false;
        }

    public static void main(String[] args) {

  

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 8;
       System.out.println(pairSum2(list, target));
}
}