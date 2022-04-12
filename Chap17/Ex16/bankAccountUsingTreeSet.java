package Chap17.Ex16;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


//Account ��ü�� TreeSet�� ����, ano[���¹�ȣ],owner balance
//TreeSet�� �Ϲݰ�ü�� ���� ���� � �÷��� �������� ���� comparable<E> compareTo(), Comparator<E>
//Account ��ü�� �������� �ʰ� balance ���� ū�ͺ��� ��µǵ��� ����(��������)

public class bankAccountUsingTreeSet {
	//�÷���(ArrayList<E>)�� ����ؼ� Account ��ü����
	private static TreeSet<Account> aSet = new TreeSet<>(new Comparator<Account>() {

		@Override
		public int compare(Account o1, Account o2) {
			if(o1.getBalance()<o2.getBalance()) {
				return 1;
			}else if(o1.getBalance()==o2.getBalance()) {
				return 0;				
			}else {
				return-1;
			}
		}
		
	}); 	//�迭�� ��ü ����. �迭�� ���� ũ�⸦ ��������Ѵ�.
		//�迭�� ���� ũ�Ⱑ ����, ����� ���� ũ�⸦ ����, ���� ũ�⸦ ������ �� ����.
		//�÷����� ���� ũ�Ⱑ ���� ������ ����
		//���� �߰��Ҷ� add(): ����:size(); ���� ������ remove()
	private static Scanner scanner =new Scanner(System.in);
	public static int index=0;
	
	private static void createAccount() {
		//�ڵ��ۼ� : 1.���� ���� ��ĳ�ʷ� ���¹�ȣ �̸�, �ʱ�����ݾ� ��ǲ
		//�迭 ��ü�� ����
		System.out.println("-----------------------");
		System.out.println("1�� ���� ����");
		System.out.println("-----------------------");
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String ano = scanner.next(); 	//���¹�ȣ�� ��ǲ�޾Ƽ� ano������ �Ҵ� ���������̹Ƿ� �޼ҵ� �������� ���
		System.out.println("�̸��� �Է��ϼ���");
		String owner = scanner.next(); 	
		System.out.println("���� ���� �� �ʱ�ݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();		
		//�迭������ �޼ҵ� �ܺο��� ����� ��. ���������̴�. ��� �޼ҵ忡�� ��� ����
		//��ü�� �迭�� �����ؾ��Ѵ�. (����ִ� �濡 ����) for���� ����ؼ� null�ι��� ã�Ƽ� null�� ��� ��ü�� �����Ų��.
			Account acount = new Account(ano, owner, balance);
			aSet.add(acount);
			System.out.println();
		}
		
	
	private static void  accountList() {
		//�ڵ��ۼ� : ���¸�� ��� �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
		//�迭�� �� ���� ��ȸ�ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���. 
		System.out.println("-----------------------");
		System.out.println("2. ���� ��� ���");
		System.out.println("-----------------------");
		Iterator<Account> iterator1 = aSet.iterator();
		while(iterator1.hasNext()) {
			Account account=iterator1.next();
			if(account!=null) {
			System.out.println("���¹�ȣ : "+account.getAno());
			System.out.println("�̸� : "+account.getOwnew());
			System.out.println("�ݾ� : "+account.getBalance());
			System.out.println();
			}
		}
			
	}
	private static void deposit() {
		//3.����<== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ��� ��ǲ�޾Ƽ� �ش� ���¿� ����.
		//1.����ڷκ��� �Ա��� ���¸� �޾ƾ��Ѵ�.
		//2.����ڷκ��� ���� ���¹�ȣ�� �迭�� ����� ��ü���� ���¹�ȣ�� Ȯ�� �� 
		//3.�ش���¿� �ش��ϴ� �ݾ׿� �Աݱݾ��� �� �ؾ��Ѵ�.
		System.out.println("--------------");
		System.out.println("3. �����ϱ�");
		System.out.println("--------------");
		
		System.out.println("������ ���¹�ȣ�� �Է����ּ���.");
		String ano =scanner.next();
		System.out.println("���ݱݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano);  //findAccount(���¹�ȣ)
		if(account.getAno().equals(ano)) {
			account.setBalance(account.getBalance()+balance);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			System.out.println("����ݾ��� : "+ account.getBalance()+"�� �Դϴ�.");
		}
//		int result=findAccount(ano).getBalance()+balance;
//		findAccount(ano).setBalance(result);
//		System.out.println(findAccount(ano).getBalance());
		
		
	}
	private static void withdraw() {
		//4. ���
		System.out.println("--------------");
		System.out.println("4. ����ϱ�");
		System.out.println("--------------");
		
		System.out.println("����� ���¹�ȣ�� �Է����ּ���.");
		String ano =scanner.next();
		System.out.println("��ݱݾ��� �Է��ϼ���");
		int balance = scanner.nextInt();
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�.
		Account account = findAccount(ano);  //findAccount(���¹�ȣ)
		if(account==null) {
			System.out.println("�ش� ���¹�ȣ�� �������� �ʽ��ϴ�");
			return; //return�� ������ �޼ҵ带 �������´�
		}else {
			account.setBalance(account.getBalance()-balance); //������ �ݾ׿� �߰� �Ա��ѱݾ��� set�� �־ ���¿� ����.
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			System.out.println("����ݾ��� : "+ account.getBalance()+"�� �Դϴ�.");
		}
	}
	//�迭 Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
	//�����Ҷ��� ����Ҷ� �����ڵ�� ���, ���� �żҵ忡�� �ߺ����ɶ� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϱ� ����.
	private static Account findAccount(String ano) {
		Account account=null;	
		Iterator<Account> iterator1 = aSet.iterator();
		while(iterator1.hasNext()) {
			Account ac =iterator1.next();
			if(ac.getAno().equals(ano)) {
				account=ac;
			}
		}
		return account;
	}
	public static void main(String[] args) {
		boolean run=true;
		while(run) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1. ���� ���� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("------------------------------------------------------------");
			System.out.println("����>>");
			int selectNo = scanner.nextInt();
		
			if(selectNo==1) {
				createAccount(); //��ü ���� ���� �޼ҵ� ������ ȣ��(static), 
			}else if(selectNo==2) {
				accountList();
			}else if(selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				findAccount("11");
				break;
			}
		}
		scanner.close();
		System.out.println("���α׷� ����");
		

	}

}
