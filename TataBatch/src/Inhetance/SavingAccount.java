package Inhetance;

public class SavingAccount extends Account {
	
	float iRate;
	
	SavingAccount()
	{
		
	    super();
		iRate=5.5f;
	}
	SavingAccount(float ir,int i,float bal,String n)
	{
		
		super(n,bal);
		iRate=ir;
		accId=i;
		
	}
	public void showSavingDetail()
	{
		showDetail();
	}
	public void deposite(float amt)
	{
		balance=balance+amt;
		System.out.println("total balance is "+balance );
	}
	public void widrow(float amt)
	{
		balance=balance-amt;
		System.out.println("widrow balance"+balance);
	}
	

}
