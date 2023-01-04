// 내부 클래스의 제어자와 접근성 - 예제2 

public class Ex07_47 {
	class InstanceInner {}
	static class StaticInner {}

	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();

	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();	
		StaticInner obj2 = new StaticInner();

	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();
	}

	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
