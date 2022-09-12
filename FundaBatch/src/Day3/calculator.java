package Day3;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.println("Enter two number ");
		int a = x.nextInt();
		int b = x.nextInt();

		System.out.println("Enter choice number \n Addition 1\n subtrsction 2\n multiplication 3\n division 4");
		int p = x.nextInt();
		switch (p) {

		case 1:
			System.out.println("Addition is " + (a + b));
			break;
		case 2:
			System.out.println("subtraction is " + (a - b));
			break;

		case 3:
			System.out.println("multiplication is " + (a * b));
			break;

		case 4:
			System.out.println("division is " + (a / b));
			break;

		default:
			System.out.println("! wrong Choice");

		}
	}

}
