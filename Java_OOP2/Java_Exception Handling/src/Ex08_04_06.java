// 예외처리하기
// try - catch문의 흐름 파악하기

// 1. try블럭 내에서 예외가 발생 O
//	- 발생한 예외와 일치하는 catch블럭이 있는지 확인
//	- 일치하는 catch블럭 확인 O	: 블럭 내 문장을 실행하고 try-catch문 빠져나가서 그 다음 문장 수행
//	- 일치하는 catch블럭 확인 X	: 예외처리 하지 못하고 비정상종료
//	
//	2. try블럭 내에서 예외가 발생 X
//	- catch블럭을 거치지 않고 수행을 계속함

public class Ex08_04_06 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
			System.out.println(0/0);
		} catch (ArithmeticException e) {
			if(e instanceof ArithmeticException)
				System.out.println("true");
		System.out.println("ArithmeticException가 발생했습니다.");
		} catch (Exception E) {					// ArithmeticException 예외를 뺀 나머지 오류 처리
			System.out.println("Exception");	// 모든 예외를 처리하므로 마지막에 넣어주는 것
		}
	
		System.out.println(5);
	
	}
}
