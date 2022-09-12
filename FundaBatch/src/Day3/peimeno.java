package Day3;
import java.util.Scanner;
//11.	Find all prime number between 400 to 300;
public class peimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("prime no is =");
       int n=sc.nextInt();
       int i=300,a=400;
       
       while(i<=n/2)
       {
    	   if(n%i==0)
    		a--;
    	   break;
       }
       
       if(a>i)
       {
    	   System.out.println("no is prime ="+n);
       }
       
       
       }
	}


