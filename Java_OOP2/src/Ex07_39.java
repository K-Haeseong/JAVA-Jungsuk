// 인터페이스 장점

class A {
	public void method(I i) { // 인터페이스를 I를 구현한 애들만 들어와
		i.method();
		
	}
}

//class B  {
//	public void method() {
//		System.out.println("B클래스의 메서드");
//	}
//}


// 위에 있는 B클래스의 선언과 구현을 분리
interface I {
	public void method();
}


class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class Ex07_39 {

	public static void main(String[] args) {

		A a = new A();
		a.method(new B()); // A가 B를 사용한다(의존한다)
		a.method(new C());
	}

}
