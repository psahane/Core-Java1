package inheritancepolymorphisum;

public class menu {
	
	void areaofcircle(float a)
	{
		 double area=3.14*a*a;
	     System.out.println("area of circle"+area);
	}
     void square(int a)
     
    	 {
 			int square=a*a;
 			System.out.println("square is ="+square);
 		}
     void  rectangle(int l,int w)
     {
    	double area= l*w;
    	System.out.println("rectangle is ="+area);
     }
     void triangle(float b,float h)
     {
    	 float area=(b*h)/2;
    	 System.out.println("triangle is ="+area);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  menu m=new menu();
    m.areaofcircle(10.5f);
    m.square(2);
    m.rectangle(3,6);
	}

}
