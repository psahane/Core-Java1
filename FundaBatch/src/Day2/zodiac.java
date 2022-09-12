package Day2;
import java.util.Scanner;
public class zodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the date ");
int mm=sc.nextInt();
int dd=sc.nextInt();
if(mm==1)
{
	if( dd<=19)
		System.out.println("your zodiac sing is capricon");
	else if(dd>=20&&dd<=31)
		System.out.println("your zodiac sing is Aqurius");
	else
		System.out.println("invalid date");
}
else 
	if(mm==2)
	{
		if(dd<=19)
			System.out.println("your zodiac sing is Aqurius");
		else if(dd>=20&&dd<=28)
			System.out.println("your zodiac sing is pisces");
		else
			System.out.println("invalid date");
	}

	
	else 
		if(mm==3)
		{
			if(dd<=20)
				System.out.println("your zodiac sing is pisces");
			else if(dd>=20&&dd<=31)
				System.out.println("your zodiac sing is aries");
			else
				System.out.println("invalid date");
		}

	}

}
