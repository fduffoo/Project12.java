public class SavingsAccount extends Account
{
    private double interestRate = 0.06d; 
    public SavingsAccount(int id, double balance)
    {
        super(id, balance);
        System.out.println("Account Created : "+ this.toString());
    }
    public double getInterestRate()
    {
        return interestRate;
    }
    public void setInterestRate(double interestRate)

    {
        this.interestRate = interestRate;
    }
    public void addInterest()
    {
        balance *= (1 + interestRate);
        System.out.println("Interest added: " + interestRate + " in Account " + id);
    }
    public void withdraw(double amount)
    {
        try
        {
            if(amount <= 0)
            throw new IllegalAmountException("Illegal amount exception");
            else if(amount > (balance-500))
            throw new NoSufficientFundsException("No sufficient funds");
            else
            {
                balance -= amount;
                System.out.println(amount +" Withdrawed in Account " + id);
            }
        }
        catch (IllegalAmountException e)
        {
            System.out.println(e.getMessage());
        }
        catch (NoSufficientFundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public String toString()
    {
        return "[SavingsAccount : Account Id = " + id + ", Balance = " + balance + " ]";
    }
}