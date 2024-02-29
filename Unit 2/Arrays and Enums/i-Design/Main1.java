import java.util.Scanner;

public class Main1 {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] array = new int[n];
for (int i = 0; i < n; i++) {
array[i] = in.nextInt();
}
int sum = 0;
for (int i = 0; i < n; i++) {
sum += array[i];
}

System.out.println("The sum of the elements in the array is " + sum);

}}