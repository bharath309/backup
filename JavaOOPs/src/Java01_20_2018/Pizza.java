package Java01_20_2018;

public class Pizza {

	private String pizzaType;
	private int size;
	private double cost;
	private String deliveryMode;
	private Payment pay; 
	private Mobile mobile;
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public Payment getPay() {
		return pay;
	}
	public void setPay(Payment pay) {
		this.pay = pay;
	}
	
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDeliveryMode() {
		return deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}
	@Override
	public String toString() {
		return "Pizza [pizzaType=" + pizzaType + ", size=" + size + ", cost=" + cost + ", deliveryMode=" + deliveryMode
				+ ", pay=" + pay + ", mobile=" + mobile + ", student=" + student + "]";
	}
	
	
}
