package Assingment1;
//6.	 Write a program to find sum of all even numbers between 1 to n. 
import java.util.Scanner;
public class sumevenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=0,i,sum=0;

System.out.println("enter any two no");

for( i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
			
		}
	}
		System.out.println(""+sum);
	}

}
