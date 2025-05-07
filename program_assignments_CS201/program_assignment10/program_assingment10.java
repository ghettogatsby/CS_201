package program_assignment10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class program_assingment10 {
     public static void main(String[] args) {

        Scanner keyboard= new Scanner( System.in);
        System.out.print("Enter the dictionary file name:");
        String file_name= keyboard.next();
        System.out.print("How many numbers do you want to read?:");
        int numbers_to_read= keyboard.nextInt(); 
        int numbers_read=0;
        int total_count=0; 
        //using file as input
        int[] dict= new int[numbers_to_read];
        
        Scanner inputstream=null;
        try
        {
          inputstream= new Scanner(new File(file_name));
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Error opening the file.");
            System.exit(0);
        }
        
        while (inputstream.hasNext() && numbers_read < numbers_to_read && numbers_to_read <= 15) 
        {
            int numbers= inputstream.nextInt();
            dict[numbers_read]=numbers; 
            System.out.println(numbers);
            total_count= total_count + numbers;
            numbers_read++;
            
             
        }
        System.out.printf("The toal is: %d",total_count );
 
        if (numbers_to_read > 15) {
            System.out.println("User has entered a value that is not possible due to the length of the file. ");
        } 
         

        
        
       


       keyboard.close();
    }
}
