package in.singleton;

import java.lang.reflect.Constructor;

public class CarTest {
	public static void main(String[] args) throws Exception {
		Car c1 = Car.getcar();
		System.out.println(c1.hashCode());
		Car c2 = Car.getcar();
		System.out.println(c2.hashCode());

		Constructor<Car> constructor = Car.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Car c3 = constructor.newInstance();
		System.out.println(c3.hashCode());

	}

}
/* Reflection API to break Singleton design Pattern ...
 *1. if Object is there ==> throw exception from inside constructor 
 */
