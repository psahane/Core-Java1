
//1.	WAJP2 find sum of main diagonal elements of a matrix.
package Assingment4;

import java.util.Scanner;

public class sumdigonalelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,sum=0;
     Scanner sc=new Scanner(System.in);
 	System.out.println("enter the row and col");
      r= sc.nextInt();
      c= sc.nextInt();
      int a[][]=new int[r][c];
      
      System.out.println("eneter the "+(r*c)+" element");
      for(int i=0;i<r;i++)
      { 
       for(int  j=0;j<c;j++)
       { 
           a[i][j] = sc.nextInt();
      }
  }
  
      System.out.println(" elements of the matrix") ;
      for(int i=0;i<r;i++)
      { 
       for(int j=0;j<c;j++)
       { 
         System.out.print(a[i][j]+"\t");
      }
        System.out.println("  ");
  }
  
      for(int i=0;i<r;i++)
      { 
       for(int j=0;j<c;j++)
       { 
  if(i==j) 
  {
  sum = sum + a[i][j];
  }
      }
  }
  
      System.out.printf("sum of digonal elements  = "+sum) ;
  } 
}
