package ContainmentInheritanceAssin;

public class LaptopSetter {

	
	int cost;
	String brand;
	OperatingSystem os;
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public OperatingSystem getO() {
		return os;
	}
	public void setO(OperatingSystem o) {
		this.os = o;
	}
	public String toString()
	{
		return brand+"  "+cost+"  "+os;
	}	
}
