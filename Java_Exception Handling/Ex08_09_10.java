// 예외발생시키기

//	1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
//		Exception e = new Exception("고의로 발생시킴")
//	2. 키워드 throw를 이요해서 예외를 발생시킨다.
//		throw e;

// checked 예외 	: 컴파일러가 예외 처리 여부를 체크 - 예외 처리(try-catch) 필수	- Exception과 자손
// unchecked 예외	: 컴파일러가 예외 처리 여부를 체크 X - 예외 처리 선택 			- RuntimeException과 자손
// 				=> 실행을 하면 예외가 발생하긴 함.

public class Ex08_09_10 {
	
	static int num = 0;
	
	public static void main(String[] args) {
//		checked 예외 - 예외 처리 필수 - 빨간줄 발생
//		throw new Exception("Exception 발생했습니다.");
		
		try {
			throw new Exception("Exception 발생했습니다.");
			
		} catch(Exception e) {
			
		}
		
//		unchecked 예외 - 예외 처리 선택적 - 빨간줄 발생 X
		throw new RutimeException("RutimeException 발생했습니다.");
		
		
	}

}
