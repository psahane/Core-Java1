package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArray {
	public void swap(int a[],int size)
	{
		int s=size/2;
		for(int i=0;i<size/2;i++)
		{
			int b=a[i];
			a[i]=a[s];
			a[s]=b;
			s++;
		}
		System.out.println(Arrays.toString(a));	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       Scanner sc=new Scanner(System.in);
       System.out.println("enter array size " );
       int  size =sc.nextInt();
       int a[]=new int[size];
       System.out.println("enter  10 element array");
       
       for(int i=0;i<size;i++)
       {
    	a[i]=sc.nextInt();   
       }
       SwapArray k=new SwapArray();
       k.swap(a,size);
	}
	
	

}
