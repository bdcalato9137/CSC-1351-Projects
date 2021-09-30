package bankaccounttester;
import java.util.Scanner;
/**
 *
 * @author bdcal
 */
public class BankAccountTester {

    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the initial balance for a savings account -> ");
        double initialBalance = cin.nextDouble();
        BankAccount savings = new BankAccount(initialBalance);
        BankAccount checking = new BankAccount(initialBalance + 500);
        System.out.printf("Your savings account balance is $%.2f%n", savings.getBalance());
        System.out.printf("Your checking account balance is $%.2f%n", checking.getBalance());
        System.out.println();
        System.out.print("Enter an amount to transfer from checking to savings -> ");
        double transferAmount = cin.nextDouble();
        checking.withdraw(transferAmount);
        savings.deposit(transferAmount);
        System.out.printf("Your savings account balance is $%.2f%n", savings.getBalance());
        System.out.printf("Your checking account balance is $%.2f%n", checking.getBalance());
        System.out.println();
        System.out.printf("Does the savings and checking accounts have the same balance? %b%n", (savings.getBalance() == checking.getBalance()));
        System.out.println();
        BankAccount youngAdult = new BankAccount(savings);
        System.out.printf("Savings a/c: %s%n", savings.toString());
        System.out.printf("Checking a/c: %s%n", checking.toString());
        System.out.printf("Young Adult a/c: %s%n", youngAdult.toString());
    }
    
}
