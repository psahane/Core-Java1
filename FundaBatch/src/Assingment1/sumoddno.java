package Assingment1;
//7.	 Write a program to find sum of all odd numbers between 1 to n.
public class sumoddno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,i,sum=0;

		System.out.println("enter any two no");

		for( i=1;i<=n;i++)
			{
				if(i%2!=0)
				{
					sum=sum+i;
					
				}
			}
				System.out.println(""+sum);
			}

	}


