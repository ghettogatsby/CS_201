//In class exercise1
//Kennedi Jones
//8/28/24
import java.util.*;
class exercise1 {
    public static void main(String[] args) {
    //input 
    Scanner keyboard = new Scanner(System.in);
	System.out.print("What is your numerical temperature in degrees Fahrenheit? ");
    double degF = keyboard.nextDouble();
	keyboard.close();
    //compute
    double degC= 5.0/9*(degF-32);
    //output
    System.out.printf("%.3f degress Fahrenheit is %.3f degress centrigrade.", degF, degC);
    }
}
