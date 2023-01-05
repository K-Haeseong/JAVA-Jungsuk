// EXception Test
// 예외처리의 정의와 목적
// 정의 : 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
// 목적 : 프로그램의 비정상 종료를 막고 정상적인 실행상태를 유지하는 것

// 컴파일 에러 : 컴파일 할 때 발생하는 에러
// 런타임 에러 : 실행 할 때 발생하는 에러 - 실행 가능 but 프르그램 종료
// 논리적 에러 : 작성 의도와 다르게 동작

// 런타임 에러의 종류
// 에러(Error) : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
// 예외(Exception) : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
// 에러는 어절 수 없지만. 예외는 처리하자!

// Exception의 종류
// Exception클래스와 자손클래스 : 사죵자의 실수와 같은 외적인 요인에 의해 발생하는 예외
// RutimeException클래스와 자손클래스 : 프로그래머의 실수로 발생하는 예외



public class Ex08_01_03 {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		

//		system.out.println(args[0]); // 컴파일 에러 발생
//		System.out.println(args[0]); // 런타임 에러 발생 : 문법은 맞지만 실행중에 에러 발생하는 것
		
		
	}

}
