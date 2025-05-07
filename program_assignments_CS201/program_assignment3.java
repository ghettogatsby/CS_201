//Program Assignment 3
//Kennedi Jones
//9/13/24

import java.util.*;
import java.util.Random;

public class program_assignment3 {
    public static void main(String[] args) {
        //input
        Scanner keyboard = new Scanner(System.in);
        char marble;
        System.out.print("Enter a marble color: ");
        marble = keyboard.next().charAt(0);
        String winner= ".";
        int red= 0;
        int yellow = 0;
        int blue= 0; 
        int total= 0;
        Random random = new Random();
        int decision= random.nextInt(1,3);
        
        //process + output
        while (marble != 'q' || marble != 'Q') 
        {
            //compare marble amount 
            if (red > blue && red > yellow) {
               winner= "the winner is red."; 
            } else if (blue > red && blue > yellow){
               winner= "the winner is blue.";
            } else if ( yellow > blue && yellow > red){
               winner= "the winner is yellow.";
            } else if (decision == 1) {
                winner= "the winner is blue.";
            } else if( decision == 2) {
                winner="the winner is red.";    
            } else 
                winner= "the winner is yellow.";


            if (marble == 'r' || marble == 'R'){
                red= red+ 1;
                System.out.print("Enter a marble color: ");
            } else if (marble=='y' || marble =='Y'){
                yellow= yellow+ 1;
                System.out.print("Enter a marble color: ");
            }else if (marble=='b' || marble=='B'){
                blue=blue+ 1;
                System.out.print("Enter a marble color: ");
            }else if (marble== 'q' || marble =='Q'){
                total= red + yellow + blue;
                System.out.printf("There are %d red marbles, %d yellow marbles and %d blue marbles. In total there are %d marbles. Out of three %s", red, yellow, blue, total ,winner);
            }else
                 System.out.println("User entered an invalid input. Please try again.");
            
             marble = keyboard.next().charAt(0);
        }
        keyboard.close();
    }
}
