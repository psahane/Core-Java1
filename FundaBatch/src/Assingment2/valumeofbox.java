package Assingment2;

import java.util.Scanner;

/*
  1.	Create class Box and calculate the volume of box volume=length x width x height (create separate method for volume).


 */


public class valumeofbox {
	int length,width,height;
	void setdata(int l,int w,int h)
	{
		length=l;
		width=w;
		height=h;
		
	}
	void valume()
	{
		int valume=length*width*height;
		System.out.println("valume of box :"+valume);
		
		
	}
	
	public String toString()
	{
		return length+" "+width+" "+height+"";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,width,height;
		System.out.println("enter the length ,width and height  ");
		Scanner sc=new Scanner(System.in);
		valumeofbox  b=new valumeofbox();
		
		length=sc.nextInt();
		width =sc.nextInt();
		height=sc.nextInt();
		b.setdata(length,width,height);
		System.out.println(b);
		b.valume();
		
		
	}
}
