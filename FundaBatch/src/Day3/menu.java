package Day3;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int i = sc.nextInt();
		switch (i)
		{
		case 1:
			System.out.println("maharatrian thali 200 rs");
			System.out.println("how many thali");
			int quantity=sc.nextInt();
			int total= quantity*200;
			System.out.println("total is"+total);
			break;
		case 2:
			System.out.println("gujrat thali 300 rs");
			System.out.println("how many thali");
			int s=sc.nextInt();
			int t= s*300;
			System.out.println("total is"+t);
			break;
		case 3:
			System.out.println("rajstani thali 100 rs");
			System.out.println("how many thali");
			int n=sc.nextInt();
			int p= n*100;
			System.out.println("total is"+p);
			break;
		case 4:
			System.out.println("punjabi thali 500 rs");
			System.out.println("how many thali");
			int d=sc.nextInt();
			int a= d*500;
			System.out.println("total is"+a);
		default:System.out.println("invalid choice ");
		
		}

	}

}
