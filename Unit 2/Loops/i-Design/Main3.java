import java.util .*;

class Main3
{

public static void main(String args[]){

//Fill your code here
Scanner sc = new Scanner(System.in);

int a= sc.nextInt();
int z=1;

for(int i=a;i>=1; i -- ){
for(int j=a; j>=z;j -- ){
System.out.print(j+" ");
}
if(z <= a){
z++;
}


System.out.println();

}
}
}