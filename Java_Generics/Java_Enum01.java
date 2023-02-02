// 열거형(enum)	: 관련된 상수들을 같이 묶어 놓은 것 - Java는 타입에 안전한 열거형을 제공 => 값과 타입 둘다 체크
//				: 열거형 상수의 값은 사실은 객체?! 클래스?!

// <열거형의 정의와 사용>
//
// 1. 열거형을 정의하는 방법
// 	=>  enum 열거형이름 { 상수명1, 상수명2, ...}
//
// 2. 열거형 타입의 변수를 선언하고 사용하는 방법
//	=>	enum Direction { EAST, SOUTH, WEST, NORTH }
//		class Unit {
//		int x, y;
//		Direction dir; 				// 열거형 인스턴스 변수를 선언
//		
//		void init() {
//			dir = Direction.EAST;	// 유닛의 방향을 EAST로 초기화
//		}
//	}
//
// 3. 열거형 상수의 비교 : ==와 compareTo() 사용가능
//	 * 비교연산자는 사용불가 / equals()도 가능하네?

// compareTo()	: 정수(int값)을 반환하며, 자기 자신을 기준으로 상대방과의 차이 값을 비교하여 반환한다. 
// 				: (자신보다=오른쪽이) 크면 : +1, 같으면 : 0, 작으면 : -1 )


// 열거형의 조상	: java.lang.Enum 클래스
//				: 모든 열거형은 Enum의 자손이며, 아래의 메서드를 상속받는다.

// < 관련 메서드 >
// Class<E>getDeclaringClass() - 거의 사용X		: 열거형의 Class객체를 반환
// String name() 								: 열거형 상수의 이름을 문자열로 반환
// int ordinal() 								: 열거형 상수가 정의된 순서를 반환(0부터 시작) 
// T valueOf (Class<T> enumType, String name)	: 지정된 열거형에서 name과 일치하는 열거형 상수를 반환

// < values, valueOf() > : 컴파일러가 자동으로 추가 해주는 메서드
// static E[] values()				: 열거형의 모든 상수를 배열로 반환
// static E valuesOf(String name)	: 열거형 상수의 이름을 주면 열거형 상수 반환




enum Direction { EAST, SOUTH, WEST, NORTH }


public class Java_Enum01 {

	public static void main(String[] args) {

		Direction d1 = Direction.EAST;						// 열거형타입.상수이름
		Direction d2 = Direction.valueOf("WEST");			 
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1==d2 ? : " + (d1==d2));
		System.out.println("d1==d3 ? : " + (d1==d3));
		
		System.out.println("d1.equals(d3) ? : " + d1.equals(d3));
//		System.out.println("d2 > d3 ? : " + (d2 > d3)); 	// 에러 발생
		
		System.out.println("d1.compareTo(d3) ? : " + d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ? : " + d1.compareTo(d2));
		
		switch(d1) {
			case EAST :
				System.out.println("현재 방향이 동쪽입니다."); break;
			case SOUTH :
				System.out.println("현재 방향이 남쪽입니다."); break;
			case WEST :
				System.out.println("현재 방향이 서쪽입니다."); break;
			case NORTH :
				System.out.println("현재 방향이 북쪽입니다."); break;
			default :
				System.out.println("잘못된 방향 설정입니다."); break;
		}
		
		Direction[] darr = Direction.values();
		for (Direction d : darr) {
			System.out.println("현재 방향 : " +  d.name() + ",\t 방향의 순서 : " + d.ordinal());
		}
		
		
	}

}
