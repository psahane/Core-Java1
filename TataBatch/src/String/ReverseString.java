package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String s1;
		 System.out.println("Enter the String:");
		  s1=sc.next();
		  
		  System.out.println("Reverse String:");
		  for(int i=s1.length()-1;i>=0;i--)
		  {
			  System.out.print(s1.charAt(i));
		  }
			}

	

}
