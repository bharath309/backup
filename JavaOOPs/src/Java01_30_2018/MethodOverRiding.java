package Java01_30_2018;

public class MethodOverRiding {

	public static void main(String[] args) {
		
		ABC abc=new ABC();
		abc.show();
		XYZ xyz=new XYZ();
		xyz.show();
		ABC d =new XYZ();
		abc.show();
		d.show();
		
		
	}





}
class ABC{
	
	 void show(){
		System.out.println("inside ABC show method");
	}
	
	public void display() {
		System.out.println("inside ABC super class method");
	}
}

class XYZ extends ABC{
	 public void show() {
		System.out.println("inside XYZ show method");
	}
}