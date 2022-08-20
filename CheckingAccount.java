public class CheckingAccount extends Account
{
    public CheckingAccount(int id, double balance)
    {
        super(id, balance);
        System.out.println("Account Created : " + this.toString());
    }
    public void withdraw(double amount)
    {
       try
       {
           if(amount <= 0)
           throw new IllegalAmountException("Illegal amount exception");
           else if(amount > balance)
           System.out.println("Withdrawal amount of " + amount + " is too high for Account " + id);
           else
           {
               balance -= amount;
               System.out.println(amount + " Withdrawed in Account " + id);
           }
       }
       catch (IllegalAmountException e)
       {
           System.out.println(e.getMessage());
       }
    }
    public String toString()
    {
        return "[CheckingAccount : Account Id = " + id + ", Balance = " + balance + " ]";
    }
}