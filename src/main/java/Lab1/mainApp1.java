package Lab1;

public class mainApp1 {
    public static void main(String[] args) {
        System.out.println("COMP3111 - Lab 1");
        System.out.println("Power and factorial calculations");
        int b = 2;
        int n = 11;
        System.out.println(b + " to power " + n + " = " + myLibrary.Power(b, n));
        System.out.println(n + "! = " + myLibrary.factorial(n));
        System.out.println("Program Ended");
    }
}
