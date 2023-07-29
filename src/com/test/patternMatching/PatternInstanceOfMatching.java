package com.test.patternMatching;

import java.util.Objects;

public class PatternInstanceOfMatching {

	private String str;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		return Objects.hash(str);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatternInstanceOfMatching other = (PatternInstanceOfMatching) obj;
		return Objects.equals(str, other.str);
	}
	
	

}
