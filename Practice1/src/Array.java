import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int a[]=new int [5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int sum=0;
		float average=0.0f;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
		if((i+1)%2!=0)
		{
			sum=sum+a[5];
			
		}
		}
		
		average=sum/count;
		System.out.println("Avrage is"+average);
	}

}
