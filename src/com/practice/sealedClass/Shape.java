package com.practice.sealedClass;

public sealed abstract class Shape permits Circle, Rectangle {

	public abstract void print();
}
