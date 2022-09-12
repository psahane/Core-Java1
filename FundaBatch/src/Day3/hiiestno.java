package Day3;
import java.util.Scanner;
public class hiiestno {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num,sum=0;
	System.out.println("enetr any no ");
	num=sc.nextInt();
	while(num!=0)
	{
		int a=num%10;
		if(a>sum)
		{
			sum=a;
			
		}
		num=num/10;
		
	}
	System.out.println(sum);
}
}
