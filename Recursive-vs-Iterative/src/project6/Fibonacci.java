package project6;
//Name: Brennen Calato
//Date: 3/30/2020
//Assignment: Recursive vs. Iterative Solutions
public class Fibonacci 
{
    
    /*
    This method takes the input from the main method and finds the Fibonacci 
    number of the input through a Recursive method.
    */
    public static long recursiveFib(int n)
    {
        if(n <= 2)
        {
            return 1;
        }
        
        else
        {
            return recursiveFib(n-1) + recursiveFib(n-2);
        }

    }
    
    
    /*
    This method takes the input from the main method and finds the Fibonacci
    number of the input through an Iterative method.
    */
    public static long iterativeFib(int n) 
    {
        long finalVal;
        
        if(n <= 2) 
        {
            finalVal = 1;
        }
        else
        {
            long olderValue = 1;
            long oldValue = 1;
            long newValue = 1;
            
            for(int i = 3; i <= n; i++)
            {
                newValue = oldValue + olderValue;
                olderValue = oldValue;
                oldValue = newValue;
            }
            finalVal = newValue;
        }
        
        return finalVal;
        
    }

}

