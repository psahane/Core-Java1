package Array2D;

import java.util.Scanner;

public class Matrixsumofrow {
public static void main(String[] args) {
	int r,c,sumRow;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row and col");
	r=sc.nextInt();
	c=sc.nextInt();
	
	int a[][]=new int[r][c];
	
	System.out.println("eneter the "+(r*c)+" element");
	r=a.length;
	for(int i = 0; i < r; i++)
	{    
        sumRow = 0;    
        for(int j = 0; j < c; j++)
        {  
        	sumRow = sumRow + a[i][j];    
        }    
        System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
    }
	
	 
}

}
