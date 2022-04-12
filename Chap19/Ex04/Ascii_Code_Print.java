package Chap19.Ex04;

/*ASCII코드 값 출력 : 1byte =8bit, 제일 처음 비트는 부호 비트, 7bit :128개 (0~127)
 *  1 ~ 32 비트까지는 : 출력을 할 수 없는 특수 한 코드, 예 )null,헤더의 시작,경고음(7),개행 10, (LF)....
 * 	127 : delete.
 *  실제 출력 가능은 33번비트 ~ 126비트 
 *  영문, 숫자,특수문자
 * 
 *  출력
 * ========================================
 * ASCII	문자		ASCII 	문자	 
 * ========================================
 * 34		!		 34		&
 * 35		#		 36		$
 * */


public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("ASCII"+'\t'+"문자"+'\t'+'\t'+"ASCII"+'\t'+"문자");
		
		//teacher
		for(int i =33; i<127; i+=2) {
			System.out.println(i+"\t"+(char)i+"\t\t"+(i+1)+"\t"+(char)(i+1));
		}
		
		
		//me
		for(int a=33; a<127; a++) {
		byte b = (byte) a;
		byte bb = (byte) ((byte) a+1);
		char c = (char) b;
		char cc= (char) bb;
		StringBuffer sb = new StringBuffer();
		sb.append(b).append('\t').append(c).append('\t').append('\t').append(bb).append('\t').append(cc);
		System.out.println(sb);
		}

	}

}
