
public class reverse {
	public static void main(String[] args) 
	{
		
	     String str1="I met yesterday with jems bond";
	    
	     
	      System.out.println("Original String:");
	      for(int i=0;i<str1.length();i++) 
	       {
			System.out.print(str1.charAt(i));
			
           	}
	      System.out.println("\nReverse String:");
		for(int i=str1.length()-1;i>=0;i--) 
	       {
			System.out.print(str1.charAt(i));
			
            	}

	}
	}

