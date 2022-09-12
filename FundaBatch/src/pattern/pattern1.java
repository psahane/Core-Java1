

/*
1
12
123
1234
12345
 */
package pattern;
import java.util.Scanner;

public class pattern1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the row value ");
	int  r=sc.nextInt();
	int i,j;
	   
	   for(i=1;i<=r;i++)
	   {
	       for(j=1;j<=i;j++)
	       {
	           
	           System.out.print(j+" ");
	       }
	             System.out.println();
	  }
}
}
