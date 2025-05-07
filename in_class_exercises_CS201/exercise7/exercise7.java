package exercise7;

public class exercise7 {
    public static void main(String[] args) 
    {
        Fraction f1= new Fraction(2, 3);
        f1.output();
        f1.set_top(1);
        f1.output();
        System.out.printf("%.2f%%\n", f1.calculate());
      

    }

   
}
