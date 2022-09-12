package pattern;

import java.util.Scanner;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value ");
		int r = sc.nextInt();
		int i, j;
		for(i=1;i<=r;i++)
		{
			for(j=1;j>=i;j++)
			{
				System.out.print("*");
				
			}
			for(j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.print("*");
			System.out.println();
		}
		for(i=r-1;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("");
	}

}
