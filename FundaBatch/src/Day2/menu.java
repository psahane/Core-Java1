package Day2;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter two number ");
int  a=sc.nextInt();
int  b=sc.nextInt();
System.out.println("Enter choice number ");
int  c=sc.nextInt();
if(c==1)
{
	int s=a+b;
System.out.println("addition is "+s);
}
else if(c==2)
{
	int s=a-b;
	System.out.println("subtraction is"+s);
}
else if(c==3)
{
	int s=a*b;
	System.out.println("multiplication is"+s);
}
else if(c==4)
{
	int s=a/b;
	System.out.println("division is"+s);
}
	}

}
