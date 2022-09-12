package Exception;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
	      System.out.println("enter index no");
	      int a=sc.nextInt();
	     int  arr[]= {1,2,3,4,5};
	     
	      try
	      {
	    	  
	    		  System.out.println(" "+arr[a]);
	      }
	      catch(Exception e)
	      {
	    	  System.out.println(e);
	      }
	      
	}

}
