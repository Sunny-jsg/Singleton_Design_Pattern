package com.sy;

public class Engine implements Cloneable {
	public static Engine engine;

	private Engine() {

	}

	public static Engine getEngine() {
		if (engine == null) {
			engine = new Engine();
		}
		return engine;

	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return engine;
		
	}
}
