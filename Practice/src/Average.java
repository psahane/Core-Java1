import java.util.Scanner;

public class Average {
void	AvearageElement()
	{
	
	Scanner sc=new Scanner(System.in);
	
		int  a[]=new int[10];
		System.out.println("Enter the no ");
		
		
		float  sum=0,avg=0;
		for(int i=0;i<10;i++)
		{
	       a[i]=sc.nextInt();
			
		}
		for(int i=0;i<10;i++)
		{
			sum=sum+a[i];
			avg=sum/10;
		}
		System.out.println("Average is "+avg);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Average a=new Average();
		a.AvearageElement();
	}

}
