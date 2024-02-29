import java.util.Arrays;
import java.util.Scanner;
class Main5{

public static void main(String args[])
{
//Fill your code here
int n;
Scanner sc = new Scanner(System.in);

System.out.println("Enter the number of elements in the array");

n = sc.nextInt();

int [] arr = new int[n];

System.out.println("Enter the elements in the array");
for(int i=0; i<n; i++){
arr[i] = sc.nextInt();
}
Arrays.sort(arr);
double m;
if(arr.length % 2 == 0){

m=((double)arr[arr.length/2]+(double)arr[arr.length/2-1])/2;
}
else{



m = (double)arr[arr.length/2];


}


System.out.println("The median of the array is "+String.format("%.2f",m));
}
}