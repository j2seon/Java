package Chap14.Ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		//1. ���� ���ҽ� ����(�������α׷��� ���)
		System.out.println("���ڸ� �Է��ϼ���!");
		
		//�ڵ��޸� ����
		try(InputStreamReader isr1= new InputStreamReader(System.in);){
			char input =(char)isr1.read();
			System.out.println("�Է±��� = " + input);
		}catch(IOException e) {
			e.printStackTrace();
		}//finally����� �����ϴ��� ��ü�� �ڵ����� .close()
		
		
		
		
		InputStreamReader isr2 = null;  //��� �� �ݵ�� �޸� ���� �ʿ�
		//System.in : �ֿܼ��� �Է��� �޵�������!(�ѹ��� ��ǲ�� ���� �� �ִ� / ��ü�� ����Ǹ� �ι� ��ǲ�� ���޴´�.)
		try {
		isr2= new InputStreamReader(System.in);
		char input = (char) isr2.read(); //�Ϲݿ���(checked ����):IOException : �Է���� ����
		System.out.println("�Է±��� = "+ input);
		
		}catch (IOException e) {
			e.printStackTrace();//try ������� ���ܰ� �߻��� ��� �ڼ��� ������ ����ض�
		}finally { //��ü�� ��� �� �޸� �������� ���� ��Ŵ
			//���ҽ� ���� : isr2.close()
			if(isr2!=null) {
				try {
					isr2.close(); //�Ϲݿ��� :IOException
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			}
		}
		//2. �ڵ� ���ҽ� ��ü(java 1.7�ڵ����� ���ҽ��� ����)
			//1. ����ϴ� ��ü�� AutoCloseable �������̽��� ������ ��ü�����Ѵ�.
			//2. �ݵ�� ��ü�� close()�� �ݵ�� �����ؾ��Ѵ�.
			//���� �ΰ��� ������ �����Ҷ� �ڵ� ���ҽ� ����
			//try(�ڵ����� ���ҽ��� ������ ��ü ����){} catch{} finally{}
		
		
			//InputStreamReader�� autoCloseable �������̽��� �����ϰ� �ִ�. close() ������ �ִ�.
			//try with Resource : try(with resource: ��ü �޸� �ε�){���ҽ�����}
			try(InputStreamReader isr1= new InputStreamReader(System.in);){
				char input =(char)isr1.read();
				System.out.println("�Է±��� = " + input);
			}catch(IOException e) {
				e.printStackTrace();
			}//finally����� �����ϴ��� ��ü�� �ڵ����� .close()
	}

}
