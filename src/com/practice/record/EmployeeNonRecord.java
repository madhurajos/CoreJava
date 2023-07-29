package com.practice.record;

import java.util.Objects;

public class EmployeeNonRecord {

	private int id;
	private String empName;
	
	public EmployeeNonRecord(int id, String empName) {
		super();
		this.id = id;
		this.empName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "EmployeeNonRecord [id=" + id + ", empName=" + empName + "]";
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
		EmployeeNonRecord other = (EmployeeNonRecord) obj;
		return Objects.equals(empName, other.empName) && id == other.id;
	}
	
	
}
