package OOPI;
import java.util.Scanner;

public class studentGrading{
    public void gradingSystem(){
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = getInput.nextLine();

        System.out.println("Enter your Registration Number: ");
        String regNo = getInput.nextLine();

        System.out.println("Enter the name of the unit you have missing marks: ");
        String unitName = getInput.nextLine();

        System.out.println("Enter your marks: ");
        int unitMarks = getInput.nextInt();

        char grade = 'Z';
        if(unitMarks>=70){
            grade = 'A';
        }else if(unitMarks>=60 && unitMarks<70){
            grade = 'B';
        }else if(unitMarks>=50 && unitMarks<60){
            grade = 'C';
        }else if(unitMarks>=40 && unitMarks<50){
            grade = 'D';
        }else if(unitMarks<40){
            grade = 'F';
        }else{
            System.out.println("Invalid grade. Kindly enter valid marks.");
        }

        System.out.println("\nStudent name: " + name);
        System.out.println("Registration Number: " + regNo.toUpperCase());
        System.out.println("Unit with missing marks: " + unitName);
        System.out.println("Marks scored: " + unitMarks);
        System.out.println("Grade: " + grade);

        getInput.close();
    }
    public static void main(String[] args) {
        studentGrading student = new studentGrading();
        student.gradingSystem();

    }
 

}

/*import java.util.Scanner;

public class studentGrading {
    public void gradingSystem() {
        Scanner getInput = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = getInput.nextInt();

        if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        getInput.close();
    }

    public static void main(String[] args) {
        studentGrading student = new studentGrading();
        student.gradingSystem();
    }
}*/
