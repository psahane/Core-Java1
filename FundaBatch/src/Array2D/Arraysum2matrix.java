package Array2D;

import java.util.Scanner;

public class Arraysum2matrix {
	
	 
	     public static void main(String[] args)
	        {
	    	 int r,c;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter the row and col");
		r=sc.nextInt();
		c=sc.nextInt();
	      int k[][]=new int[r][c];
	    
	 int a[][]=new int[r][c];
	 int b[][]=new int[r][c];
	 int s[][]=new int[r][c];
	 System.out.println("eneter the fist matrix  "+(r*c)+" element");
	     
	      for(int i=0;i<r;i++)
	      {
	       for(int j=0;j<c;j++)
	       {
	          
	         a[i][j]=sc.nextInt();
	       }
	      }
	         for(int i=0;i<r;i++)
	         {
	           for(int j=0;j<c;j++)
	           {
	         System.out.print(a[i][j]+" ");
	           }
	          System.out.println();
	         }
	       
	          System.out.println("eneter the second matrix  "+(r*c)+" element");
	      for(int i=0;i<r;i++)
	      {
	        for(int j=0;j<c;j++)
	        {
	         b[i][j]=sc.nextInt();
	        }
	      }
	          for(int i=0;i<r;i++)
	          {
	        for(int j=0;j<c;j++)
	        {
	        	System.out.print(b[i][j]+" ");
	        }
	          System.out.println();
	          }
	       
	      for(int i=0;i<r;i++)
	      {
	        for(int j=0;j<c;j++)
	        {
	         s[i][j]=a[i][j]-b[i][j];
	        }
	      }
	         
	     System.out.println("subtract matrix:");
	      for(int i=0;i<3;i++)
	       {
	        for(int j=0;j<3;j++)
	        {
	             
	           
	         System.out.print(s[i][j]+" ");
	        }
	       
	      System.out.println();
	  }
	}
	}


