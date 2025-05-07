package exercise6;

import java.util.*;

public class Time {
    //data fields
    private int hour;
    private int minutes;
    private int second; 

    //methods
    public void input()
    {
       Scanner keyboard= new Scanner(System.in);
       System.out.print("Enter hour: ");
       hour = keyboard.nextInt();
       System.out.print("Enter minute: ");
       minutes = keyboard.nextInt();
       System.out.print("Enter second: ");
       second = keyboard.nextInt();
       keyboard.close();
       
    }

    public void print()
    {
       System.out.println(hour+":"+minutes+":"+second);

    }
    
}
