import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    // Calculate grade based on marks
    public String getGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Marks: " + marks + ", Grade: " + getGrade();
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Student[] students = new Student[numberOfStudents];

        // Input student details
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Enter Marks: ");
            double marks = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            students[i] = new Student(name, rollNumber, marks);
        }

        // Display student details and grades
        System.out.println("\nStudent Results:");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
