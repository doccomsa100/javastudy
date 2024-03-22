package chapter5.hiding;

// 접근자 - 4가지 유형
/* 
 private : 접근금지
 접근자 사용안함. default  동일 패키지에서는 public, 다른 패키지에서는 private 
 public : 접근허용.
 
 protected : 상속접근자.
 
 private < default < public
 default 필드는 동일한 패키지 일경우는 접근이되고, 다른 패키지에서는 접근이 안된다.
 */
public class MyDate {
	public int day;
	int month;  // 접근자 생략시 default 의미.
	private int year;
}
