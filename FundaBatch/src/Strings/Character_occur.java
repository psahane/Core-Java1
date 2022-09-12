package Strings;

import java.util.Scanner;

public class Character_occur {
	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
		    System.out.println("Enter String:");
		    
		     String str=sc.next();
		     
		     int cnt;
		     int i,j;
		    char a[] =str.toCharArray();
		     for( i=0;i<a.length;i++)
		     {
		    	 cnt=1;
		    	 for(j=i+1;j<a.length;j++) {
		    		 if(a[i]==a[j]) {
		    			 cnt=cnt+1;
		    		 a[j]='0';
		    		 }
		    	 }
		    	 if(a[i]!='0')
				 {
					 System.out.println("\n CHARACTER "+ a[i]+" OCCURS: "+cnt+" TIMES");
				 }
		    	
		    	 }
		     
			}
}
