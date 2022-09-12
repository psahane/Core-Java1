package classandobject;

import java.util.Scanner;

public class SimpleInterest {

	public void  calculate(  int amount, int rate,int time)
    {
        
    
    double r=((amount*rate*time)/100);
    System.out.println(" Simple interst="+r);
   }

	
public static void main(String args[])
{
 int si,amount,rate,time;
Scanner x= new Scanner(System.in);
System.out.println("Enter amount rate and time ");
   amount=x.nextInt();
   rate=x.nextInt();
   time=x.nextInt();
SimpleInterest   ob = new SimpleInterest();
ob.calculate(amount,rate,time);


      }



}

