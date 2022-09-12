package constructor;

import java.util.Scanner;

public class theater {
String name,move1,move2,move3,move4,add;
String contact,move;

public String getName() {
	   return name;
}

public void setName(String name)
{
	   this.name=name;
}
public String getMove1()
{
	   return move1;
}

public void setMove1(String move1)
{
	
	   this.move1=move1;
}
public String getMove2()
{
	   return move2;
}

public void setMove2(String move2)
{
	   this.move2=move2;
}
public String getMove3() {
	   return move3;
}
public void setmove3(String move3)
{
	   this.move3=move3;
}
public String getMove4()
{
	   return move4;
}
public void setMove4(String move4)
{
	   this.move4=move4;
}
public String getAdd() {
	   return add;
}
public void setAdd(String add)
{
	   this.add=add;
}
public String getContact() {
	   return contact ;
}
void setConact(String contact)
{
	   this.contact=contact;
}

public void moveDetail(String move)
{
	
	if(move.equalsIgnoreCase(move1))
	{
		System.out.println("tiket price:150,200,250");
	System.out.println("shows: 9am,12pm,3pm,6pm,9pm");
	
	}
else if(move.equals(move2))
{
	System.out.println("tiket price:150,200,250");
    System.out.println("shows: 9am,12pm,3pm,6pm,9pm");
}
else 
{
	System.out.println("no such move");
	
}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		theater t1=new theater();
		
		
		t1.setName("mangldeep");
		t1.setAdd("sangmaner");
		t1.setConact("1234567890");
		t1.setMove1("RRR");
		t1.setMove2("pushpa");
		t1.setmove3("radhesham");
		t1.setMove4("kgf2");
		Scanner sc=new Scanner(System.in);
		
		System.out.println(t1.getName());
		
		System.out.println("move :"+t1.getMove1()+"/ "+t1.getMove2()+"/ "+t1.getMove3()+"/ "+t1.getMove4());
		System.out.println("enter the move name ");
		String move=sc.nextLine();
		t1.moveDetail(move);
		
		
		
		
	
}
}
