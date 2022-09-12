package Day2;
import java.util.Scanner;
public abstract class twodigitornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();

if(n>=10&&n<=99)

{
	System.out.println("2 digit no");
	int fistdigit=n/10;
	int lastdigit=n%10;
	System.out.println(fistdigit+lastdigit);
	}
	

	
	System.out.println("two digit no=");

	System.out.println("not two digit no=");

	}
}


