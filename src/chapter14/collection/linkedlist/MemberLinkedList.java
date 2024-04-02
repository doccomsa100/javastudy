package chapter14.collection.linkedlist;


import java.util.LinkedList;

import chapter14.collection.Member;

// ArrayList클래스의 데이타로 Member클래스 사용하기. 
public class MemberLinkedList {

	// 기억장소를 인덱스로 관리하는 특징(순서가 있다.), 데이터중복허용
	private LinkedList<Member> linkedList;
	
	public MemberLinkedList() {
		linkedList = new LinkedList<Member>();
	}
	
	//데이타추가
	public void addMember(Member member) {
		linkedList.add(member); // 객체의 주소값저장
	}
	
	//데이터제거
	public boolean removeMember(int memberId) {
		
		// arrayList.size() : 컬렉션기억장소의 요소의 개수.
		for(int i=0; i<linkedList.size(); i++) {
			Member member = linkedList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				linkedList.remove(i); // 멤버를 삭제.
				return true;
			}
		}
		
		return false;

	}
	
	// 모든데이타 보기
	public void showAllMember() {
		// 4번반복
		for(Member member : linkedList) {
			System.out.println(member); // member.toString() 호출
		}
		System.out.println();
	}
}
