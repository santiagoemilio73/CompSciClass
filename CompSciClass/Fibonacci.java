import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int dih) {
        if (dih <= 1) {
            return dih;
        }
        return fibonacci(dih - 1) + fibonacci(dih - 2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println("danny's number is " + fibonacci(n));
    }
}