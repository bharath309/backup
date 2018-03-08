package Java01_21_2018;

public class MultilevelInheritanceDemo {
	
	
	public static void main(String[] args) {
		
		
		
	}

}
class A{
	
	int a =10;
	
	void dspInSB(){
		
		System.out.println("It is simple Base");
	}
			
}

class B extends A {
	int b=20;
	void dspInSC(){
		System.out.println("It is simple child calss");
		
	}
}

class C extends B {
	
	int c =10;
	
	void dspInSB(){
		
		System.out.println("It is simple Base");
	}
			
}

