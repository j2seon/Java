package Chap14.Ex08;

//ID의 값을 null 이 올 경우 Exception 발생
//userID가 : 8자이상 20자가 아닌경우 Exception

// 일반예외 샹성 -
class IDFormatException extends Exception{ //두개 생성자만 구성
	public IDFormatException() {
		super();
	}
	public IDFormatException(String message) { //예외 발생 시 예외 메세지 출력!! e.getMessage();
		super(message);
	}
	
}


public class IDFormatTest {
	private String userID;		//체크 : null, 8자이상 20자가 아닌경우 Exception
		//userID 캡슐화 됨. private : 외부나 다른 클래스에서 접근 차단.
			//생성자, Settor를 사용해서 값을 할당. 
		//private으로 설정된 경우 : getter나 setter 사용한다.
	
	
	public String getUserID() { //getter 메소드 호출 시 메모리의 userID를 던져줌.
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException { //setter
		if(userID ==null) {
			throw new IDFormatException("아이디는  NUll 일 수 없습니다.");
		}else if(userID.length()<8||userID.length()>20) {
			throw new IDFormatException("아이디는 8자이상 20자이하로 사용가능합니다.");
		}else {
			System.out.println("정상적으로 잘 입력되었습니다.");
		}
		this.userID=userID;
	}
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		//userID가 null인 경우
		String userID = null;		//setter 호출시 null 입력 후 호출
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================");
		
		//2. userID를 7자 넣은 경우
		
		userID ="1234567";
		try {
		test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("======================");
		
		//3. null이 아니고 8자이상 20자 미만인 경우 : 정상
		userID = "1234567890";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage()); //메세지 출력
		}
		System.out.println(test.getUserID());
	}

}
