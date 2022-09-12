import java.util.Scanner;
public class MissingNumber {
	public void miss()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the value");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the number");
        for(int i=0;i<=n-2;i++)
        {
        	 a[i]=sc.nextInt();
    
        }
        int sum=(n*(n+1))/2;
        int sum1=0;
        for(int i=0;i<=n-2;i++)
        {
        	sum1=sum1+a[i];
        	
        }
        int missnumber=sum-sum1;
        System.out.println("missing number is:"+missnumber);
        
	}
	public static void main(String args[])
	{
		MissingNumber obj=new MissingNumber();
		obj.miss();
	}
	
}
