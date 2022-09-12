package Practice;

public class Company {
	int id ,year;
	String name;
	Car c;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getC() {
		return c;
	}

	public void setC(Car c) {
		this.c = c;
	}

	public String toString()
	{
		return id+""+name+""+year+""+c;
    
	}

}
