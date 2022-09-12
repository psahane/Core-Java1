import java.util.Scanner;
public class OccuranceOfNumber {
	 public static void main(String args[]) 
	   { 
		  Scanner sc=new Scanner(System.in);
		  int a[]=new int[8];
		    System.out.println("Enter Array:");
		   for(int i=0;i<a.length;i++) 
		   {
		    a[i]=sc.nextInt();
		   }
		     int cnt;
		     int i,j;
		 int b =sc.nextInt();
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
					 System.out.println("\n "+ a[i]+" OCCURS: "+cnt+" TIMES");
				 }
		    	
		    	 }
		     
			}
	  }

