package InnerClass;

public class Society {
	
	int sno;
	String  name;
	
    Society(int i,String n)
	{
		this.sno=i;
		this.name=n;
	}
	void ShowDetail()
	{
		System.out.println("sno:"+sno+"\nname"+name);
	}
	
	class Flat
	{
	  int fId;
	  String fOwner;
	  
	  Flat(int i,String n)
	  
	  {
		fId=i;
		fOwner=n;
	 }
	  void showInfo()
	  {
		  System.out.println("fId"+fId+"\nfOwner"+fOwner);
	  }
	  class ClubHouse
	  {
		  
	  }
	}
	public static void main(String[] args) {
		Flat f=new Society(12,"abc").new Flat(101,"kkk");
		
		f.showInfo();
		
	}

}
