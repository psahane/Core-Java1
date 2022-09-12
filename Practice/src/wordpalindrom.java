
public class wordpalindrom {
	public static void main(String[] args)
	{
		 
		       String s="AbaA";
		       String strrev="";
		         char ch;
		       
		            int strlength=s.length(); 
		          int i=strlength-1;
		          
		                while(i>=0)
		             {
		             ch=s.charAt(i);
		             strrev=strrev+ch;
		             i--;
		             
		            }
		                   
		             if(s.equalsIgnoreCase(strrev))
		               {
		                System.out.println("String is palindrome");
		                  }
		            else 
		                {
		               System.out.println("String is not Palindrome");
		                }
		                
		    }
}

