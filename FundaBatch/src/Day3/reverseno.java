package Day3;
import java.util.Scanner;

public class reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num,reverse=0;
System.out.println("enetr any no ");
num=sc.nextInt();
while(num!=0)
{
	int d=num%10;
	reverse=reverse*10+d;
	num=num/10;
	}
System.out.println("reverse num is ="+reverse);
	}

}
