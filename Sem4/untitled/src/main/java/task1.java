import java.util.Arrays;

import static java.util.Arrays.sort;

public class task1 {
    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5,6};
        int[] array = {111,102,33,44,5,6};
        int target = 6;

        System.out.println(find(array, target));
        System.out.println((Arrays.binarySearch(array, target) >=0));

    }
    public static boolean find(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return true;
        }
        return false;
    }
}
