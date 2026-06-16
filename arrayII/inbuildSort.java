import java.util.Arrays;
import java.util.Collections;

public class Sort{

    public static void reverseOrder(Integer nu[]){
       Arrays.sort(nu, Collections.reverseOrder());
        System.out.println(Arrays.toString(nu));
    }


        public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        Integer nu[] = {2,8,4,6,3};
        //Arrays.sort(arr);
        //agr hame kuch numbers tk he sort krne hai to starting and ending num de kr kr skte hain

        Arrays.sort(arr, 0, 3);
        System.out.println("Partially sorted arr (0 to 2): " + Arrays.toString(arr));
       reverseOrder(nu);
        }
    }
