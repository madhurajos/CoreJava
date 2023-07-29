package com.practice.functionalinterface;

public class AddNumber implements Addition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Without FunctionalInterface
		/*Addition add = new Addition() {
			
			@Override
			public int add(int a, int b) {
				return a+b;
				
			}
		};*/
		
		//With FunctionalInterface
		Addition add = (a,b) -> a+b;
		
		printResult(add);
		add.print();// default methods allowed in functional interface, but can not be overridden without implementing interface(which gives CTE to override add method too
		Addition.printStatic(); // Static methods allowed in functional interface and can only be called with interface class name
		
		AddNumber ad = new AddNumber();
		printResult(ad);
		ad.print();
		
		Addition a = new AddNumber();
		printResult(ad);
		a.print();
	}
	
	public static void printResult(Addition add) {
		System.out.println(add.add(3, 4));
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inside child default");
	}

}
