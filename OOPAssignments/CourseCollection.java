package OOPAssignments;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String studentName;
    String grade;
    ArrayList<String> courses;

    public Student(String studentName, String grade) {
        this.studentName = studentName;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println("\nCourse added successfully!");
    }

    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println("\nCourse removed successfully!");
        } else {
            System.out.println("\nCourse " + course + " not found!");
        }
    }

    public void displayStudentInfo() {
        System.out.println("\n==== Student Information ====");
        System.out.println("Name: " + studentName);
        System.out.println("Grade: " + grade);
        System.out.println("Courses Enrolled: " + courses);
    }
}

public class CourseCollection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(name, grade);

        int choice;
        do {
            System.out.println("\n==== Course Management Menu ====");
            System.out.println("\n1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Display Student Info");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter course name to add: ");
                    String courseToAdd = scanner.nextLine();
                    student.addCourse(courseToAdd);
                    break;
                case 2:
                    System.out.print("Enter course name to remove: ");
                    String courseToRemove = scanner.nextLine();
                    student.removeCourse(courseToRemove);
                    break;
                case 3:
                    student.displayStudentInfo();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}