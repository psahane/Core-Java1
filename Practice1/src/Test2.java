
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		while(true)
		{
			if(cnt>4)
			break;
			if(cnt==0)
			{
				cnt++;
				continue;
				
			}
			System.out.print(cnt+",");
			cnt++;
		}
		}
	}


