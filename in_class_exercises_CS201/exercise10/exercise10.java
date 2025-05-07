//In class exercise 10
//Kennedi Jones
//CS 201
//11/6/2024

package exercise10;

import java.util.*; 
import java.io.*;

public class exercise10 {
    public static void main(String[] args) {
        //PART 1
        //loading the dictionary from the file into array 
        Scanner keyboard= new Scanner( System.in);
        System.out.print("Enter the dictionary file name:");
        String file_name= keyboard.next();
        int i=0;
        System.out.println(file_name);

        //using file as input
        String[] dict= new String[10];
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
        
        while (inputstream.hasNext()) 
        {
            String word= inputstream.nextLine();
            dict[i]=word;
            //System.out.println(dict[i]);
            i++;
        }

        //PART 2- search UI
        while (true) 
        {
            System.out.print("Enter a word to search for: ");
            String target = keyboard.nextLine();
            if (target.equals("stop")) //target=="stop"
            {
                System.out.println("Bye!");
                break; //System.exit(0);
            }
            //search the dictionary for the word/target- linear search algorithm
            boolean flag= false; //false means the word/target was not found, true means found
            for (int j = 0; j < dict.length; j++) 
            {
                if (target.equals(dict[j])) 
                {
                    flag= true; 
                    System.out.println(target + " is found at position "+ j);
                } 
              
            }
            
            if (flag==false) 
            {
                System.out.println(target + " was not found." );
            }
            


        }


       keyboard.close();
    }
}
