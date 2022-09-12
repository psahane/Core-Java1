package Array;

import java.util.Scanner;

public class CountNoDiff {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr two noo");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int n=sc.nextInt();
		int s=a-b;
		for(int i=3;i<n;i++)
		{
			b=b+s;
		}
		
		System.out.println(b);
		
}

}
