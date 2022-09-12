package collection;

import java.util.ArrayList;

public class EvenNo {
	public void evenNumber()
	{
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				l.add(i);
			}
		}
		System.out.println(l);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		EvenNo e=new EvenNo();
		e.evenNumber();
		
	}

}
