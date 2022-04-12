package Chap17.Ex05;

import java.util.ArrayList;
import java.util.List;

class Member{					//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
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
}

class MemberArrayList{		//MemberArrayList�� ��üȭ �ϸ� ArrayList ��ü�� �����ȴ�.
	private ArrayList<Member> arrayList;
	
	//List<Member> alist=new ArrayList<Member>(); ���ʸ�Ÿ�� Ŭ���� ��ü ����.
	//ArrayList<Member> arraylist =new ArrayList<Member>();
	
	public MemberArrayList() { //�⺻������
		arrayList=new ArrayList<Member>();
	}//MemberArrayList�� ��ü �����ϸ� arrayList�� ArrayList<Member>�� Ȱ��ȭ�ȴ�.
	
	
	public void addMember(Member member) {	//Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		arrayList.add(member);		// 
	}
	public void addMember2(int a, Member member) { //�Ű����� 2���� �޾Ƽ� //Ư�� index���ȣ�� ���� �߰� (����).
	
		try {
		arrayList.add(a,member);
		}catch (IndexOutOfBoundsException e) { //Exception ó���� ��! ���� �߻��ǵ� ����ǵ���!
			System.out.println("���ܰ� �߻��Ǿ����ϴ�.");
		}
	}
	public boolean removerMember(int memberid) {
		//Array List�� ����� memberid�� �˻��ؼ� �ش� ��ü�� �����ϴ� �޼ҵ�
		//memberid�� ��ü ���ο� �ִ� �����̴�.
		
//		for(int i =0; i<arrayList.size(); i++) {
//			if(arrayList.get(i).getMemberid()== memberid) {
//				arrayList.remove(i);
//			}
//		}
//		return false;
//		
		for(int i =0; i<arrayList.size(); i++) {
			Member member= arrayList.get(i); //���濡 ����� Member ��ü�� member ���������� �Ҵ�
			int tempid = member.getMemberid();  //��ü�� getMemberid(), ��ü ���ο� �ִ� memberid�� ������ �´�!
			if(tempid == memberid) {
				arrayList.remove(i);  //arrayList �濡 ����� ��ü�� ����.
				System.out.println("ȸ������ " + memberid+"�� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberid  + "ȸ������ ���̵�� �������� �ʽ��ϴ�.");
		return false;

	}
	
	public void showsize() {
		System.out.println(arrayList.size());
	}
	
	public void showAllMember() {
		//ArrayList�� ����� ��� ����� ����������ϴ� �޼ҵ�
		System.out.println(arrayList);		// ������ Member ��ü ��ü�� ���
	}
}

public class Ex_MemberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList =new MemberArrayList(); 
		//��ü�� ����� ���� MemberArrayList�� �ȿ� �ִ� arrayList �ʵ尡 Ȱ��ȭ�ȴ�.
			// �޼ҵ带 ȣ���ϱ� ���ؼ� ��ü�� �����ߴ�. (addMember(),addMember2(), showAllMember(), removerMember())
		
		Member memberLee =new Member(1001,"������");
		Member memberSon =new Member(1002,"�����");
		Member memberPark =new Member(1003,"�ڼ���");
		Member memberHong =new Member(1004,"ȫ�浿");

		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showsize();
		
		//Ư�� index�濡 �߰��� ����� �߰�
		
		memberArrayList.addMember2(0,memberHong);  //����ó��
		
		//������� ���� ���
		memberArrayList.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberArrayList.removerMember(1003);

	}

}
