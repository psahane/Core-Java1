package Wrapper;

public class WrapperStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  Integer o=new Integer(45);
  Integer o1=new Integer("45");
  Integer o2=45;//AutoBoxing
  int val =o2;//AutoUnboxing
  int val1=o2.intValue();
  int v=Integer.parseInt("200");
  
  int x=90;
  Integer o3=Integer.valueOf(x);//Boxing
  
  System.out.println("Max value :"+Integer.MAX_VALUE);
  System.out.println("Min Value: "+Integer.MIN_VALUE);
  
 
  
  
  
	}

}
