package Chap17.Ex05;

import java.util.ArrayList;
import java.util.List;

class Member{					//DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberid;
	private String memberName;
	
	public Member(int memberid,String memberName){ //생성자를 통해서 필드의 값 할당 
		this.memberid=memberid;
		this.memberName=memberName;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
		public String toString() {
			return memberName+" 회원님의 id는 "+ memberid+" 입니다. ";
		}
}

class MemberArrayList{		//MemberArrayList를 객체화 하면 ArrayList 객체가 생성된다.
	private ArrayList<Member> arrayList;
	
	//List<Member> alist=new ArrayList<Member>(); 제너릭타입 클래스 객체 생성.
	//ArrayList<Member> arraylist =new ArrayList<Member>();
	
	public MemberArrayList() { //기본생성자
		arrayList=new ArrayList<Member>();
	}//MemberArrayList를 객체 생성하면 arrayList가 ArrayList<Member>로 활성화된다.
	
	
	public void addMember(Member member) {	//Member 객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		arrayList.add(member);		// 
	}
	public void addMember2(int a, Member member) { //매개변수 2개를 받아서 //특정 index방번호에 값을 추가 (삽입).
	
		try {
		arrayList.add(a,member);
		}catch (IndexOutOfBoundsException e) { //Exception 처리한 것! 예외 발생되도 실행되도록!
			System.out.println("예외가 발생되었습니다.");
		}
	}
	public boolean removerMember(int memberid) {
		//Array List에 저장된 memberid를 검색해서 해당 객체를 삭제하는 메소드
		//memberid는 객체 내부에 있는 상태이다.
		
//		for(int i =0; i<arrayList.size(); i++) {
//			if(arrayList.get(i).getMemberid()== memberid) {
//				arrayList.remove(i);
//			}
//		}
//		return false;
//		
		for(int i =0; i<arrayList.size(); i++) {
			Member member= arrayList.get(i); //각방에 저장된 Member 객체를 member 참조변수에 할당
			int tempid = member.getMemberid();  //객체의 getMemberid(), 객체 내부에 있는 memberid를 가지고 온다!
			if(tempid == memberid) {
				arrayList.remove(i);  //arrayList 방에 저장된 객체를 제거.
				System.out.println("회원님의 " + memberid+"는 삭제되었습니다.");
				return true;
			}
		}
		System.out.println(memberid  + "회원님의 아이디는 존재하지 않습니다.");
		return false;

	}
	
	public void showsize() {
		System.out.println(arrayList.size());
	}
	
	public void showAllMember() {
		//ArrayList에 저장된 모든 사용자 정보를출력하는 메소드
		System.out.println(arrayList);		// 각방의 Member 객체 자체를 출력
	}
}

public class Ex_MemberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList =new MemberArrayList(); 
		//객체를 만드는 순간 MemberArrayList의 안에 있는 arrayList 필드가 활성화된다.
			// 메소드를 호출하기 위해서 객체를 생성했다. (addMember(),addMember2(), showAllMember(), removerMember())
		
		Member memberLee =new Member(1001,"이지원");
		Member memberSon =new Member(1002,"손흥민");
		Member memberPark =new Member(1003,"박서원");
		Member memberHong =new Member(1004,"홍길동");

		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showsize();
		
		//특정 index방에 추가적 사용자 추가
		
		memberArrayList.addMember2(0,memberHong);  //예외처리
		
		//모든사용자 정보 출력
		memberArrayList.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberArrayList.removerMember(1003);

	}

}
