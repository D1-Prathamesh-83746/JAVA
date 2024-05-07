import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        int studentCount = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display all students sorted on Roll No");
            System.out.println("3. Display all students sorted on Name");
            System.out.println("4. Display all students sorted on Marks in descending order");
            System.out.println("5. Display all students sorted on Course");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (studentCount < 10) {
                        System.out.print("Enter Roll No: ");
                        int rollno = scanner.nextInt();
                        System.out.print("Enter Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Marks: ");
                        double marks = scanner.nextDouble();
                        System.out.print("Enter Course: ");
                        String course = scanner.next();
                        students[studentCount++] = new Student(rollno, name, marks, course);
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Cannot add more students. Array is full.");
                    }
                    break;
                case 2:
                    Arrays.sort(students, 0, studentCount);
                    displayStudents(students, studentCount);
                    break;
                case 3:
                    Arrays.sort(students, 0, studentCount, Comparator.comparing(Student::getName));
                    displayStudents(students, studentCount);
                    break;
                case 4:
                    Arrays.sort(students, 0, studentCount, Comparator.comparing(Student::getMarks).reversed());
                    displayStudents(students, studentCount);
                    break;
                case 5:
                    Arrays.sort(students, 0, studentCount, Comparator.comparing(Student::getCourse));
                    displayStudents(students, studentCount);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // Method to display all students
    public static void displayStudents(Student[] students, int count) {
        if (count == 0) {
            System.out.println("No students added yet.");
            return;
        }
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }
}
