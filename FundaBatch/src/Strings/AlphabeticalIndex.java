package Strings;

public class AlphabeticalIndex {

	
	public static void main(String[] args) {
		String s1="the quick brown for the jumps over the lazy dog";
		char c[]=s1.toCharArray();
		
		for(char i='a';i<'z';i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(i==c[j])
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}


}
