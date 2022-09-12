package Array2D;

import java.util.Scanner;

public class Tranposematrix {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and col");
		r=sc.nextInt();
		c=sc.nextInt();
	
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		
		System.out.println("eneter the "+(r*c)+" element");
		for(int i=0;i<r;i++)
		{    
			for(int j=0;j<c;j++)
			{    
			a[i][j]=sc.nextInt(); 
			
			}    
			}    
			   
			System.out.println(" orignal Matrix:");  
			for(int i=0;i<r;i++)
			{    
			for(int j=0;j<c;j++)
			{    
			System.out.print(a[i][j]+" ");    
			}    
			System.out.println();
			
			}    
			System.out.println(" Transpose Matrix:");  
			for(int i=0;i<c;i++)
			{    
			for(int j=0;j<r;j++)
			{    
		      b[i][j]=a[j][i];
			System.out.print(a[j][i]+" ");    
			}    
			System.out.println();
	}
	

}
}
