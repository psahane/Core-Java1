

/*       9
        898
       78987
      6789876
     567898765
    45678987654
   3456789876543
  234567898765432
 12345678987654321
*/
package Assingment3;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=9;
   for(int i=1;i<=n;i++)
   {
	   for(int j=1;j<=n*2;j++)
	   {
		   if(j>=n-i+1 && j<=n)
		   {
			   System.out.print(j+"");
			   
		   }
		   else if(j>n && j+1<=n+i)
		   {
			   System.out.print((n*2-j)+"");
		   }
		   else
		   {
			   System.out.print(" ");
		   }
	   }
	   System.out.println();
   }
   
	}

}
