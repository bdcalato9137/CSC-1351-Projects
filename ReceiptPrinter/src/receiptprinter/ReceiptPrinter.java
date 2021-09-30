package receiptprinter;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
        
/**
 *
 * @author bdcal
 */
public class ReceiptPrinter {

    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter out = new PrintWriter("Receipt");
        Scanner cin = new Scanner(System.in);
        
        out.println("\t\tInvoice\t");
        out.println("========================================");
        out.printf("%-15s%-10s%-10s%-10s", "Item", "Quantity", "Price", "Total"); 
        out.println();
        out.println("----------------------------------------");
                
        String itemName;
        int itemQuant;
        double itemPrice;
        double total = 0;
        
        while(true)
        {
            System.out.println("Enter your item name:");
            itemName = cin.next();
            System.out.println("Enter your item quantity:");
            itemQuant = cin.nextInt();
            System.out.println("Enter your item price:");
            itemPrice = cin.nextDouble();
            total += itemQuant * itemPrice;
            out.printf("%-15s%-9d$%-9.2f$%-10.2f", itemName, itemQuant, itemPrice, total);
            out.println();
            
            System.out.println("Press 0 to exit or any other key to continue: ");
            if(cin.next().charAt(0) == '0')
                break;
        }
        out.println("----------------------------------------");
        out.printf("%34s$%.2f","", total);
        out.close();
        
    }
    
}
