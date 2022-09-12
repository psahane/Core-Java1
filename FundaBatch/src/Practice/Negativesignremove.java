package Practice;

import java.util.Arrays;

public class Negativesignremove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-5,4,-7,8,-10,-9,-15,-21,4,-56};
		
		
		 for (int i = 0; i < a.length; i++) 
		 {
	        	
		    for (int j=0 ;j<a.length; j++)
		    	if ((a[i] > a[j]))
		    	{
		    		int  b=a[i];
		    		a[i]=a[j];
		    		a[j]=b;
		    	}
		 }
		 System.out.println(Arrays.toString(a));
	}

}
