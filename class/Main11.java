import java.util.HashSet;

public class Main11 {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 8, 3, 5 };
        int arr2[] = { 1, 2, 1, 3, 1 };

        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            set.add(ele);
        }

        for (int ele1 : arr2) {
            if (set.contains(ele1)) {
                System.out.println(ele1);
            }
        }
    }
}

