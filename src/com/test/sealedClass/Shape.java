package com.test.sealedClass;

public sealed abstract class Shape permits Circle, Rectangle {

	public abstract void print();
}
