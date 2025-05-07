package program_assignment9;


import java.util.*;

public class program_assignment9 {
    public static void main(String[] args)
    {
       Ledger l1= new Ledger(10);
       Scanner keyboard= new Scanner(System.in);
       System.out.println("How many sales will you enter?:");
       int max= keyboard.nextInt();
       System.out.print("Enter a sale amount:");
       double sale= keyboard.nextDouble();
       double v = 100.0;
       for (int i = 1; i < max; i++) 
       {
        System.out.print("Enter a sale amount:");
        sale= keyboard.nextDouble();
        l1.addSale(sale);
       }
       System.out.printf("Number of sales made: %d.",l1.getNumberOfSales());
       System.out.println();
       System.out.printf("Total sales value: $%.2f",l1.getTotalSales());
       System.out.println();
       System.out.printf("Average sale value: $%.2f", l1.getAverageSale());
       System.out.println();
       System.out.printf("Number of sales above $%.2f: %d", v, l1.getCountAbove(v));
       keyboard.close();

    }
    
   
}
