import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class PalinList{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("idk.txt"));
        while(file.hasNextLine())
        {
            String line = file.nextLine();
            Scanner scan = new Scanner(line);
            Stack<String> stack = new Stack<String>();
            Queue<String> queue = new LinkedList<String>();
            while(scan.hasNext())
            {
                String word = scan.next();
                stack.push(word);
                queue.add(word);
            }
            System.out.println(stack);
            boolean isPalin =true;
            while(!stack.isEmpty())
            {
                if(!stack.pop().equals(queue.remove())){
                isPalin = false;
                }
            }
            System.out.print("The list of words you said were a ");
            if(isPalin == true){
                System.out.println("palindrone");
            }
            else{
                System.out.println("not a palidrone");
            }
            scan.close();
        }
    }
}