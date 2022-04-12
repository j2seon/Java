package Chap15.Ex14;

// ������ ����
  // 1. NEW		 		: ������ ��ü ���� �� .start()�޼ҵ尡 ȣ��Ǳ� �� ����
  // 2. RUNNABLE	  	: .start()�޼ҵ尡 ȣ��Ǹ� run()�޼ҵ� ������ �ڵ尡 CPU���� ����ǰ� �ִ� ����
  // 3. TERMINATED		: run()�� ��� �ڵ尡 ����ǰ� ���� ������ ����
  // 4. TIMED WARITING	: �����ð����ȸ� ������ , Thread.sleep(1000);,
  //						a.join(1000) <=== ���� �ڽ��� ������� 1�� �����¿� �ְ�, a ��ü �� ������·� ��������.(�纸) 
  //					  Ư�� �ð��� ����Ǹ� ���� ���˷� ��, ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� ���� ���·� ��.
  // 5. BLOCK 			: ����ȭ ó������ Lock�� �ɷ��� ������ ��� ���ܵ� ����, Ű�� �ݳ��� ��� Ű�� Ȯ���ؼ� ������·� ��. 
  // 6. WAITING			: ������ ������, ���� ������� �������� �� �� �ִ�.


public class NewRunnableTerminated {

	public static void main(String[] args) {
		//�������� ���¸� �����س��� Ŭ�����̴�. �� 6�� ���¸� ������ �� �ִ�.
		Thread.State state;		//state �������� 6���� ����� 
		
		//1. ��ü ����(NEw) �͸� ����Ŭ����
		Thread myThread = new Thread() {
			@Override
			public void run() {
				for(long i=0; i<1000000000L; i++) {} //0.5�� �ð� ����,CPU���� �����ϴ�.
					//��ü ���� �� �ణ�� �ð��� �ʿ�. 
					//�޸��� �Ҵ�ð��� �ʿ�
 			}
		};
		state = myThread.getState(); //�������� ���¸� ������ �ͼ� state ������ �Ҵ�.
		 System.out.println("myThread state : "+ state);
		
		 //2.myThread ����

		 myThread.start(); 	//�����带 ���� �� CPU���� ����
		 state = myThread.getState();
		 System.out.println("myThread Stat : "+ state);  //Runnable
		 
		 //3. myThread ����
		 //myThread.join(); �� ������{main}�� ����ϰ� , myThread�� ó���϶�
		 try {myThread.join();} catch (InterruptedException e) {}
		 state = myThread.getState();
		 System.out.println("myThread State : "+state);  //TERMIATED
		 
	}

}
