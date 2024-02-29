import java.util.*;
class Main2{

public static void main(String args[]){

//Fill your code here
int n;
String flag ="Compatible";
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
int arr[] =new int[n];
int arr2[] =new int[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

for(int i=0;i<n;i++){
arr2[i]= sc.nextInt();
}
for(int j=0;j<n;j++){

if(arr[j]<arr2[j]){
flag ="Incompatible";
break;

}}

System.out.println(flag);
    
    }
    }