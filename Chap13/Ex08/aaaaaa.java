package Chap13.Ex08;


class AA implements AutoCloseable {

	String a;
	AA(String a){
		this.a=a;
	}
	
	@Override
	public void close() throws Exception {
		if(a != null) {
			a=null;
			System.out.println("해제");
		}
	}
	
}
public class aaaaaa {
	public static void main(String[] args) {
		
		AA aa=null;
		try {
			aa= new AA("파일");
		} catch (Exception e) {
		}finally {
			if(aa.a!=null) {
				try {
					aa.close();
				} catch (Exception e2) {
				}
			}
		}
	}
}
