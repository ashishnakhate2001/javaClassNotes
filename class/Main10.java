

public class Main10 {
   

    public static void main(String[] args) {

        int arr[] = { 4, 2, 8, 3, 5 };
        
        int arr2[] = { 1, 2, 1, 3, 1 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
  