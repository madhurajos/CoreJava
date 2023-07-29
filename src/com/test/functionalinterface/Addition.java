package com.test.functionalinterface;

@FunctionalInterface
public interface Addition {
	
	public int add(int a,int b);
	
	public default void print() {
		System.out.println("Inside default method");
	}
	
	public static void printStatic() {
		System.out.println("Inside static method");
	}
}
