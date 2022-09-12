

//4.	Design a class to overload a function series() as follows:
//(i) double series(double n) with one double argument and returns the sum of the series,
//sum = 1 / 1 + 1 / 2 + 1 / 3 + … + 1 / n.
//(ii) double series(double a, double n) with two double arguments and returns the
//sum of the series, sum = 1 / a2 + 4 / a5 + 7 / a8 + 10 / a11 + … to n terms.



package Assingment5;

import java.util.Scanner;

public class Series {
	double series(double n)
	{
		double sum=0;
		
		for(double i=0;i<=n;i++)
		{
			sum=sum+1/i;
			
		}
		System.out.println("sum="+sum);
		return sum;
		
	}
	double series(double a,double n)
	{
	double total=0,b=0;
	for(double i=0;i<=n;i++)
	{
	 	total=total+b/a*(b+1);
	 	b=b+3;
	}
	System.out.println("sum of the series="+total);
	return total;
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    Series s=new Series();
    System.out.println("enter the two no");
    double n=sc.nextDouble();
    double a=sc.nextDouble();
    s.series(n);
    
    System.out.println("enter two no ");
     n=sc.nextDouble();
     a=sc.nextDouble();
    s.series(a,n);
	}

}
