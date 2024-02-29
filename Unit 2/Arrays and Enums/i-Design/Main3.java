import java.util.Scanner;
public class Main3 {

public static void main(String[] args) {
//fill your code here
Scanner sc = new Scanner(System.in);
int n,z,j;
int a=0;
int b=0;
n = sc.nextInt();
z= n-1;
int arr[] = new int[n];

for(int i=0; i<n; i++){
arr[i] = sc.nextInt();
}

for(int i=0; i<n; i++){

for(j=0; j<n; j++){

if(arr[i] == arr[j]){
break;
}
}

if(i == j){
    b++;
}
}
    System.out.println(b);
}

}