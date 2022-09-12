package Array;

import java.util.Scanner;

public class MissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;   
	      System.out.println("Enter the  number  ");
	      n=sc.nextInt();    

	      int a[]=new int[n];   
	      System.out.println("Enter the elements of array ");
	      for(int i=0; i<n ;i++)     
	      {
	          a[i]=sc.nextInt();
	      }
	      int sum=(n+1)*(n+2)/2;   
	      for(int i=0;i<n;i++)
	      {
	          sum=sum-a[i]; 
	      }
	      
	      System.out.println("Missing Element is "+sum);  
	   }
	
	}


