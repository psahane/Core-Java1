package Day3;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      System.out.println("enter the no");
      Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      int  r,s = 0;
      while(i>0)
      {
    	   r=i%10;
    	  if(s>r)
    	  { 
    		  s=i%10;
    		  s=r;
    		  
    	  }
    	    i=i/10;
    	    
      }
      System.out.println("small digit: ");
	}

}
