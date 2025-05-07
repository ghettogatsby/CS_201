//Program assignment 1b
//Kennedi Jones
//8/30/24

import java.util.*;
class program_assignment1b {
    public static void main(String[] args) {
    //input 
    Scanner keyboard = new Scanner(System.in);
	System.out.print("What is your number of female students in your class? ");
    double female = keyboard.nextDouble();
	System.out.print("What is the number of male students in your class?");
    double male= keyboard.nextDouble();
    keyboard.close();
    //compute
    double class_total= (female + male);
    double female_percentage= (female/class_total)* 100.0;
    double male_percentage = (male/class_total) *100.0;
    //output
    System.out.println("In your class of " + class_total + " people, " + female_percentage + "% are female and " + male_percentage + "% are male.");
}
}
