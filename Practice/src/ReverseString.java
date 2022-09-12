
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
	     String str1;
	     System.out.println("Enter the String");
	      str1=sc.next();
	      
	      for(int i=0;i<str1.length();i++) 
	       {
			System.out.print(str1.charAt(i));
			
           	}
	      System.out.println("\nReverse String:");
		for(int i=str1.length()-1;i>=0;i--) 
	       {
			System.out.print(str1.charAt(i));
			
            	}

	}
	}