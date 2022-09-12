
/*
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F
*/
package Assingment3;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=5;
  for(int i=n;i>=-n;i--)
  {
	   for(int j=0;j<=Math.abs(i);j++)
	   {
		   System.out.print((char)(j+65)+" ");
		   }
	   System.out.println();
	   }
	}

}
