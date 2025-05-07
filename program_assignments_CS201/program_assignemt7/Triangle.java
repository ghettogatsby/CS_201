//Program Assignment 7
//Triangle Class 
//Kennedi Jones
//10/18/24
package program_assignemt7;

import java.util.*;
public class Triangle 
{
    private double side1;
    private double side2;
    private double side3;

    public void input()
    {
     
        Scanner keyboard= new Scanner(System.in);
        boolean valid_triangle=false; 

        while (!valid_triangle)
        {
        System.out.print("Please enter the value for side 1: "); 
        side1 = keyboard.nextDouble();
        System.out.print("Please enter the value for side 2: ");
        side2 = keyboard.nextDouble();
        System.out.print("Please enter the value for side 3: ");
        side3 = keyboard.nextDouble();

        if (side1 + side2 > side3 && side1+ side3 > side2 && side2 + side3 > side1)
        {
            valid_triangle= true;
        } else
            System.out.println("User has entered a value that is not valid. Please try again.");


        }

        keyboard.close(); 
        
    }

    public double perimeter()
    {
        double perimeter= side1+ side2+ side3;
        return perimeter; 
    }
 
    public void output()
    {
        System.out.printf("The three sides that you entered are: %.1f, %.1f, and %.1f", side1, side2, side3);
        System.out.println();
        System.out.printf("The perimeter of the triangle is: %.1f", perimeter());
        System.out.println();
        if (isEquilateral()== true) {
            System.out.println("The triangle IS equilateral.");
        }else
            System.out.println("The triangle IS NOT equilateral.");
        System.out.printf("The area of the triangle is: %.2f.", area());

    }

    public boolean isEquilateral()
    {
       boolean equilateral= false; 
       if (side1 == side2 && side2== side3) 
       {
            equilateral= true;
       }
        
       return equilateral; 
    }

    public double area()
    {
        double sides= (side1+ side2+ side3)/2;
        double area= Math.sqrt(sides* (sides- side1) * (sides - side2) * (sides- side3));
        return area;
    }

}

