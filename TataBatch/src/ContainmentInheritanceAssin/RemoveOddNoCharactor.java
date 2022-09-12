package ContainmentInheritanceAssin;

public class RemoveOddNoCharactor {

	static String removeoddidexcharactor(String s)
	{
	String str="";
	   for(int i=0;i<s.length();i++)
	   {
		   if(1%2==1)
			   continue;
		   str=str+s.charAt(i);
		   
	   }
	   return str;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String st="sahane";
   st=removeoddidexcharactor(st);
   System.out.println(st);
	
	}
}
