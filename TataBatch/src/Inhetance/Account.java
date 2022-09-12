package Inhetance;

public class Account {
	int accId;
	Float balance;
	String custName;
	
	Account()
	{
		accId=12365;
		balance=50000f;
		custName="sahane pravin ";
		
	}
	public void showDetail()
	{
		System.out.println("account id="+accId);
		System.out.println("account balance "+balance);
		System.out.println("customer name  "+custName);
	}
	
	
	 Account(String n,float bal)
	{
		custName=n;
		balance=bal;
	}
	void openAccount()
	{
		System.out.println("account open");
	}
	
}
