package Day2;
import java.util.Scanner;
public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A')
	System.out.println("vowel");
else
	System.out.println("not vowel");
	}

}
