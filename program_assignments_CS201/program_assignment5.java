//Program assignment 5
//Kennedi Jones
//9/25/24

import java.util.*;

public class program_assignment5 
{
    public static void main(String[] args) 
    {
        //input 
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter an investment amount (i.e. 1000):  ");
        double investment_amount = keyboard.nextDouble();
        System.out.println("Enter an interest rate (i.e 9%):  ");
        double interest_rate= keyboard.nextDouble();
        keyboard.close();
      
        System.out.println("Years\t\tFuture Value");
        for (int years = 1; years <= 30 ; years++) {
            System.out.printf("%d\t\t%.2f\n", years, futureInvestmentValue(investment_amount, interest_rate, years));
            System.out.println();
        }
        
    }
 
    public static double futureInvestmentValue( double investment_amount, double interest_rate, int years) 
    {
        double future_investment = 0;
        interest_rate= (interest_rate/100);
        future_investment= investment_amount * Math.pow(1 + (interest_rate/12), 12*years) ;
        return future_investment;
    }
    
    
}
