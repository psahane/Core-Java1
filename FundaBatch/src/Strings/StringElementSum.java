package Strings;

public class StringElementSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "dhj34dfhf9fs";
        
        char c[]  = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
        	
            if (Character.isDigit(c[i]))
            {
            	
                System.out.print("Digits in the String : " + c[i]);
                System.out.println();
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        System.out.println("Sum of Digits is : " + sum);
    }

	}


