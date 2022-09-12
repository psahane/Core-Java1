package pattern;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value ");
		int r = sc.nextInt();
		int i, j;
		for(i=1;i<=r;i++)
		{
			for(j=r-1;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			for(int a=i-1;a>=(i-1);a--)
			{
				System.out.print(i-a);
			}
			System.out.println();
		}
	}

}
