package collection;

public class Item {
	int id;
	String  name;
	float cost;
	 Item(int id,String name,float cost)
	{
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
public String toString()
{
	return id+" "+name+" "+cost;
	}
public int  compareTo(Item i)
{
	if(this.cost<i.cost)
		return +1;
	else if(this.cost>i.cost)
		return -1;
	else
		return 0;
	
	}
public boolean equals(Object obj)
{
   if(this==obj)
   {
	   return true;
   }
   if(obj==null||this.getClass()!=obj.getClass())
   {
	   return false;
   }
   Item i=(Item)obj;
   return this.id==(i.id)&&this.name.equals(i.name)&&this.cost==(i.cost);
   
}
}
	
