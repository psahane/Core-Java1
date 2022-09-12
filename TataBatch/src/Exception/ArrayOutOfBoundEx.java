package Exception;

import java.util.Scanner;

public class ArrayOutOfBoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x=new Scanner(System.in);
		  int a[] =new int[5];
		  try
		  {
			  a[6]=100;
			  System.out.println("printing the value a"+a[6]);
			  
		  }
		   catch(Exception e)
		  {
			   System.out.println("exception occured"+e);
			   
		  }
	  }
	}


