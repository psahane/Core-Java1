package Assingment5;

import java.util.Scanner;

public class Compare_Integer {
public void compare(int a, int b) {
        
        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner sc = new Scanner(System.in);
	       Compare_Integer a=new Compare_Integer();
	        
	        System.out.print("Enter the  first integer: ");
	        int c1 = sc.nextInt();
	        System.out.print("Enter the second integer: ");
	        int c2 = sc.nextInt();
	        sc.nextLine();
	        a.compare(c1, c2);
	        
	       
	}

}
