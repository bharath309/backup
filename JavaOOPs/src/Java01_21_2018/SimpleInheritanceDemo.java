package Java01_21_2018;

public class SimpleInheritanceDemo {
	
	public static void main(String[] args) {
		
		SimpleChild child =new SimpleChild();
		
		System.out.println(child.b);
		child.dspInSB();
		
		System.out.println(child.a);
		child.dspInSB();
	}

}
class SimpleBase{
	
	int a =10;
	
	void dspInSB(){
		
		System.out.println("It is simple Base");
	}
			
}

class SimpleChild extends SimpleBase{
	int b=20;
	void dspInSC(){
		System.out.println("It is simple child calss");
		
	}
}