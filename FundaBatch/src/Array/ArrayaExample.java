package Array;

import java.util.Scanner;

public class ArrayaExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter the 5 no=");
	      int i,count=0,odd=0;
	      int a[]=new int[10];
	      
	      for(i=0;i<5;i++)
	      {
	         a[i]=sc.nextInt();
	      }
	          System.out.println("input the element");
	           for(i=0;i<5;i++)
	            {
	              if(a[i]%2==0)
	             {
	               count++;
	             }
	             else
	               odd++;
	              System.out.println(a[i]+" ");
	            }
	              
	              System.out.println("even no count "+count);
	                System.out.println("odd no count "+odd);

	            }

	}


