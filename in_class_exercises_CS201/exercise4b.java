//In class exercise 4 
//Question 2
//Kennedi Jones
//9/20/24

import java.util.*; 

public class exercise4b {
    public static void main(String[] args) {
    //input
    Scanner keyboard= new Scanner(System.in);
    System.err.print("Enter a non-negative interger: ");
    int n = keyboard.nextInt();
    keyboard.close();
    //process



    //output
    if(isprime(n)) {
        System.out.println(n+" is a prime number.");
    } else
       System.out.println(n+" is NOT a prime"); 

}

public static boolean isprime(int n)
{
    if(n==0 || n==1)
       return false; 
    
    for (int m=2; m<= n- 1; m++ )
    {
        if(n%m == 0){
           return false;
        }
    }
    return true; 

}



    
}
