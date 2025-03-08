package in.sdp;

import java.io.Serializable;

public class Person implements Serializable {
	public static Person person;

	private Person() {

	}

	public static Person getPerson() {
		if (person == null) {
			person = new Person();
		}
		return person;
	}

	// implementing readResolve method...
	public Object readResolve() {
		return person;

	}

}
