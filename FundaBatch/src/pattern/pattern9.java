
/*
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
1 0 1 0 1 
0 1 0 1 0 
 */
package pattern;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value ");
		int r = sc.nextInt();
		int i, j;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=r;j++)
			{
				System.out.print(((i+j)%2)+" ");
			}
			System.out.println("");
		}
		
	}

}
