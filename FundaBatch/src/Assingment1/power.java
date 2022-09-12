package Assingment1;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b, power;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the base: ");  
		b=sc.nextInt();  
		System.out.print("Enter the power: ");  
		power  =sc.nextInt();  
		  
		int pow= b*power;  
		
		System.out.println("power is ="+pow);  
	}

}
