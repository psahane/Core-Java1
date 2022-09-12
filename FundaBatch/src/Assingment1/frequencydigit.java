package Assingment1;

import java.util.Scanner;

public class frequencydigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("eneter the no");
     int n=sc.nextInt();
     int temp;
     temp=n;
     for(int i=0;i<=9;i++)
     {
    	int cnt=0; 
    	while(n!=0)
    	 {
    		int r=n%10;
    		if(r==i)
    		{
    			cnt++;
    		}
    		n=n/10;
    	 }
    	n=temp;
    	System.out.println(i+"="+cnt);
     }
     
	}

}
