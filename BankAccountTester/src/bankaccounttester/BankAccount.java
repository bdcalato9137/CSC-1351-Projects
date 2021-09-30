
package bankaccounttester;

/**
 *
 * @author Brennen Calato
 */
public class BankAccount 
{
    /**
     * the account balance
     */
    private double balance;
    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount()
    {
        balance = 0;
    }
    /**
     * Constructs a bank account equivalent to the specified bank account
     * @param other a bank account
     */
    public BankAccount(BankAccount other)
    {
        balance = other.getBalance();
    }
    /**
     * Constructs a bank account with a given balance
     * @param initialBalance is the initial balance
     * @throws IllegalArgumentException when the initial balance is negative
     */
    public BankAccount (double initialBalance)
    {
        if(initialBalance < 0)
        {
            throw new IllegalArgumentException("InitialBalance can not be negative");
        }
        balance = initialBalance;
    }
    /**
     * Deposits money into the account.
     * @param amount is the amount of money to deposit
     * @throws IllegalArgumentException when amount < 0
     */
    public void deposit(double amount)
    {
        if(amount < 0)
        {
            throw new IllegalArgumentException("Deposit amount can not be negative");
        }
        balance += amount;
    }
    /**
     * Withdraws money from the account.
     * @param amount the amount of money to withdraw
     * @throws IllegalArgumentException when amount > balance, or amount < 0
     */
    public void withdraw(double amount)
    {
        if(amount > balance)
        {
            throw new IllegalArgumentException("Withdrawal amount is greater than account balance");
        }
        else if(amount < 0)
        {
            throw new IllegalArgumentException("Withdrawal amount can not be negative");
        }
        balance -= amount;
    }
    /**
     * Gets the account balance.
     * @return the account balance
     */
    public double getBalance()
    {
        return balance;
    }
    /**
     * Returns a string representation of this bank account in the format
     * "BankAccount[balance = ...]", where ... denotes the balance.
     * @return a string representation of this bank account in the format
     * "BankAccount[balance = ...", where ... denotes the balance.
     */
    @Override
    public java.lang.String toString()
    {
        return "BankAccount[balance = " + balance + "]";
    }

}
