package Strings;

public class Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		 String input = "Java is a programming language";
		  char size = 'a';               
		   
		  
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
	      if(input.charAt(i) == size)
	      count++;
		  }
		  
		  System.out.println("The Character '"+size+"' appears "+count+" times.");
		
	}
}



