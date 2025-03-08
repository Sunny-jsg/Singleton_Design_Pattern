package com.sy;

public class TestEngine {
	public static void main(String[] args) throws CloneNotSupportedException {
		Engine e1 = Engine.getEngine();
		System.out.println(e1.hashCode());
		Engine e2 = Engine.getEngine();
		System.out.println(e2.hashCode());
		
		// using clone method ...
		Engine e3 = (Engine)e1.clone();
		System.out.println(e3.hashCode());
	}

}
