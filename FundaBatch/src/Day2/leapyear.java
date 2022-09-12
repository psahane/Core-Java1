package Day2;
import java.util.Scanner;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		   System.out.println("enter the year");
		    int a=sc.nextInt();
		  

		if(a%400==0)
		   {
		      System.out.println("this are leap year");
		    }
		else
		   {
		      System.out.println("this are not leap year");

		   }
	}

}
