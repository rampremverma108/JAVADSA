public class filterDuplicate{
    public static void duplicateRecursive(int arr[], int key, int index){
        if( index == arr.length){
            return;
        }
           if (arr[index] == key){
            System.out.print(index+ " ");
           }
        
        duplicateRecursive(arr, key, index + 1);
    }

    public static void main(String args[]){
        int key = 2;
        int arr[] = {3,2,4,5,6,2,7,2,2};
        duplicateRecursive(arr, key, 0);
    }
    }
