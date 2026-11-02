import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class PQS{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("idk.txt"));
        while(file.hasNextLine())
        {
            String line = file.nextLine();
            Scanner scan = new Scanner(line);
            PriorityQueue<String> queue = new PriorityQueue<String>();
            while(scan.hasNext())
            {
                String word = scan.next();
                queue.add(word);
            }
            PQS test = new PQS();
            test.getMin(queue);
            test.toString(queue);
            test.getNaturalOrder(queue);
            scan.close();
        }
    }
    public void getMin(PriorityQueue<String> queue){
        System.out.println("minimum value");
        System.out.println(queue.element());
        System.out.println(" ");
    }
    public void getNaturalOrder(PriorityQueue<String> queue){
        System.out.println("natural order list");
        while(!queue.isEmpty()){
         System.out.println(queue.remove());
        }
    }
    public void toString(PriorityQueue<String> queue){
        System.out.println("Printing toString: " + queue);
    }
}