package Array;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the  no=");
	      int a[]=new int[10];

	     for(int i=0;i<9;i++)
		   {
	    	a[i]=sc.nextInt();
	    	System.out.println(a[i]+"");
	    	}
	     
	    for(int i=0;i<9;i++)
	    {
	    	if(a[i]==0)
	    	{
	    		a[i]=1;
	    	}
	    	System.out.println(a[i]+"");
	    }
		   }
}
