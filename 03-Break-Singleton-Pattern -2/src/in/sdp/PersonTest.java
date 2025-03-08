package in.sdp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonTest {
	public static void main(String[] args) throws Exception {
		Person p3 = Person.getPerson();
		System.out.println(p3.hashCode());
		Person p1 = Person.getPerson();
		System.out.println(p1.hashCode());
		
		ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("abc.obj"));
		oos.writeObject(p1);
		System.out.println("Serialization done ...");
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("abc.obj"));
		Person p2 = (Person)ois.readObject();
		System.out.println(p2.hashCode());
		
	}

}
