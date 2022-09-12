package Array;

import java.util.Scanner;

public class Dublicate {
	public static void main(String[] args)
    {
Scanner sc= new Scanner(System.in);
  
 System.out.println("enter the element=");
 int a[]=new int[5];
 int i,j,count,n;
for(i=0;i<5;i++)
   {
   a[i]=sc.nextInt();
   }
  System.out.println("duplicate values of an array =  ");
  count=0;
  for(i=0;i<5;i++)
  {
    for(j=i+1;j<5;j++)
     {
     if(a[i]==a[j])
       {
         System.out.println(a[j]+"  ");
          count++;
           }
          }
           }
       System.out.println("no of dublicete value is: "+count);
}
}


