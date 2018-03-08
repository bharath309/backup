package Java01_20_2018;

public class Mobile {
	private String brand;
	private String network;
	private String number;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", network=" + network + ", number=" + number + "]";
	} 
	
	
}
