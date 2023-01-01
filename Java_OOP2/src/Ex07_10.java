// 참조변수 super

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

class Child2 extends Parent { // super.x와 this.x 둘 다 가능
	void method2() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class Ex07_10 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();
		System.out.println();
		
		Child2 d = new Child2();
		d.method2();
		
	
		
		
	}

}
