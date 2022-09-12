
/*
a
ab
abc
abcd
abcde
 */
package pattern;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value ");
		int r=sc.nextInt();
		int i,j;
		char ch='a';
		
		   
		   for(i=1;i<=r;i++)
		   {
			   ch='a';
			   
		       for(j=1;j<=i;j++)
		       {
		           
		           System.out.print(ch);
		           ch++;
		       }
		             System.out.println();
		  }
	}

}
