package project7;
import java.util.Arrays;
import java.util.Random;
/**
 * @author Brennen Calato
 * @since 4/23/2020
 */
public class Project7 
{
    public static void main(String[] args) 
    {
        int[] size = new int[]{1000, 20000, 100000, 200000};
        long start;
        long elapsed; 
        
        System.out.println("Bubble Sort Time: ");
        for(int i = 0; i < size.length; i++)
        {
            int[] array = new int[size[i]];
            fillArray(array);
            start = System.currentTimeMillis();
            SortingAlgorithms.BubbleSort(array);
            elapsed = System.currentTimeMillis() - start;
            
            System.out.printf("%,d elements sorted in %,d milliseconds, ", size[i], elapsed);
        }
        System.out.println();
        
        System.out.println("Bubble CS Time: ");
        for(int i = 0; i < size.length; i++)
        {
            int[] array = new int[size[i]];
            fillArray(array);
            start = System.currentTimeMillis();
            SortingAlgorithms.BubbleSortSC(array);
            elapsed = System.currentTimeMillis() - start;
            
            System.out.printf("%,d elements sorted in %,d milliseconds, ", size[i], elapsed);  
        }
        System.out.println();
        
        System.out.println("Selection Sort Time: ");
        for(int i = 0; i < size.length; i++)
        {
            int[] array = new int[size[i]];
            fillArray(array);
            start = System.currentTimeMillis();
            SortingAlgorithms.selectionSort(array);
            elapsed = System.currentTimeMillis() - start;
            
            System.out.printf("%,d elements sorted in %,d milliseconds, ", size[i], elapsed);
        }
        System.out.println();
        
        System.out.println("Insertion Sort Time: ");
        for(int i = 0; i < size.length; i++)
        {
            int[] array = new int[size[i]];
            fillArray(array);
            start = System.currentTimeMillis();
            SortingAlgorithms.insertionSort(array);
            elapsed = System.currentTimeMillis() - start;
            
            System.out.printf("%,d elements sorted in %,d milliseconds, ", size[i], elapsed);
        }
        System.out.println();
        
        System.out.println("Merge Sort Time: ");
        for(int i = 0; i < size.length; i++)
        {
            int[] array = new int[size[i]];
            fillArray(array);
            start = System.currentTimeMillis();
            SortingAlgorithms.mergeSort(array);
            elapsed = System.currentTimeMillis() - start;
            
            System.out.printf("%,d elements sorted in %,d milliseconds, ", size[i], elapsed);
        }
        System.out.println();
        
        System.out.println("Quick Sort Time: ");
        for(int i = 0; i < size.length; i++)
        {
            int[] array = new int[size[i]];
            fillArray(array);
            start = System.currentTimeMillis();
            SortingAlgorithms.quickSort(array, 0, array.length - 1);
            elapsed = System.currentTimeMillis() - start;
            System.out.printf("%,d elements sorted in %,d milliseconds, ", size[i], elapsed);
        }
        System.out.println();
        
        System.out.println("Java Sort Time: ");
        for(int i = 0; i < size.length; i++)
        {
            int[] array = new int[size[i]];
            fillArray(array);
            start = System.currentTimeMillis();
            Arrays.sort(array);
            elapsed = System.currentTimeMillis() - start;
            
            System.out.printf("%,d elements sorted in %,d milliseconds, ", size[i], elapsed);
        }
        System.out.println();
        
        System.out.println("Shell Sort Time:");
        for(int i = 0; i < size.length; i++)
        {
            int[] array = new int[size[i]];
            fillArray(array);
            start = System.currentTimeMillis();
            SortingAlgorithms.shellSort(array);
            elapsed = System.currentTimeMillis() - start;
            
            System.out.printf("%,d elements sorted in %,d milliseconds, ", size[i], elapsed);
        }
        System.out.println();
        
    }
    
    public static void fillArray(int array[])
    {
        Random rand = new Random();
        for(int i = 0; i <array.length - 1; i++)
        {
            array[i] = rand.nextInt((1000 - 0) + 1) + 0;
        }
        
 
    }
    public static void printArray(int[] array)
    {
        for(int e: array)
            System.out.print(e + ", ");
        
        System.out.println();
    }
}
