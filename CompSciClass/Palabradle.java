import java.util.*;
import java.io.*;
public class Palabradle
{
 public static void main(String[] arg) throws IOException{
     ArrayList<String> words = new ArrayList<>();
     Scanner file = new Scanner(new File("words.txt"));
     while(file.hasNext()){
         String word = file.next().toLowerCase();
         if(word.length() == 6){
             words.add(word);
         }
     }
     System.out.println("Total words: "+ words.size());
     Random rand = new Random();
     for(int i=0; i<20; i++){
         System.out.println(words.get(rand.nextInt(words.size())));
        }        
        puzzle(words);   
}
public static void puzzle(ArrayList<String> words){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    String solution = words.get(rand.nextInt(words.size()));
    boolean solved =false;
    int guesses =0;
    while(!solved && guesses < 6){
        System.out.print("Please enter guess #" +(guesses + 1) + ": ");
        String guess = input.next();
        if(!words.contains(guess)){
            System.out.println("Not a valid guess.");
            continue;
        }
        guesses++;
        
        String feedback = "";
        for(int i =0; i<6; i++){
            char a = guess.charAt(i);
            char b = solution.charAt(i);
            if(a == b){
                feedback += Character.toUpperCase(a);
            }
            else if(solution.contains(a+"")){
                feedback+=a;
            }
            else{
                feedback += '*';
            }
            }
            System.out.println(feedback);
        if(guess.equals(solution)){
            solved =true;
            System.out.println("Congrats! you won in "+ guesses+" guesses");
                }  
            }
        if(!solved){
            System.out.println("You Lost, the word was "+ solution);
            }  
            System.out.println("Would you like to play again(y/n)");
            String again = input.next();
            if(again.equalsIgnoreCase("y")){
                puzzle(words);
            }else {
                System.out.println("Game Over");
            }
            }
            }
        
    











