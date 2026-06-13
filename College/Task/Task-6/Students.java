import java.util.Scanner;

record Student(int rollNo, String studentName, String dept) {

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
        sc.nextLine();

        Student[] students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String studentName = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            students[i] = new Student(rollNo, studentName, dept);
            System.out.println("Test case");
        }

        System.out.println("\nStudent Details:");

        for (Student student : students) {
            student.displayDetails();
            System.out.println();
        }
    
        // sc.close();
    }
}