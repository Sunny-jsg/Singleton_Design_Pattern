package in.singleton;

public class Test {
	public static void main(String[] args) {
		CreateSingleton obj1 = CreateSingleton.getObject();
		System.out.println(obj1.hashCode());
		CreateSingleton obj2 = CreateSingleton.getObject();
		System.out.println(obj2.hashCode());
	}

}
