package Java01_20_2018;
import java.util.*;
public class PizzaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza dominos =new Pizza();
		
		Scanner in =new Scanner(System.in);
		System.out.println( "Enter pizzatype");
		String pizzatype =in.next();
		System.out.println( "Enter pizza size");
		int size =in.nextInt();
		System.out.println( "Enter cost");
		double cost=in.nextDouble();
		System.out.println( "Enter deliverymode");
		String deliverymode=in.next();
		
		
		Payment pay =new Payment(); 
		System.out.println( "Enter payment type");
		String type=in.next();
		System.out.println( "Enter payment amount");
		double amount =in.nextDouble();
		System.out.println( "Enter payment card type");
		String cardtype=in.next();
		
		Mobile mobile =new Mobile();
		mobile.setBrand("LG");
		mobile.setNetwork("Ultra.me");
		mobile.setNumber("662-408-6391");
		
		Student student =new Student();
		student.setId(1584);
		student.setFee(15000);
		student.setInstitution("CBU");
		student.setName("bharath");
		
		
		
		pay.setType(type);
		pay.setAmount(amount);
		pay.setCardType(cardtype);
		
		
		
		dominos.setPizzaType(pizzatype);
		dominos.setSize(size);
		dominos.setCost(cost);
		dominos.setDeliveryMode(deliverymode);
		
		dominos.setPay(pay);
		dominos.setMobile(mobile);
		dominos.setStudent(student);
		
		
		
		System.out.println(dominos);
		
		

	}

}
