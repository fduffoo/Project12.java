// Fernando Duffoo
// CSCI 231
// 7/24/2022
// Project 12

public class FernandoDuffooProject12 
{
    public static void main(String[] args)
    {
    Account[] accounts = new Account[4];
        
    accounts[0] = new CheckingAccount(1, 0.0);
    accounts[1] = new CheckingAccount(2, 0.0);
    accounts[2] = new SavingsAccount(9, 0.0);
    accounts[3] = new SavingsAccount(10, 0.0);
    
    accounts[0].deposit(0);
    accounts[0].deposit(250);
    
    accounts[1].deposit(800);
    accounts[1].withdraw(1000);
    accounts[1].withdraw(600);
    
    accounts[2].deposit(650);
    accounts[2].withdraw(200);
    accounts[2].withdraw(60);
    
    accounts[3].deposit(1500);
    accounts[3].withdraw(1000);
    
    for (int i = 0; i < 4; ++i)
    System.out.println(accounts[i]);
    }
}