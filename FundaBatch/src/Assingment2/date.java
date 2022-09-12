/*
 4.	Create a class Mydate (date, month, year) as input and print the date in dd/mm/yy format.
 */

package Assingment2;

import java.util.Scanner;

public class date {
	 int date,month,year;
     void setData(int dd,int mm,int yy)
     {
    	 date=dd;
    	 month=mm;
    	 year=yy;
     }
     public String toString()
     {
    	 return date+" "+"/"+month+" "+"/"+year ;
    	 
     }
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int date,month,year;
		date s=new date();
		System.out.println("enter date, month, year");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		s.setData(date,month,year);
		System.out.println();
		
		
		System.out.println(s);
		System.out.println();
		
		
		
	}
}
