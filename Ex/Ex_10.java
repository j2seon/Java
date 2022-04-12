package Ex;

public class Ex_10 {

	public static void main(String[] args) {
		//1~99±îÁö ¼ıÀÚ ¹Ú¼ö Â¦ 3,6,9
		
		for (int i = 0; i < 100; i++) {
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
				if (i/10 == 3 || i/10 == 6 || i/10 == 9) {
					System.out.println(i+ "¹Ú¼ö Â¦Â¦");
				}else{
					System.out.println(i+"¹Ú¼ö Â¦");
				}
			}else if (i/10 == 3 || i/10 == 6 || i/10 == 9) {
				System.out.println(i+"¹Ú¼ö Â¦");
			}
			
		}		
	}

}
