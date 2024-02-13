import java.util.ArrayList;
import java.util.Scanner;


class Student {
    private String studentName;
    private int registerNumber;
    private static int noOfStudents = 0;

    public Student(String studentName, int registerNumber) {
        this.studentName = studentName;
        this.registerNumber = registerNumber;
        noOfStudents++;
    }

    public static int getNoOfStudents() {
        return noOfStudents;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student details :");
        ArrayList<Student> students = new ArrayList<>(); 
        while (true) {
            System.out.println("Enter the register number :"); 
            int registerNumber = scanner.nextInt(); 
            scanner.nextLine();

            System.out.println("Enter the name :");
            String name = scanner.nextLine();

            students.add(new Student(name, registerNumber));

            System.out.println("Do you want to continue [ Yes / No ]:"); // Fixed printIn to println
            String continueInput = scanner.nextLine(); // Removed 0 after nextLine

            if (!continueInput.equalsIgnoreCase("Yes")) { // Fixed equalslgnoreCase to equalsIgnoreCase
                break;
            }

            System.out.println("Number of Students are : " + Student.getNoOfStudents());

            for (int i = 0; i < students.size(); i++) {
                System.out.println("Details of student " + (i + 1) +":");
                System.out.println("Register Number : " + students.get(i).getRegisterNumber());
                System.out.println("Name : " + students.get(i).getStudentName());
            }
        }
    }
}
    
