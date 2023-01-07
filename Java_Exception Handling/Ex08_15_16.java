// 사용자 정의 예외 만들기	: 우뤼가 직접 예외 클래스를 정의할 수 있다.
//					: 조상은 Exception과 RuntimeException중에서 선택

class MyException extends Exception { // 필수처리 - try-catch문 필수
	
	private final int ERR_CODE;
	
	MyException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	MyException(String msg) {
		this(msg, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
}

public class Ex08_15_16 {

	public static void main(String[] args) {
		
		
	}
}
