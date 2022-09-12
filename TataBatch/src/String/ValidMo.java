package String;

import java.util.Scanner;

public class ValidMo {

	
	public static boolean validMobileNo(String valid)
	{
		boolean result=valid.matches("[0-9]{9}");
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		  System.out.println("enter no  ");
		  String s=sc.next();
		  
		  if(validMobileNo(s))
		  
			  System.out.println("mobile no is valid ");
		  else
			  System.out.println("mobile no is invalid ");
	}

}
