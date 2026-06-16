import java.util.Arrays;

public class Sort{
        public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
            //Arrays.sort(arr);

        //agr hame kuch numbers tk he sort krne hai to starting and ending num de kr kr skte hain

        Arrays.sort(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
        }
    }
