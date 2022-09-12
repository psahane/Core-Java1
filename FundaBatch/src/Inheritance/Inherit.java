package Inheritance;



class lmn
{
	int k;
   void Disp()
   {
	   System.out.println("lmn clss is called ");
	   
   }
   
}
class Second extends lmn
{
	
	void disp1()
	{
		k=80;
		System.out.println("second class is called :"+k);
		
	}
	}

public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Second s=new Second();
     s.Disp();
     s.disp1();
	}

}
