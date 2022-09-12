package pattern;
/*
1
222
33333
4444444
555555555
66666666666
7777777777777
888888888888888
99999999999999999
*/


import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row value ");
		int r = sc.nextInt();
		int i, j,s=1;
		for(i=0;i<r;i++)
		{
			for(j=r-1;j>i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<s;k++)
			{
				System.out.print(s-i);
			}
			s=s+2;
			System.out.println();
		}
	}

}
