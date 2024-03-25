package chapter6.singleton;

// 싱글톤 패턴디자인으로 설계하라.
public class Person {

	private static Person instance = new Person();
	
	
	private Person() {};
	
	
	public static Person getInstance() {
		
		if(instance == null) {
			instance = new Person();
		}
		
		return instance;
	}
}
