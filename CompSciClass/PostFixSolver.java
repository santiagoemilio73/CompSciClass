import java.util.Stack;
import java.util.Scanner;

public class PostFixSolver
{
    public static double solve(String line)
    {
        Stack<Double> stack = new Stack<Double>();
        Scanner scan = new Scanner(line);

        while(scan.hasNext())
        {
            String token = scan.next();

            if(token.equals("+"))
            {
                double num2 = stack.pop();
                double num1 = stack.pop();
                double answer = num1 + num2;
                stack.push(answer);
            }
            else if(token.equals("-"))
            {
                double num2 = stack.pop();
                double num1 = stack.pop();
                double answer = num1 - num2;
                stack.push(answer);
            }
            else if(token.equals("*"))
            {
                double num2 = stack.pop();
                double num1 = stack.pop();
                double answer = num1 * num2;
                stack.push(answer);
            }
            else if(token.equals("/"))
            {
                double num2 = stack.pop();
                double num1 = stack.pop();
                double answer = num1 / num2;
                stack.push(answer);
            }
            else
            {
                double num = Double.parseDouble(token);
                stack.push(num);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while(input.hasNextLine())
        {
            String line = input.nextLine();

            if(line.length() > 0)
            {
                double answer = solve(line);
                System.out.println(line + " = " + answer);
            }
        }
    }
}