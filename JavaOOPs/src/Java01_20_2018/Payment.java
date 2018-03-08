package Java01_20_2018;

public class Payment {
	private String type;
	private double amount;
	private String cardType;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "payment [type=" + type + ", amount=" + amount + ", cardType=" + cardType + "]";
	}
	

}
