package Assingment1;

import java.util.Scanner;

public class amstrongno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
    int n=sc.nextInt();
	int a,rem,r=0,cnt=0,sum=0;
	a=n;
	while(a!=0)
	{
		 cnt++;
		 a=a/10;
	}
	a=n;
	while(a!=0)
	{
		int b=a%10;
		int pow=1;
		
	for(int i=1;i<=cnt;i++)
	{
		pow=pow*b;
		}
	sum=sum+pow;
	}
	if(sum==n)
	{
		System.out.println("no is amstring");
		
	}
	else
	{
		System.out.println("no is not amstrong");
	}
	
}
}
