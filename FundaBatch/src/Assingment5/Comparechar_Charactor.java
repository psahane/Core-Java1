package Assingment5;

import java.util.Scanner;

public class Comparechar_Charactor {
	
	public void compare(char a, char b) {
	    int p = (int)a;
	    int k = (int)b;
	    
	    if (p > k) {
	        System.out.println(a);
	    }
	    else {
	        System.out.println(b);
	    }
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	       Comparechar_Charactor a =new Comparechar_Charactor();
	       
		 System.out.print("Enter the  first character: ");
	        char c1 = sc.next().charAt(0);
	        System.out.print("Enter  the second character: ");
	        char c2 = sc.next().charAt(0);
	        sc.nextLine();
	        a.compare(c1, c2);
	        
	}

}
