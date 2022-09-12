package Day3;
import java.util.Scanner;
public class demoswitch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	switch(choice)
	{
		case 1:System.out.println("sum="+(a+b));
		        break;
		case 2:System.out.println("sub="+(a-b));
                 break; 
		case 3:System.out.println("mult="+(a*b));
                break;  
		case 4:System.out.println("div ="+(a/b));
                 break;
         default:System.out.println("invalid choice");        
	}
	
}
}
