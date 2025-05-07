//Program assignment 1a 
//Kennedi Jones
//8/30/24

import java.util.*;
class program_assignment1a {
    public static void main(String[] args) {
    //input 
    Scanner keyboard = new Scanner(System.in);
	System.out.print("What is your numerical temperature in degrees Celsius? ");
    double degC = keyboard.nextDouble();
	keyboard.close();
    //compute
    double degF= 9.0/5 *(degC+32);
    //output
    System.out.printf("%.3f degress Celsius is %.3f degress Fahrenheit.", degC, degF);
    }
}
