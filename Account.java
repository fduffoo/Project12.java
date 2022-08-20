class Account
{
    protected int id;
    protected double balance;
    
    public Account() {}
    
    public Account(int id, double balance) 
    {
        this.id = id;
        this.balance = balance;
    }
    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public void deposit(double amount)
    {
        try
        {
           if(amount <= 0) 
           throw new IllegalAmountException("Illegal amount exception");
           else
           {
               balance += amount;
               System.out.println("Amount Deposited in Account " + id + ": " + amount);
           }
        }
        catch (IllegalAmountException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public String toString()
    {
        return "[ Account Id :" + id + ", Balance : " + balance + " ]";
    }
    public void printString() 
    {
        System.out.println(this.toString());
    }
    public void withdraw(double amount) {}
    public void addInterest() {}
}