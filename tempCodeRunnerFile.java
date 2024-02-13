import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        int n;

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] numbers = new int[n];

        for(int i = 0; i < n; i++) {
            int nextInput = sc.nextInt();
            numbers[i] = nextInput;
        }

        int sum = 0;

        for(int i = 0; i < n; i++) {
            if(numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }

        System.out.println("The sum of the even numbers in the array is " + sum);
    }
}
            n = sc.nextInt();
        } else {
            System.out.println("Please enter an integer.");
            return;
        }

        int[] numbers = new int[n];

        for(int i=0; i<n; i++) {
            if (sc.hasNextInt()) {
                int nextInput = sc.nextInt();
                numbers[i] = nextInput;
            } else {
                System.out.println("Please enter an integer.");
                return;
            }
        }

        int sum = 0;

        for(int s : numbers) {
            if(s % 2 == 0) {
                sum = sum + s;
            }
        }

        System.out.println("The sum of the even numbers in the array is " + sum);
    }
}
