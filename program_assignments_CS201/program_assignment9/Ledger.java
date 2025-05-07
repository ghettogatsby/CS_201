package program_assignment9;

public class Ledger {
    private double[] sale;
    private int salesMade;
    private int maxSales; 

    //methods
    public Ledger(int max)
    {
        maxSales= max;
        sale= new double[maxSales]; 
        salesMade= 0;  
    }

    public void addSale(double d)
    {
        sale[salesMade]= d; 
        salesMade++;
    }
        
    

    public int getNumberOfSales()
    {
        salesMade++;
        return salesMade;
    }

    public double getTotalSales()
    {
        double totalSales=0;
        for (int i = 0; i < salesMade; i++)
         {
            totalSales= totalSales + sale[i];   
        }
        return totalSales; 
    }

    public double getAverageSale()
    {
        double getTotalSales; 
        getTotalSales= getTotalSales()/salesMade;
        return getTotalSales; 
    }

    public int getCountAbove(double v)
    {
        int sales_above= 0;
        for (int i = 0; i < salesMade; i++) {
            if (sale[i] > v) {
               sales_above= sales_above+1;
            } 
        }
        return sales_above;
        
    }
}

