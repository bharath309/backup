package com.bharath.java.functionalInterfaces;

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		FunctionalInterfaceEx fie=new FunctionalInterfaceEx();
		System.out.println(fie.Operate(10, 30, additio));
		System.out.println(fie.Operate(20, 30, subt));
		MathOperation.sub();
		subt.add();
		
		
	}
	static MathOperation additio=(a,b) ->(a+b);
	static MathOperation subt=(a,b)->(a-b);
	MathOperation multi=(a,b)->(a*b);
	MathOperation devide=(a,b)->(a/b);
	/*static MathOperation addition =new MathOperation() {	
		@Override
		public int Operation(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println(a+b);
			return (a+b);
		}		
	};	
	static MathOperation subtraction=new MathOperation() {
		@Override
		public int Operation(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println(a-b);
			return (a-b);
		}		
	};*/
	 
			
			
	@FunctionalInterface
	interface MathOperation{
		abstract int Operation(int a, int b );
		
		default void add() {
			System.out.println("Hello");
		}
		static void sub() {
			System.out.println("world");
		}
	}
	
	int Operate(int a, int b, MathOperation operation) {
	
		return operation.Operation(a, b);
		
	}
}
