
public class WhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  str="I am laerning java";
        String[] word=str.split(" ");
        String s="";
        int space=3;
        int  count=1;
        for(String w:word)
        {
        	s=s+w;
        	if(count<word.length)
        	for(int  i=1;i<=space*count;i++)
        	
        		s+="_";
        		count++;
        }
        System.out.println(s);
		}

}
