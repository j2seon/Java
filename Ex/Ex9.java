package Ex;

public class Ex9 {

	public static void main(String[] args) {
		
		
		int a[]=new int[10];
		int sum = 0;
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)(Math.random()*10+1);
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("Æò±ÕÀº "+sum/10);
		
		
	}

}
