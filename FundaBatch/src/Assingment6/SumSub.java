package Assingment6;

import java.util.Scanner;

public class SumSub {

	

	Scanner sc = new Scanner(System.in);

	void add() {
		System.out.println(" enter two no to add:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("c=" + c);
	}

}

class Example extends SumSub {
	

	Scanner sc = new Scanner(System.in);

	void sub() {

		System.out.println(" enter two no to sub:");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = p-q;
		System.out.println("r=" + r);
	}

	public static void main(String args[])

	{
		Example b1 = new Example();
		b1.add();
		b1.sub();
	}
}
