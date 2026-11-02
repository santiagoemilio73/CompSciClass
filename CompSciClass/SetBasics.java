import java.util.*;
public class SetBasics {
    public static void main(String[] args) {
        String input = "a b c d e f g h a b c d e f g h i j k";
        process(input);
        input = "one two three one two three six seven one two";
        process(input);
        input = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
        process(input);
    }
    public static void process(String input) {
        String[] words = input.split(" ");
        Set<String> set = new TreeSet<String>(Arrays.asList(words));
        List<String> list = new ArrayList<String>(Arrays.asList(words));
        Set<String> dupes = new TreeSet<String>();
        for (String word : list) {
            if (Collections.frequency(list, word) > 1) {
                dupes.add(word);
            }
        }
        System.out.println("Original List : " + input);
        System.out.println("Uniques : " + set);
        System.out.println("Dupes : " + dupes);
        System.out.println();
    }
}