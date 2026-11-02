import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Stacks1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("idk.txt"));

        while(file.hasNextLine())
        {
            String line = file.nextLine();
            Scanner scan = new Scanner(line);

            Stack<String> stack = new Stack<String>();

            while(scan.hasNext())
            {
                stack.push(scan.next());
            }

            System.out.println(stack);
            System.out.println("popping all items from the stack");

            while(!stack.isEmpty())
            {
                System.out.print(stack.pop() + " ");
            }

            System.out.println();

            scan.close();
        }

        file.close();
    }
}