package Exception;

import java.util.Scanner;

public class Multiple_ExceEx {
	int s[]=new int[3];	
	int k[]=new int[3];
	int i;
	public void disp() {
		for( i=0;i<s.length;i++)
		{
			k[i]=s[0]+s[1]+s[2]/3;
		}
		System.out.println("division are:"+k[i]);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Multiple_ExceEx m=new Multiple_ExceEx();
		int s[]=new int[3];	
        try {
	
	
	
	    System.out.println("Enter element:");
	   for(int i=0;i<4;i++)
	   s[i]=sc.nextInt();
	
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Array Index Out Of Bounds Exception:");
        }
        catch(ArithmeticException e)
        {
        	System.out.println(e);
        }
        m.disp();



	}

}



