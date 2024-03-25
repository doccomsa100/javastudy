package chapter6.singleton;

public class PersonTest {

	public static void main(String[] args) {
		
		Person ps1 = Person.getInstance();
		Person ps2 = Person.getInstance();
		
		System.out.println(ps1 == ps2);


	}

}
