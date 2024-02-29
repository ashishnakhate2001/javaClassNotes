import java.util.*;

class Main7 {

public static void main(String args[]) {

//Fill your code here
Scanner sc = new Scanner(System.in);
int sum =0;
int a;
int b=0;

while(b == 0){
a = sc.nextInt();

if(a ==-999){
b=1;
}
else{
sum = sum+a;
}
}
System.out.println("The sum is "+sum);


}}