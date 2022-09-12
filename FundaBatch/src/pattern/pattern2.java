/*
1
22
333
4444
55555
 */
package pattern;

import java.util.Scanner;

public class pattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row value ");
	int  r=sc.nextInt();
	int i,j;
	   
	   for(i=1;i<=r;i++)
	   {
	       for(j=1;j<=i;j++)
	       {
	           
	           System.out.print(i+" ");
	       }
	             System.out.println();
	  }
}
}
