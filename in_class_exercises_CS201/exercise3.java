//In class exercise3
//Kennedi Jones
//9/13/24

public class exercise3 {
    
    public static void main(String[] args) {

    //procees+ output 
    //solution #1- using while loop
    System.out.println("Celsius\t\tFahrenheit");
    int counter=0;
    while(counter<=20) 
    {

      double f_temp = 1.8*counter +32;
      System.out.printf("%d\t\t%.1f\n", counter, f_temp);
      //System.out.println();
      counter++;

    }
     //solution #2
     for(;counter <=20; counter++)
    {
       double f_temp = 1.8*counter +32;
        System.out.printf("%d\t\t%.1f\n", counter, f_temp);

    }



    }
    
}