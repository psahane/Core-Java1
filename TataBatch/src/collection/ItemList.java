package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ItemList {
	
	ArrayList<Item>l=new ArrayList<>();
	public void addEle()
	{
		l.add(new Item(101,"dress",500));
		l.add(new Item(102,"shrt",500));
		l.add(new Item(103,"pant",600));
		l.add(new Item(104,"bottle",50));
		l.add(new Item(105,"kk",52));
		
	}
	public void showOccurance()
	{
		ListIterator<Item> l1=l.listIterator();
		for(int i=0;i<l.size();i++)
			
		{
			if(l.get(i)==null)
			continue;
			int cnt=0;
			for(int j=0;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
					cnt++;
					l.set(j, null);
					
					
				}
			}
	           
			System.out.println("name"+l.get(i)+"occures"+cnt+"times");	
			
		}
		
	}
}
