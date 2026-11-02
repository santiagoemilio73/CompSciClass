
import java.util.Scanner;

public class HistogramII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String[] chars = input.nextLine().split(" ");
            boolean[] counted = new boolean[chars.length];
            System.out.println("char 1---5----01---5");
            for (int i = 0; i < chars.length; i++) {
                if (!counted[i]) {
                    int count = 0;
                    for (int j = 0; j < chars.length; j++) {
                        if (chars[i].equals(chars[j])) {
                            count++;
                            counted[j] = true;
                        }
                    }
                    System.out.print(chars[i] + " ");
                    for (int k = 0; k < count; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
        input.close();
    }
}