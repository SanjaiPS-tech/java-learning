package College.Quiz_codes;

public class Ex3 {
    public static void main(String[] args) {
        double d = 100.04;
        // Explicit type casting by forcefully getting data from long datatype to
        // integer type
        long l = (long) d;
        // Explicit type casting
        int i = (int) l;
        System.out.println("Double value " + d);
        System.out.println("Long value " + l);
        System.out.println("Int value " + i);
    }
}