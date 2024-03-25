package chapter6.staticex;

public class StudentTest {

	public static void main(String[] args) {
		// JVM이 main()메서드를 호출하면서, 프로그램이 실행될 때, Student클래스의 static필드와메서드를 이용하여, 
		// static area에 메모리를 단 1번만 생성. 공유의 목적
		
		Student stu1 = new Student(); // 힙영역에 인스턴스 필드와 메서드를 가지고 기억장소가 생성된다.
		stu1.setStudentName("손흥민");
		System.out.println(stu1.getSerialNum());
		
		Student stu2 = new Student(); // 힙영역에 인스턴스 필드와 메서드를 가지고 기억장소가 생성된다.
		stu1.setStudentName("김민재");
		System.out.println(stu2.getSerialNum());

	}

}
