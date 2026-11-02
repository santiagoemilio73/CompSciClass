import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.trim().isEmpty()) {
                continue;
            }
            String[] nums = line.trim().split("\\s+");
            Set<Integer> odds = new LinkedHashSet<>();
            Set<Integer> evens = new LinkedHashSet<>();
            Set<Integer> perfects = new LinkedHashSet<>();
            for (String num : nums) {
                int n = Integer.parseInt(num);
                if (n % 2 == 0) {
                    evens.add(n);
                } else {
                    odds.add(n);
                }
                if (isPerfect(n)) {
                    perfects.add(n);
                }
            }
            System.out.println("ODDS: " + odds);
            System.out.println("EVENS: " + evens);
            System.out.println("PERFECTS: " + perfects);
        }
        input.close();
    }
    public static boolean isPerfect(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}