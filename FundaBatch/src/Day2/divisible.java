package Day2;
import java.util.Scanner;

public class divisible {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		if(n%7==0)
			System.out.println("divisible");
		else
			System.out.println("not divisible");
		
	}

}
