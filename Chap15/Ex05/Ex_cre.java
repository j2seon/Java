package Chap15.Ex05;

class Bro extends Thread{
	@Override
	public void run() {
		String[] str3= {"진기","26살","남자"};
		try {
			Thread.sleep(200);
		} catch (InterruptedException e1) {}
		for(int i=0; i<str3.length; i++) {
			System.out.println(str3[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}



public class Ex_cre {

	public static void main(String[] args) {
		Thread thread22=new Bro();
		
		Thread thread11 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
				}
				String[] str1= {"이름","나이","성별"};
				for(int i=0; i<str1.length; i++) {
					System.out.print(str1[i]+ " : ");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		});
		Thread thread21=new Thread(new Runnable() {	
			@Override
			public void run() {
				String[] str2= {"진선","27살","여자"};
				try {
					Thread.sleep(150);
				} catch (InterruptedException e1) {
				}
				for(int i=0; i<str2.length; i++) {
					System.out.print(str2[i]);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
			}
		});
		thread11.start();
		thread22.start();
		thread21.start();
		
		
	}


}
