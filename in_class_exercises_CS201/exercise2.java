//In class exercise 2
//Kennedi Jones
//9/6/24
import java.util.*;
class exercise2 {
    public static void main(String[] args) {
        //input 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = keyboard.nextInt();
        keyboard.close();
        boolean flag= true;

        //Alg 1 
        if (year%4==0) { 
            flag=false; 
        } else if (year%100==0){ 
            flag=true;
        } else if (year%400==0){ 
            flag=false;
        }else 
            flag=true;

        //Alg 2
        if (year%4==0) { 
            flag=true;
            if (year%100==0 && year%400!=0) {
            flag=false;    
            }
        } else 
            flag=false;
        
        //output
        if (flag==true) {
            System.out.println(year + " is a leap year.");   
        } else 
            System.out.println(year + " is a common year.");
        
}
}