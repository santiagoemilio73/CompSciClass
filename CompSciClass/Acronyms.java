import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class Acronyms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<String, String> acronyms = new TreeMap<>();
        int num = Integer.parseInt(input.nextLine());
        for (int i = 0; i < num; i++) {
            String line = input.nextLine();
            String[] parts = line.split(" - ", 2);
            acronyms.put(parts[0], parts[1]);
        }
        System.out.println("==== MAP CONTENTS ====");
        System.out.println(acronyms);
        System.out.println("==== READ LINES ====");
        while (input.hasNextLine()) {
            String line = input.nextLine();
            for (Map.Entry<String, String> entry : acronyms.entrySet()) {
                line = line.replaceAll(
                    "\\b" + entry.getKey() + "\\b",
                    entry.getValue()
                );
            }
            System.out.println(line);
        }
        input.close();
    }
}
