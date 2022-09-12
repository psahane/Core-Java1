package Day2;
import java.util.Scanner;
public class commition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("enter amount");
  int a=sc.nextInt();
  if(a>=10000)
  {
    double discount=a*20/100;
    System.out.println("discount is"+discount);
    System.out.println("net pay ="+(a-discount));
    
  }
  else 
  {
	  double b=a*10/100;
	  System.out.println("discount is="+b);
	    System.out.println("net pay is"+(a-b));  
  }
  
	}

}
