package Day3;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
       int num=sc.nextInt();
       int i=1;
       int fact=1;
       
      while(i<=num) {
    	  fact=fact*i;
    			  
    	  i++;
      }
      System.out.println(" factoriqal is= "+fact);
	}

}
