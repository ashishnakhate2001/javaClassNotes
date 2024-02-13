public class Program7 {

    public static void main(String[] args) {

        //find element in array found in only one time and all other elements are found in pair
        int[] arr = {1,1, 2, 3, 4, 5, 6, 6, 5, 4, 3, 2};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        System.out.println("Element found only one time: " + result);
       

    }
}
