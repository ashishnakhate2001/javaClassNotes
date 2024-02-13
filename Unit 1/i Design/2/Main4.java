public class Main4 {

    public static void main(String args[]){
        for(String arg : args){
            try {
                Integer.parseInt(arg);
                System.out.println("The given input is an integer");
            } catch(Exception e) {
                System.out.println("The given input is a string");
            }
        }
    }
}
