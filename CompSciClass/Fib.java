import java.math.BigInteger;
import java.util.Scanner;

public class Fib {
    public static BigInteger fibonacci(int dih) {
        if (dih <= 1) {
            return BigInteger.valueOf(dih);
        }
        BigInteger[] fib = new BigInteger[dih + 1];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        for (int alex = 2; alex <= dih; alex++) {
            fib[alex] = fib[alex - 1].add(fib[alex - 2]);
        }
        return fib[dih];
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int dih = input.nextInt();
        long danny = System.currentTimeMillis();
        BigInteger result = fibonacci(dih);
        long time = System.currentTimeMillis() - danny;
        System.out.println("Fibonacci number: " + result);
        System.out.println("Time: " + time + " ms");
    }
}