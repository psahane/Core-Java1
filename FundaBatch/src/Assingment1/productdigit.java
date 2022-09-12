package Assingment1;

import java.util.Scanner;

public class productdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		int n = num;
		int product = 1;

		while (n > 0) {
			int digit = n % 10;
			n = n/10;
			product = product*digit;

		}

		System.out.println("Product of digits is " + product);

	}

}
