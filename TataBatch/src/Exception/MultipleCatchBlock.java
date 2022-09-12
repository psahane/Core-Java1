package Exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		int a, b;
	         try
	          {
	           a=2; b=0;
	           String s=" pravin";
	           System.out.println("The Length of String="+s.length());
	          System.out.println(a/b);
	         }
	         
	        catch(NullPointerException e)
	             {
	                 System.out.println("String has null value");
	              }
	         catch(ArithmeticException e)
	        {
	        System.out.println("It is not possible."+e);
	         }
	    
	        catch(Exception e)
	          {
	        System.out.println("It is not possible.");
	         }
	         
	       }
	     }


