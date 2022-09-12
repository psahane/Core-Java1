package Day1;
import java.util.Scanner;

public class areatriangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter base and height=");
	
	float b=sc.nextFloat();
	float h=sc.nextFloat();
	float area=(b*h)/2;
	System.out.println("Area od triangle ="+area);
	}
}
