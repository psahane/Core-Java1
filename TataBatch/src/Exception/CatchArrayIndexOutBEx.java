package Exception;

public class CatchArrayIndexOutBEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[3];
		  a[2]=5;
		  try
		  {
			   System.out.println("exeute ="+a[3]);
			   
	       }
		  catch(Exception e)
	   {
		System.out.println("not excute bec ArrayIndexOutOfBoundsException  ");
	   }
	  }
	}


