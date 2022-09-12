package Assingment8;

import java.util.Scanner;

public class CountDigitAlphabateSpl {
	public static void main(String[] args) {
	
		
		int alphabate = 0;
		int digit =0;
		int spl = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String =  ");
		String str = sc.nextLine();
		
		for(int i=0;i< str.length();i++)
		{
			ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alphabate++;
			}
			else if(ch >= '0' && ch <= '9') {
				digit++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("No of Alphabet  is =" + alphabate);
		System.out.println("No of Digit  is =" + digit);
		System.out.println("No of Special charactor is=" + spl);
	}
}


