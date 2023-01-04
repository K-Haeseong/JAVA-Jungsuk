// 내부 클래스의 제어자와 접근성 - 예제5 

class Outer3 {
	int value = 10;	// Outer3.this.value

	class Inner {
		int value = 20;   // this.value

		void method1() {
			int value = 30;
			System.out.println("            value :" + value);
			System.out.println("       this.value :" + this.value);
			System.out.println("Outer3.this.value :" + Outer3.this.value);
		}
	} // Inner클래스 끝
} // Outer3클래스 끝

class Ex07_50 {
	public static void main(String args[]) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.method1();
	}
}
