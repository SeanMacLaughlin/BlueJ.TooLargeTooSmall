
/**
 * Write a description of class Main here.
 * @author (Sean MacLaughlin)
 * @version (2.5.19)
 */
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args ) {
        
        System.out.println("Pick a number 1-50");  
      
        Random rando = new Random();
        int number = rando.nextInt(50) -1; //Set range for random number
        int tries = 0; //Counter
        Scanner input = new Scanner(System.in);
        int userIn;
        int guessed;
        boolean win = false; 
        
        while(win == false) {
            System.out.println("Pick a number between 1 and 50");
            userIn = input.nextInt();
            guessed = userIn;
            tries++;
          

        if(userIn == number) {
            win = true;
            tries++;
            System.out.println("Right you are!");
            System.out.println("It only took you " + tries + " guesses!");
        } else if(userIn < number && userIn != guessed) {
            tries++;
            System.out.println("Too small");
        } else if(userIn > number && userIn != guessed) {
            tries++;
            System.out.println("Too large");
        } else if (userIn < number) {
            System.out.println("Too small");
        } else if (userIn > number) {
            System.out.println("Too large");
        }
        
    }
 }
}
