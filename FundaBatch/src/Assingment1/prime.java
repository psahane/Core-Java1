package Assingment1;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("prime no is =");
       int n=sc.nextInt();
       int i=400,a=300;
       
       while(i<=n/2)
       {
    	   if(n%i==0)
    		a++;
    	   break;
       }
       
       if(a>i)
       {
    	   System.out.println(n);
       }
       
       
	}

}
