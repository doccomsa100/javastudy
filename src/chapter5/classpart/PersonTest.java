package chapter5.classpart;

public class PersonTest {

	public static void main(String[] args) {
		//Person클래스 사용 - 기억장소가 생성된 의미.
		Person ps1 = new Person();
		
		// ps1객체가 가리키는 기억장소표현
		ps1.name = "홍길동";
		ps1.height = 180;
		ps1.weight = 75;
		ps1.gender = 'M';
		ps1.married = true;
		
		ps1.getPersonInfo();
		
		
		Person ps2 = new Person();
		
		ps2.name = "홍길동";
		ps2.height = 180;
		ps2.weight = 75;
		ps2.gender = 'M';
		ps2.married = true;
		
		ps2.getPersonInfo();
		
		
		
		Person ps3 = new Person();
		
		Person ps4 = new Person();
		
		Person ps5 = new Person();
		
		

	}

}
