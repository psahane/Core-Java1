
/*
   *
  **
 ***
****
 */
package pattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value ");
		int  r=sc.nextInt();
		
		for(int i=1;i<=r;i++)
		   {
		       for(int j=r-1;j>=i;j--)
		           
		           System.out.print(" ");

		         for(int j=1;j<=i;j++)

		           System.out.print("*");
		            System.out.println();
		   }
	}

}
