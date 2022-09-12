package constructor;

public class ParameterConstructor {

	
	int id; 
	String name;
	ParameterConstructor(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterConstructor p =new ParameterConstructor(101,"pravin");
		System.out.println(p.id+"  "+p.name);
	}

}
