
import java.util.Scanner;

public class HistogramI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] chars = line.split(" ");
            boolean[] counted = new boolean[chars.length];
            for (int i = 0; i < chars.length; i++) {
                if (!counted[i]) {
                    int count = 0;
                    for (int j = i; j < chars.length; j++) {
                        if (chars[i].equals(chars[j])) {
                            count++;
                            counted[j] = true;
                        }
                    }
                    System.out.println(chars[i] + " count = " + count);
                }
            }
        }
        input.close();
    }
}
