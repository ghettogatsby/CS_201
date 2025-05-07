//In class exercise 4 
//Question 1
//Kennedi Jones
//9/20/24

import java.util.*; 

public class exercise4a {
   public static void main(String[] args) {
    //input
    Scanner keyboard= new Scanner(System.in);
    System.out.println("Enter triangle size: ");
    int triangle_size= keyboard.nextInt();
    keyboard.close();

    //process + output  
    for (int i = 1; i <= triangle_size; i++) {//outer loop
        for (int j = 1; j <= 2*i-1; j++) {//inner loop
        System.out.print("*");
        } 
        System.out.println();
    }

}

}