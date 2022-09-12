package Day3;

import java.util.Scanner;

public class displaymonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int i = sc.nextInt();
		switch (i) {

		case 1:
			System.out.println("january 31 days");
			break;
		case 2:
			System.out.println("february");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4:
			System.out.println("april");
			break;
		case 5:
			System.out.println("may");
			break;
		case 6:
			System.out.println("jun");
			break;
		case 7:
			System.out.println("juali");
			break;
		case 8:
			System.out.println("august");
			break;
		case 9:
			System.out.println("sepetember");
			break;
		case 10:
			System.out.println("october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
