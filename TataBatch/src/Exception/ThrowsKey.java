package Exception;

public class ThrowsKey {

    int a[]=new int[5];
	
	public void division() throws ArrayIndexOutOfBoundsException,Exception
	{
	a[5]=20/0;	
	}
	
	public static void main(String[] args) {
		ThrowsKey t=new ThrowsKey();
		try
		{
		t.division();
		}
		catch(Exception e)
		{
			System.out.println("Array Index Out Of Bounds Exception:"+e);
		}
		
	}
}
