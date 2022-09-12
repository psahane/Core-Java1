package Containment;


public class Person {

	String age;
	String name,gender;
	Address a;
	
   public String getAge() {
		return age;
	}
     public void setAge(String age) {
		this.age = age;
	}
   public String getName() {
		return name;
	}
   public void setName(String name) {
		this.name = name;
	}

  public String getGender() {
		return gender;
	}

   public void setGender(String gender) {
		this.gender = gender;
	}
	
   public Address getA() {
		return a;
	}

    public void setA(Address a) {
		this.a = a;
	}

     public String toString() 
		
	
	{
		return name+""+gender+" "+age+""+a;
	}
    
	
}
