
public class DuplicateChar {
	public static void main(String[] args) 
	{
	String s1="h";
	
	char s[]=s1.toCharArray();
	
	System.out.println("Duplicate character in given String:");
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if(s[i]==s[j]) 
			{
				System.out.print(s[j]+ " ");
			}
		}
	}
	
	}
}
