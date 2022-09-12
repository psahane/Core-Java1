package Day1;
import java.util.Scanner;
public class areaofrectangleuser {
	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner sc=new Scanner (System.in);
		int width=sc.nextInt();
		int length=sc.nextInt();
		int area = width*length;
		System.out.println("area rectangel="+area );
	}

}
