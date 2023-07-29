package com.practice.record;

import java.util.Objects;


public record Employee(int id,String empName) {

	public int id() {
		return id;
	}

	public String empName() {
		return empName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empName, other.empName) && id == other.id;
	}

	
	
}
