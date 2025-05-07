//In class exercise 5
//Kennedi Jones
//9/23/24

import java.util.*; 

public class exercise5
 {
    public static void main(String[] args) 
    {
        instructions();
        while (true) //keep program running until user choose to quit. 
        {
        int choice = menu();

        if (choice == 3)
        {
            System.exit(0);
        } 
        else if (choice == 1 || choice ==2){
             draw_shape(choice);
        }
        else 
             System.out.println("User entered an invalid input. Please try again.");
       
        }
    }
    //method 1
    public static void instructions()
    {
       System.out.println("This program draws a diamond or a triangle with a size that the user selects \r\n" + //
                      "using a specific character that will be entered at the keyboard.\n");

    }
    
    //method 2
    // This function will return the size of the shape, same function for either of the shapes
    public static int menu()
    {
       System.out.println("1) Draw triangle ");
       System.out.println("2) Draw diamond ");
       System.out.println("3) Quit ");
       @SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter a choice:");
       int choice = keyboard.nextInt();
       return choice; 

    }
    //method 3 
    public static void draw_shape(int choice) 
    {
        //get size of the shape
        int size= get_size();

        //get the char that will be used to draw shape
        char c = get_char();

        if(choice==1)
        {
            //draw triangle
            draw_triangle(size, c);

        } 
        else if(choice==2)
        {
            //draw diamond
            draw_diamond(size, c);
        }
        
    }

    //method  4
    public static int get_size()
    {
       @SuppressWarnings("resource")
    Scanner keyboard = new Scanner(System.in);
       System.out.println("Enter the size:");
       int size= keyboard.nextInt();
       return size;
       
       
    }

    public static char get_char()
    {
        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a character:");
        char c= keyboard.next().charAt(0);
        return c; 
        
        
    }

    //method 6
    public static void draw_triangle ( int size, char c)
    {
     
      for (int i = 0; i <= size; i++) //outer loop decides the size of the shape
      {
        for (int j = 0; j < size - i ; j++)// first inner loop, padding spaces 
        {
            System.out.print(" ");
        }

        for (int k = 0; k < 2*i-1 ; k++) //second inner loop, display char
        {
            System.out.print(c);
        }
        System.out.println();
      }
    }
    
   //method 7
   public static void draw_diamond(int size, char c)
   {
       draw_triangle(size, c);
       draw_bottom(size, c);
   }
   
   //method 8
   public static void draw_bottom (int size, char c)
   {
       //System.out.println("Draw bottom is invoked");
       for (int i = 0; i < size -1; i++) //outer loop
       {
           for (int j = 0; j < i+ 1 ; j++) //padding
           {
               System.out.print(" ");
           }

           for (int k = 0; k<2*(size-i-1)-1; k++)//printing the char
           {
                System.out.print(c);
           }
           System.out.println();
       }
   }
   
}

