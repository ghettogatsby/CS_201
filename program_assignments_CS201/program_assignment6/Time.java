package program_assignment6;


import java.util.*;

public class Time {
    //data fields
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minutes;
    private int second;

    //methods
    public void input()
    {
    
       Scanner keyboard= new Scanner(System.in);
       System.out.print("Enter year: ");
       year = keyboard.nextInt();
       System.out.print("Enter month: ");
       month = keyboard.nextInt();
       System.out.print("Enter day: ");
       day = keyboard.nextInt();
       System.out.print("Enter hour: ");
       hour = keyboard.nextInt();
       System.out.print("Enter minute: ");
       minutes = keyboard.nextInt();
       System.out.print("Enter second: ");
       second = keyboard.nextInt();
       keyboard.close();
       
    }

   
    public void PrintMilitaryTime()
    {
        //Check for invalid inputs 
        if (hour > 24 || hour < 0 || minutes < 0 ||  minutes > 59 || second < 0 || second > 59)
        {
         System.out.println("User has entered an invalid input. Please try again.");
        }
        else
          System.out.println(day+"-"+month+"-"+year+", "+hour+":"+minutes+":"+second);

       
    }

    public void PrintStandardTime()
    {
       String amOrPm;
       int hourFormat= hour; 
       //Determine correct hour format for standard time and military time
       if (hour >= 12) 
       {
          amOrPm= "PM";
          if (hour > 12)
          {
            hourFormat= hourFormat- 12; 
          }
       }
       else
          amOrPm="AM";
          if (hour ==0) 
          {
            hourFormat= 12;
          }

        //Check for invalid inputs 
        if (hour > 24 || hour < 0 || minutes < 0 ||  minutes > 59 || second < 0 || second > 59)
        {
         System.out.println("User has entered an invalid input. Please try again.");
        }
        else
        System.out.println(month+"-"+day+"-"+year+", "+hourFormat+":"+minutes+":"+second+" "+amOrPm);        
    }
}


