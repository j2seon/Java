package Chap17.Ex06;

//Member Ŭ������ memberid �÷��� equals(), hashCode()


//�߿� : Set�� �ߺ��� ���� �����ϸ� �ȵȴ�!
	//Wrapper Ŭ������ Integer, Long, Double, Float, Character, Byte,Short, Boolean
	//WrapperŬ������ equals(),hashCode()�޼ҵ尡 ������ �Ǿ��ִ�.
	//Ư�� ��ü�� ���� �� �� ��ü�� Set�� ������ ��� �� ��ü�� ObjectŬ������ equals(),hashCode()�� ������������Ѵ�.
	//��ü�� Ư�� �ʵ��� ���� ���� �� �ߺ��� �ĺ��ϴ� �ʵ带 ����.

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Member{					//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;		//Set�� ���� �ĺ���, memberid �ʵ��� ���� ������ ������ü�̴ٶ�� ����
								//equals(), hashCode()
	private String memberName;	
	
	public Member(int memberid,String memberName){ //�����ڸ� ���ؼ� �ʵ��� �� �Ҵ� 
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
			return memberName+" ȸ������ id�� "+ memberid+" �Դϴ�. ";
		}
	@Override				//member1.equals(member2)
		public boolean equals(Object obj) { //��ü�� ������ Object�� ��ĳ����
			if(obj instanceof Member) {		//�ٿ�ĳ���� ��Ÿ�� ������ �����ϱ� ���ؼ�, Object�� Member ��ü�� ���ԵǾ�������
				Member member2 = (Member)obj; //obj�� Object�� ��ĳ���õǾ �ٿ�ĳ���� 
				if(this.memberid==member2.memberid) {		//this.memberid: member1��ü / member.memberid:member2
					return true;
				}else {
					return false;
				}
	//			if(this.memberid==((Member)obj).memberid && this.memberName==((Member)obj).memberName) {
	//				return true;
	//			}
			}
				return false;		//obj�� MemberŸ���� �������� ������ false
		}
	@Override
		public int hashCode() {  //memeberid�� ���� ������ ������ hashCode�� ����.
			return Objects.hash(memberid);  //�������! ,�������� �ʵ带 �������� hashCode�� ������ �� �ִ�.
			//return Objects.hash(memberid, memberName); �ʵ��� ���� ��� ������ ��� ������ hashCode();
			//return memberid; //this.memberid;		//�ϳ��� �ʵ常�� �������� hashCode()�� ����.
			
		}
}

class MemberHashSet{		//MemberSet�� ��üȭ �ϸ� Set ��ü�� �����ȴ�.
	private Set<Member> hashset; //Set���� : <Member>�� ���ü� �ִ�!!!! �ʵ��� private(������, setter)
								//Set <member> hashSet =new HashSet<Member>();
			
	
	
	public MemberHashSet() { //�⺻������
		hashset=new HashSet<Member>();
	}
	
	public void addMember(Member member) {	//Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		hashset.add(member);		// Member��ü�� ��ǲ�޾� hashSet�� member ��ü�� ����, �ߺ�����Ǹ� �ȵȴ�!
	}								//Member ��ü�� memberid �ʵ� ���� ������ ���, ������ ��ü�̴ٶ�� ����
									//equals(), hashcode() �޼ҵ� ������ : memberid
	
	public boolean removerMember(int memberid) { 	//memberid�� Member��ü ���� �ʵ��̹Ƿ� Set�� ����� ��ü�� �����;��Ѵ�.
		//Set�� index�� �������� �����Ƿ� �⺻ for���� ����� �� ����.
		//���� for�� ���
		Iterator<Member> iterator = hashset.iterator();		//iterator : ��ȸ��
		while(iterator.hasNext()) {					//hasNext() : hashSet�� ���� ������ �� true, false
			Member member = iterator.next();		//Next(): ���� ���� �����ְ� ���������� �̵�/
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
			System.out.println("���̵� �������� �ʽ��ϴ�.");
			return false;
	}
	
	public void showsize() {
		System.out.println(hashset.size());
	}
	
	public void showAllMember() {
		Iterator<Member> iterator = hashset.iterator();{ 		//��������   
			while(iterator.hasNext()) {
				Member member =iterator.next(); //hashset�� ���� ������ �´�.
				System.out.println(member);		//hashSet�� ��ü�� ���, toString()������ : �ʵ��� ���� ���.
			}
		}
	}
}

public class Ex_MemberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberSet =new MemberHashSet(); 
		//��ü�� ����� ���� MemberSet�� �ȿ� �ִ� Set �ʵ尡 Ȱ��ȭ�ȴ�.
			// �޼ҵ带 ȣ���ϱ� ���ؼ� ��ü�� �����ߴ�. (addMember(),addMember2(), showAllMember(), removerMember())
		
		Member memberLee =new Member(1001,"������");
		Member memberSon =new Member(1002,"�����");
		Member memberPark =new Member(1003,"�ڼ���");
		Member memberHong =new Member(1004,"ȫ�浿");
		Member memberLee2 =new Member(1001,"������");

		memberSet.addMember(memberLee);
		memberSet.addMember(memberSon);
		memberSet.addMember(memberPark);
		memberSet.addMember(memberHong);
		memberSet.addMember(memberLee2);

		memberSet.showsize(); //4�� ���
		
		//������� ���� ���
		memberSet.showAllMember();
		
		System.out.println();
		//Ư�� id�� ���� ����� ����
		memberSet.removerMember(1004);
		memberSet.showAllMember();


	}

}
