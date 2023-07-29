package com.practice.record;

public class RecordClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emprec1 = new Employee(1, "Employee1");
		Employee emprec2 = new Employee(2, "Employee2");
		
		System.out.println("to Sring emprec1 :: "+emprec1.toString()+" & emprec2 :: "+emprec2.toString());
		System.out.println("emprec1 hashcode :: "+emprec1.hashCode());
		System.out.println("emprec2 hashcode :: "+emprec2.hashCode());
		
		
		EmployeeNonRecord emp1 = new EmployeeNonRecord(1, "Employee1");
		EmployeeNonRecord emp2 = new EmployeeNonRecord(2, "Employee2");
		
		System.out.println("to Sring emp1 :: "+emp1.toString()+" & emp2 :: "+emp2.toString());
		System.out.println("emp1 hashcode :: "+emp1.hashCode());
		System.out.println("emp2 hashcode :: "+emp2.hashCode());
		
	}

}
