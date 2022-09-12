package Strings;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String x = "Java is a programming language";
		 char y[]=x.toCharArray();
		  int  size = x.length(); 
		  char k ='a';
		  int i=0;
		  String  rem="";
		  while(i!=size)
		  {
			  if(y[i]!=k)
			  {
				  rem=rem+y[i];
				  
			  }
			  i++;
		  }
		  System.out.println(rem);
	}

}
