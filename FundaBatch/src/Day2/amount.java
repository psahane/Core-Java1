package Day2;
import java.util.Scanner;
public class amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the Amount");
int amt=sc.nextInt();

int n2000=amt/2000;
 amt=amt%2000;
 int n500=amt/500;
 amt=amt%500;
 int n200=amt/200;
 amt=amt%200;
 int n100=amt/100;
 amt=amt%100;
 int n50=amt/50;
 amt=amt%50;
 int n20=amt/20;
 amt=amt%20;
 int n10=amt/10;
 amt=amt%10;
 int n5=amt/5;
 amt=amt%5;
 int n2=amt/2;
 amt=amt%2;
 int n1=amt/1;
 amt=amt%1;
 System.out.println("notes of 2000 ="+n2000);
 System.out.println("notes of 500  ="+n500);
 System.out.println("notes of 200 ="+n200);
 System.out.println("notes of 100 ="+n100);
 System.out.println("notes of 50 ="+n50);
 System.out.println("notes of 20  ="+n20);
 System.out.println("notes of 10 ="+n10);
 System.out.println("notes of 5 ="+n5);
 System.out.println("notes of 2 ="+n2);
 System.out.println("notes of 1 ="+n1);
	}

}
