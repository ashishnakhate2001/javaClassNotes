import java.lang.reflect.Array;
import java.util.*;

public class Main9 {

    public static void main(String[] args) {
        int arr[]={4,2,1,3,5};

    java.util.Arrays.sort(arr);

    //int index = java.util.Arrays.binarySearch(arr, 5);
    //System.out.println(index);
    // for(int a: arr){
    //     System.out.println(a);
    // }
    //    java.util.Arrays.fill(arr, 10);


    System.out.println(java.util.Arrays.copyOf(arr, 4));

    // for(int a: arr){
    //     System.out.println(a);
    // }

    int arr3[] = java.util.Arrays.copyOf(arr, 4);
    for(int a: arr3){
        System.out.println(a);
    }


     int arr2[] = java.util.Arrays.copyOfRange(arr, 0, 4);

    //  for(int a: arr2){
    //     System.out.println(a);
    //  }

}
    
}
