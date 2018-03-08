package Java01_20_2018;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ABC abc =new ABC();
			System.out.println(abc.b);

	}
}
		
		class ABC{
		public	int a=10;
		public static int b=10;
		
		public void display() {
			System.out.println("hello see here");
			print();
		
		}
		public static void print () {
			System.out.println("see here also");
			ABC abc= new ABC();
			abc.display(); 
		}
	}


