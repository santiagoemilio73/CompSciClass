import java.util.*;
public class Relationships {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Set<String>> people = new TreeMap<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String person = input.next();
            String relative = input.next();
            people.putIfAbsent(person, new TreeSet<>());
            people.get(person).add(relative);
        }
        for (String person : people.keySet()) {
            System.out.print(person + " is related to ");
            System.out.println(
                String.join(" ", people.get(person)));
        }
        input.close();
    }
}