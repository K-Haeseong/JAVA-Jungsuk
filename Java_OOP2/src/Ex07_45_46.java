// 내부 클래스의 제어자와 접근성 - 예제1

// static클래스만 static멤버를 정의할 수 있다.
// final static은 상수이므로 허용된다.
class Ex07_45_46 {
		class InstanceInner { 
			int iv = 100; 
//			static int cv = 100;            // 에러! static변수를 선언할 수 없다. but 자바버전 바뀌며 허용
			final static int CONST = 100;   // final static은 상수이므로 허용

	   static class StaticInner { 
			int iv = 200; 
			static int cv = 200;    // static클래스만 static멤버를 정의할 수 있다.
		} 

		void myMethod() { 
			class LocalInner { 
				int iv = 300; 
//				static int cv = 300;             // 에러! static변수를 선언할 수 없다. 
				final static int CONST = 300;    // final static은 상수이므로 허용
			} 
		} 

		public static void main(String args[]) { 
			System.out.println(InstanceInner.CONST); 
			System.out.println(StaticInner.cv);
//			System.out.println(LocalInner.CONST); // 에러! 지역 내부 클래스에서만 가능
		} 
}

