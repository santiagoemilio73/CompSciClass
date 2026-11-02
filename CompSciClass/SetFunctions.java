import java.util.*;
public class SetFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line1 = input.nextLine();
            if (line1.trim().isEmpty()) {
                continue;
            }
            if (!input.hasNextLine()) {
                break;
            }
            String line2 = input.nextLine();
            Set<Integer> setOne = new TreeSet<>();
            Set<Integer> setTwo = new TreeSet<>();
            for (String num : line1.trim().split("\\s+")) {
                setOne.add(Integer.parseInt(num));
            }
            for (String num : line2.trim().split("\\s+")) {
                setTwo.add(Integer.parseInt(num));
            }
            Set<Integer> union = new TreeSet<>(setOne);
            union.addAll(setTwo);
            Set<Integer> intersection = new TreeSet<>(setOne);
            intersection.retainAll(setTwo);
            Set<Integer> differenceAB = new TreeSet<>(setOne);
            differenceAB.removeAll(setTwo);
            Set<Integer> differenceBA = new TreeSet<>(setTwo);
            differenceBA.removeAll(setOne);
            Set<Integer> symmetricDifference = new TreeSet<>(union);
            symmetricDifference.removeAll(intersection);
            System.out.println("Set one " + setOne);
            System.out.println("Set two " + setTwo);
            System.out.println("union - " + union);
            System.out.println("intersection - " + intersection);
            System.out.println("difference A-B - " + differenceAB);
            System.out.println("difference B-A - " + differenceBA);
            System.out.println("symmetric difference " + symmetricDifference);
        }
        input.close();
    }
}