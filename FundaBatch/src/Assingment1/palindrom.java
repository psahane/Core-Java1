//20.	Print all palindrome numbers from 100 to 500
package Assingment1;
import java.util.Scanner;
public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, rem, i,rev; 
        i=100;

System.out.println("Enter number:");
 int s=sc.nextInt();          
System.out.println("Palindrome nos are:");
    while(i<s)
          { 
           rev=0; 
           rem=0; 
           n=i;
       while(n!=0)
       {
           rem=n%10;
        rev=rev*10+rem;

           if(rev==i) 

   System.out.print(rev+" ");
  n=n/10;   

}           
i++;
}
	}

}
