import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String str = String.valueOf(a);
        char ch[] = str.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length-1];
        ch[ch.length-1] = temp;
        String str2= String.valueOf(ch);
        System.out.println(Integer.parseInt(str2));
     
    }
    
}
