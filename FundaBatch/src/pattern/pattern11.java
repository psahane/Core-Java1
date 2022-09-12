/*
 1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1
 */
package pattern;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value ");
		int r = sc.nextInt();
		int i, j,s=1;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=s;j++)
			{
				System.out.print(j+" ");
			}
			if(i<=r/2)
			{
				s++;
				
			}
			else
			{
				s--;
			}
			System.out.println();
		}
	}

}
