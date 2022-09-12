package Interface;

public class Book {

	
		int bid,cost;
		String  bName,aName;
		Book(int i,int  c,String a,String b)
		{
			bid=i;
			cost=c;
			aName=a;
			bName=b;
			
			}
		
		
		void publish(String  Publication)
		{
			
		System.out.println(Publication);	
		}
		public String toString()
		{
			return bid+"  "+cost+"  "+aName+"  "+bName;
		}
}
		
