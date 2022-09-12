package Day2;
import java.util.Scanner;
public class grade {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter percent");
	int percent=sc.nextInt();
	if(percent>=75)
		System.out.println("u get distingtion");
	else if(percent>=60)
		System.out.println("u get fist class");
	else if(percent>=50)
		System.out.println("second class");
	else
		System.out.println("fail");
	
		
	
}
}
