package Day1;
import java.util.Scanner;

public class ptr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the sub mark");
System.out.println("enter english mark");
int english = sc.nextInt();
System.out.println("enter chemistry mark");
int chemistry = sc.nextInt();
System.out.println("enter computer mark");
int computers = sc.nextInt();
System.out.println("enter phisics mark");
int physics = sc.nextInt();	
System.out.println("enter maths mark");
int maths = sc.nextInt();	

float total = english + chemistry + computers + physics + maths;
float  Average = total / 5;
float Percentage = (total / 500) * 100;

System.out.println(" Total  =  " + total);
System.out.println(" Average  =  " + Average);
System.out.println("  Percentage =  " + Percentage);
}
	}


