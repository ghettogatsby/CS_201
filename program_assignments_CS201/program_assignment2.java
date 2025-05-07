//Program Assingment 2
//Kennedi Jones
//9/6/24

import java.util.*;

public class program_assignment2 {

    public static void main(String[] args) {
        // input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of packages purchased: ");
        int packages_purchased = keyboard.nextInt();
        keyboard.close();
       
        double total= (packages_purchased * 99);
        double discount40 = 0.4;
        double discount30 = 0.3;
        double discount20 = 0.2;
        double discount10 = 0.1;
        double discount = 0.0;

        //compute
        if (packages_purchased>= 100) {
            discount = discount40;
        } else if (packages_purchased >= 50) {
            discount = discount30;
        } else if (packages_purchased >= 20) {
            discount = discount20;
        } else if (packages_purchased >= 10) {
            discount = discount10;
        }

        double discount_amount= (total * discount); 
        double totalAmount= (total - discount_amount);
        
        //output
        if (discount > 0) {
            System.out.printf("Amount of discount is $%.2f. The total amount after discount is: $%.2f.", discount_amount, totalAmount);
        } else {
            System.out.printf("No discount applicable. The total amount is: $%.2f.", totalAmount);
        }
        
        
          

        
    }
}