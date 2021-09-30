package project6;
//Name: Brennen Calato
//Assignment: Recursive vs. Iterative Solutions
public class Recursive_vs_Iterative{


    public static void main(String[] args) {
        
        System.out.printf("%-10s%-15s%-15s%-10s\n", "x", "fib(x)", "Recursive(ns)", "Iterative(ns)");
        System.out.println("======================================================");
        	
        for(int i = 10; i <= 50; i += 10)
        {
            long recstart = System.nanoTime();
            long fib = Fibonacci.recursiveFib(i); 
            long recelapsed = System.nanoTime() - recstart;
            
            long iterstart = System.nanoTime();
            long fib2 = Fibonacci.iterativeFib(i);
            long iterelapsed = System.nanoTime() - iterstart;
            
            System.out.printf("%-10d%-15d%-15d%-10d%n", i, fib2, recelapsed, iterelapsed);
        }
                
        System.out.println("======================================================");
        
    }
    
}

