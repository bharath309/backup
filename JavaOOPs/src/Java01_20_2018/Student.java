package Java01_20_2018;

public class Student {

	private String name;
	private String institution;
	private int id;
	private double fee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", institution=" + institution + ", id=" + id + ", fee=" + fee + "]";
	}
	
	
}
