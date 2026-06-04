import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String sName = in.next();

        System.out.print("Enter Your Age : ");
        String sAge = in.next();

        System.out.print("Enter Your Dept : ");
        String sDept = in.next();

        System.out.print("Enter Your CGPA : ");
        String sCgpa = in.next();

        System.out.print("Name : ");
        System.out.println(sName);
        System.out.print("Age : ");
        System.out.println(sAge);
        System.out.print("Dept : ");
        System.out.println(sDept);
        System.out.print("CGPA : ");
        System.out.println(sCgpa);


    }
}
