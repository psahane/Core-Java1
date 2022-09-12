package ContainmentInheritanceAssin;

public class OperatingSystemSetter {
	String osName,vendor;
	double version;
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String toString()
	{
		return osName+" "+vendor+" "+version;
	}

}
