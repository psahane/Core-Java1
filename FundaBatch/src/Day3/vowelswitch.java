package Day3;

import java.util.Scanner;

public class vowelswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter charactor");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
			 
		case 'e':
		case 'i':
		case 'o':			
		case 'u':
			System.out.println("this is a vowel");
			break;
			
			default: System.out.println("consonant");
		}
	}
	

}
