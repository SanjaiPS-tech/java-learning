import java.util.Scanner;

class Student {
    int rollNo;
    String studentName;
    String dept;

    void getDetails(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Department: ");
        dept = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + studentName);
        System.out.println("Department  : " + dept);
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int count = sc.nextInt();

        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            students[i] = new Student();
            students[i].getDetails(sc);
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < count; i++) {
            students[i].displayDetails();
        }
    }
}