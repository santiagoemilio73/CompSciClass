import java.util.Stack;
import java.util.Scanner;

public class SyntaxChecker
{
    public static boolean checkSymbols(String line)
    {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < line.length(); i++)
        {
            char ch = line.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{' || ch == '<')
            {
                stack.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}' || ch == '>')
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                char open = stack.pop();

                if(ch == ')' && open != '(')
                {
                    return false;
                }

                if(ch == ']' && open != '[')
                {
                    return false;
                }

                if(ch == '}' && open != '{')
                {
                    return false;
                }

                if(ch == '>' && open != '<')
                {
                    return false;
                }
            }
        }

        if(stack.isEmpty())
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine())
        {
            String line = input.nextLine();

            boolean correct = checkSymbols(line);

            if(correct)
            {
                System.out.println(line + " is correct.");
            }
            else
            {
                System.out.println(line + " is incorrect.");
            }
        }
    }
}