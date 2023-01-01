// 상속관계, 포함관계
// 단일상속, Object 클래스

	class Point extends Object{
		int x;
		int y;
	}
	
	// 상속관계
	class Circle01 extends Point {
		int r;
	}
	
	// 포함관계		
	class Circle02 {
		Point p = new Point();
		int R;
	}
	
	
	
public class Ex07_03_06 {

	public static void main(String[] args) {

		Circle01 A = new Circle01();
		
		A.x = 1;
		A.y = 2;
		A.r = 3;
		
		System.out.println("A.x = " + A.x);
		System.out.println("A.y = " + A.y);
		System.out.println("A.r = " + A.r);
		System.out.println();
		
		
		Circle02 B = new Circle02();
		
		B.p.x = 4;
		B.p.y = 5;
		B.R = 6;
		
		System.out.println("B.p.x = " + B.p.x);
		System.out.println("B.p.y = " + B.p.y);
		System.out.println("B.R = " + B.R);
		System.out.println();
	
		Point P = new Point();
		System.out.println(P.toString());
		System.out.println(P);
		
		// 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다. (컴파일러가 자동으로 Object 클래스 추가)
		// 모든 클래스는 Object 클래스에 정의된 11개의 메서드를 상속받는다.
		// 참조변수만 출력 
		// 참조변수.toString 출력시 같은 결과값 출력함
		
		// 참조변수의 출력이나 덧셈연산자를 이용한 참조변수와 문자열의 결합에는 toString()이 자동적으로 호출되어 참조변수를 문자열로 대치한 후 처리
		// toString()은 모든 클래스의 조상인 Object클래스에 정의된 것으로, 어떤 종류의 객체에 대해서도 toString()을 호출하는 것이 가능
	}

}
