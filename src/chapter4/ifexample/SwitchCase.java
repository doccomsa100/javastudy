package chapter4.ifexample;

//선택문 : 다중if문과 유사.
public class SwitchCase {

	public static void main(String[] args) {
		
		int ranking = 1; // 1, 2, 3 기타 이외의 값
		char medalColor;
		
		switch(ranking) {
			case 1: medalColor = 'G'; // Gold
				break;
			case 2: medalColor = 'S'; // Silver
				break;
			case 3: medalColor = 'B'; // Blons
				break;
			default:  // if문의 else 와 유사하다.
				medalColor = 'A';
		}
		
		System.out.println(ranking + "등 메달의 색깔은? " + medalColor + "입니다.");

	}

}
