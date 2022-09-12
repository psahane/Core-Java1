
import java.util.Scanner;

public class Dublicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter 10 Numbers:");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Duplicate no is:");
		int cnt=0;
		int j;
		for(int i=0;i<10;i++) {
			
			for( j=i+1;j<10;j++) {
				if(a[i]==a[j]) {
					cnt=cnt+1;
					System.out.print(a[j]+" ");
				}
				
			}
		
			
		}
		System.out.println(" \n No of duplicate number:"+cnt);
	}

}
	

	

