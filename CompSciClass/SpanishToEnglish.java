import java.util.*;

public class SpanishToEnglish {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, String> words = new TreeMap<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String spanish = input.next();
            String english = input.next();
            words.put(spanish, english);
        }

        System.out.println("==== MAP CONTENTS ====");
        System.out.println(words.toString()
                .replace(", ", "\n")
                .replace("{", "{")
                .replace("}", "}"));
        System.out.println();
        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            if (line.isEmpty()) {
                continue;
            }
            String[] sentence = line.split(" ");
            System.out.println(line);
            for (int i = 0; i < sentence.length; i++) {
                sentence[i] = words.getOrDefault(
                    sentence[i], sentence[i]);
            }
            System.out.println(String.join(" ", sentence));
        }
        input.close();
    }
}
