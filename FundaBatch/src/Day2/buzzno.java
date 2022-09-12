package Day2;
import java.util.Scanner;

public class buzzno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no");
	int n=sc.nextInt();
	if(n%7==0||n%10==7)
		System.out.println("buzz no");
	else
		System.out.println("not buzz no");
	
}
}
