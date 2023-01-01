// import문, static import문
// 이클립스 import문 단축키 ctrl + shift + O


// 1. 클래스를 사용할 때 패키지 이름을 생략할 수 있다.
// 2. 컴파일러에게 클래스가 속한 패키지를 알려준다.
// 3. java.lang 패키지(기본패키지)의 클래스는 import 하지 않고도 사용할 수 있다. EX) String, Object, System, Thread 등
// 4. import문은 패키지문과 클래스선언 사이에 선언한다.
// 5. import문은 컴파일 시에 처리되므로 프로그램의 성능에 영향 없음(거의 차이 없음).
// 
// <import문의 선언>
// import 패키지명.클래스명;
// import 패키지명.*;  (*은  모든 클래스 나타낸다)
// 

// < static import문 > : 꼭 필요할 때만 사용
// static멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.


import static java.lang.System.out;
import static java.lang.Math.*;


public class Ex07_15_16 {

	public static void main(String[] args) {
		
//	System.out.println(Math.random());	
	out.println(random());
	
//	System.out.println("Math.PI :" +MAth.PI");
	out.println("Math.PI :" + PI);
	}

}
