package Chap19.Ex01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() �޼ҵ��� ������ ������.
		System.out.println(System.getProperty("user.dir")); //���� �۾� ���丮�� ���
		System.out.println(System.getProperty("java.version")); //JAVA����
		System.out.println(System.getProperty("java.vendor")); 
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home"));  //java��ġ Ȩ����
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("java.class.version"));
		System.out.println("user.name");	//�α׿��� ����
		System.out.println("user.home");	//Ȩ����
		System.out.println("os.name");		//os����
		System.out.println("os.arch");		//os ��Ű����
		System.out.println("os.version");	
		System.out.println("file.separator"); 	//���ϱ�����
		System.out.println("path.separator");	
		System.out.println("line.separator");
	}

}
