package exercise8;

import java.util.*;

class exercise8 {

    public static void main(String[] args) 
    {
        //input
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Enter ten integer numbers:");
        int[] a= new int[10];
        for(int i=0; i < a.length; i ++)
        {
            a[i]= keyboard.nextInt();
        }
        keyboard.close();

        //process + output
        System.out.println("The maximum number is: "+ max(a));
        System.out.print("The sorted numbers: ");
        
        int[] b= new int[a.length];
        b= sort(a);
        for(int i=0; i < b.length; i++)
        {
           System.out.print(b[i]+ " ");
        }


    }
    
    public static int max(int[] array)
    {
        int max= array[0];
       for(int i=0 ; i < array.length; i++)
       {
           if(array[i] > max)
           {
             max= array[i];
           }
       }
       return max;

    }

     public static int[] sort(int[] list)
    {
       int[] result= new int[list.length];
       int i,j, index=0;
       for(i=0; i < result.length; i++) //fill each element inside result array
       {
         int smallest = Integer.MAX_VALUE;
         for(j=0 ; j < list.length; j++)//find the next smallst value in the array
        {   
            if(list[j] < smallest)
            {
              smallest= list[j];
              index=j;//remember where we found the smallest value 
            }
        }
            
         result[i]= smallest;
         list[index]=Integer.MAX_VALUE;//cross out the smallest value used from the array 
       }

       return result;

    }

}
