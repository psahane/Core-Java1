package Day3;

import java.util.Scanner;

public class evennoadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0,i,sum=0;

		System.out.println("enter any two no");

		for( i=1;i<=10;i++)
			{
				if(i%2==0)
				{
					sum=sum+i;
					
				}
			}
				System.out.println(""+sum);
			}

		}
