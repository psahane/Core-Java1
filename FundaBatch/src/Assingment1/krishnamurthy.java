package Assingment1;

import java.util.Scanner;

public class krishnamurthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		int n = sc.nextInt();
		
		int temp, r, sum = 0, fact = 1;
		
		temp = n;

		while (n != 0) 
		{
			r = temp % 10;
			fact = 1;
			for (int i = 1; i <=r; i++) 
			{
				fact = fact * i;
			}
			sum = sum + fact;
			temp = temp / 10;

		}
		if (sum == sum) {
			System.out.println("no is krishnamurthy");

		} else {
			System.out.println("no is krishnamurthy");
		}
	}
}
