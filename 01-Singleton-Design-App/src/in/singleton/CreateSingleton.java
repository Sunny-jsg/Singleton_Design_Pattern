package in.singleton;

public class CreateSingleton {

	private static  CreateSingleton CreateSingleton;
	private CreateSingleton() {
		
	}
	public static  CreateSingleton getObject() {
		if(CreateSingleton == null) {
			 CreateSingleton = new CreateSingleton();
		}
		
		return  CreateSingleton;
		
	}

}

/*
 * 01. Make Constructor private 
 * 02. Object create with the help of static method factory
 * 03.cretae field to store object is private 
 */
