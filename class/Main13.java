import java.util.HashSet;
public class Main13
{
	public static void main(String[] args) {
	int a1[]= {10,20,30,40,60,30};
	int a2[]= {30,70,80,10,90,40,};
	HashSet<Integer> HashSet = new HashSet<>();
	for (int ele:a1){
	    HashSet.add(ele);
	    
	}
	for(int ele:a2){
	    if(HashSet.contains(ele)){
	        System.out.println(ele);
	    }
	}
}
}

