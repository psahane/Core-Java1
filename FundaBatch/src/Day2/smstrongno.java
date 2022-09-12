package Day2;
import java.util.Scanner;
public class smstrongno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number:");
	int num=sc.nextInt();
	if(num>99 && num<1000)
	{
		System.out.println("It is a Three Digit Number.");
	
	int s=num/10;
	int n=num%10;
	int n1=s%10;
	int n2=num%10;
	int sum=n*n*n+n1*n1*n1+n2*n2*n2;
	if(n==sum)
	{
		System.out.println("amstrong no");
	}
	else
		System.out.println("not amstrong no");
      }
else
	
		System.out.println("It is Not a Three Digit Number.");
	}
	
}

