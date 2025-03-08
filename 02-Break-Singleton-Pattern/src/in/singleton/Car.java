package in.singleton;

public class Car {
	public static Car car;

	private Car() {
		// if Object is there ==> throw exception from inside constructor
		if (car != null) {
			throw new RuntimeException("Trying to break Singleton design pattern ...");
		}

	}

	public static Car getcar() {
		if (car == null) {
			car = new Car();
		}

		return car;
	}

}
