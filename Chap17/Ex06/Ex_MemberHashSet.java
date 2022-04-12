package Chap17.Ex06;

//Member 클래스의 memberid 컬럼을 equals(), hashCode()


//중요 : Set은 중복된 값을 저장하면 안된다!
	//Wrapper 클래스는 Integer, Long, Double, Float, Character, Byte,Short, Boolean
	//Wrapper클래스는 equals(),hashCode()메소드가 재정의 되어있다.
	//특정 객체를 생성 후 그 객체를 Set에 저장할 경우 그 객체의 Object클래스의 equals(),hashCode()를 재정의해줘야한다.
	//객체의 특정 필드의 값이 같을 때 중복을 식별하는 필드를 생성.

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Member{					//DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberid;		//Set에 넣을 식별자, memberid 필드의 값이 같을때 같은객체이다라고 선언
								//equals(), hashCode()
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
	@Override				//member1.equals(member2)
		public boolean equals(Object obj) { //객체의 정보가 Object로 업캐스팅
			if(obj instanceof Member) {		//다운캐스팅 런타임 오류를 방지하기 위해서, Object에 Member 객체가 포함되어있을때
				Member member2 = (Member)obj; //obj는 Object로 업캐스팅되어서 다운캐스팅 
				if(this.memberid==member2.memberid) {		//this.memberid: member1객체 / member.memberid:member2
					return true;
				}else {
					return false;
				}
	//			if(this.memberid==((Member)obj).memberid && this.memberName==((Member)obj).memberName) {
	//				return true;
	//			}
			}
				return false;		//obj가 Member타입을 내포하지 않을때 false
		}
	@Override
		public int hashCode() {  //memeberid의 값이 같을때 동일한 hashCode를 생성.
			return Objects.hash(memberid);  //권장사항! ,여러개의 필드를 조건으로 hashCode를 생성할 수 있다.
			//return Objects.hash(memberid, memberName); 필드의 값이 모두 동일할 경우 동일한 hashCode();
			//return memberid; //this.memberid;		//하나의 필드만을 조건으로 hashCode()를 생성.
			
		}
}

class MemberHashSet{		//MemberSet를 객체화 하면 Set 객체가 생성된다.
	private Set<Member> hashset; //Set선언 : <Member>만 들어올수 있다!!!! 필드의 private(생성자, setter)
								//Set <member> hashSet =new HashSet<Member>();
			
	
	
	public MemberHashSet() { //기본생성자
		hashset=new HashSet<Member>();
	}
	
	public void addMember(Member member) {	//Member 객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		hashset.add(member);		// Member객체를 인풋받아 hashSet에 member 객체를 저장, 중복저장되면 안된다!
	}								//Member 객체의 memberid 필드 값이 동일할 경우, 동일한 객체이다라고 정의
									//equals(), hashcode() 메소드 재정의 : memberid
	
	public boolean removerMember(int memberid) { 	//memberid는 Member객체 내의 필드이므로 Set에 저장된 객체를 가져와야한다.
		//Set은 index가 존대하지 않으므로 기본 for문을 사용할 수 없다.
		//향상된 for문 사용
		Iterator<Member> iterator = hashset.iterator();		//iterator : 순회자
		while(iterator.hasNext()) {					//hasNext() : hashSet에 값이 존재할 때 true, false
			Member member = iterator.next();		//Next(): 현재 값을 던져주고 다음값으로 이동/
			int tempid = member.getMemberid();
			if(tempid==memberid) {
				hashset.remove(member);
				return true;
			}
		}
//			while(iterator.hasNext()) {
//				Member member=iterator.next();
//				int mem = member.getMemberid();
//				if(mem == memberid) {
//					hashset.remove(member);
//					return true;
//				}
//			}
			System.out.println("아이디가 존재하지 않습니다.");
			return false;
	}
	
	public void showsize() {
		System.out.println(hashset.size());
	}
	
	public void showAllMember() {
		Iterator<Member> iterator = hashset.iterator();{ 		//지역변수   
			while(iterator.hasNext()) {
				Member member =iterator.next(); //hashset의 값을 가지고 온다.
				System.out.println(member);		//hashSet의 객체를 출력, toString()재정의 : 필드의 값을 출력.
			}
		}
	}
}

public class Ex_MemberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberSet =new MemberHashSet(); 
		//객체를 만드는 순간 MemberSet의 안에 있는 Set 필드가 활성화된다.
			// 메소드를 호출하기 위해서 객체를 생성했다. (addMember(),addMember2(), showAllMember(), removerMember())
		
		Member memberLee =new Member(1001,"이지원");
		Member memberSon =new Member(1002,"손흥민");
		Member memberPark =new Member(1003,"박서원");
		Member memberHong =new Member(1004,"홍길동");
		Member memberLee2 =new Member(1001,"이지원");

		memberSet.addMember(memberLee);
		memberSet.addMember(memberSon);
		memberSet.addMember(memberPark);
		memberSet.addMember(memberHong);
		memberSet.addMember(memberLee2);

		memberSet.showsize(); //4개 출력
		
		//모든사용자 정보 출력
		memberSet.showAllMember();
		
		System.out.println();
		//특정 id를 가진 사용자 제거
		memberSet.removerMember(1004);
		memberSet.showAllMember();


	}

}
