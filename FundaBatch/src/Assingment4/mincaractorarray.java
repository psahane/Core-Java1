package Assingment4;

import java.util.Scanner;

public class mincaractorarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, j;
		Scanner sc=new Scanner(System.in);
		char a[]= {'A','D','G','X','Z'};
		char min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min)
			
				min=a[i];
				
			
			
		}
		
		System.out.println("min array charactor is  "+min); 
	}
}