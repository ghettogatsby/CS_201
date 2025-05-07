//In class exercise 4 
//Question 2
//Kennedi Jones
//9/20/24

import java.util.*; 

public class program_assignment4 {
public static void main(String[] args) 
{
    //input
    Scanner keyboard= new Scanner(System.in);
    System.out.print("How many prime numbers do you want?");
    int n = keyboard.nextInt();
    keyboard.close();
    list_primes(n);
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

public static void list_primes (int n)
{
    int number= 2; //Number starts with 2 b/c by definition 0 and 1 are not prime nums. 
    for ( int count = 0; count < n; number++) 
    {
        if (isprime(number)) 
        {
            System.out.println(number);
            count++;
        }
    }

} 
}

