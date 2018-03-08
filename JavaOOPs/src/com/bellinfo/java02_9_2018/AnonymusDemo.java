package com.bellinfo.java02_9_2018;

public class AnonymusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car tesla =new Car() {
			@Override
			public void engine() {
				// TODO Auto-generated method stub
			System.out.println("car run on battery");
			}	
			
			public void speed() {
				System.out.println("this car speed 80mph");
			}
		};
		Car bmw =new Car() {
			@Override
			public void engine() {
				// TODO Auto-generated method stub
			System.out.println(""
					+ "car run on battery and gas");
			}	
		};
		tesla.engine();
		bmw.engine();
		Vehicle plane=new Vehicle(){

			@Override
			public void modeOfTrans() {
				// TODO Auto-generated method stub
				System.out.println(" on Air");
			}
			
		};
		
		plane.modeOfTrans();
		                                                                                          
	}

}
interface Vehicle{
	void modeOfTrans();
	
}
class Car{
	public void engine() {
		System.out.println("Car run on gas");
	}
//	public void speed() {
//		System.out.println(" ");
//	}
}
