//	열거형에 멤버 추가하기
//
//	1. 불연속적인 열거형 상수의 경우, 원하는 값을 괄호()안에 넣는다.
//	=> enum Direction { EAST(1), SOUTH(5), WEXT(-1), NORTH(10) }
//
//	2. 괄호()를 사용하려면, 인스턴스 변수와 생성자를 새로 추가해 줘야 한다.
//	=> enum Direction {
//		EAST(1), SOUTH(5), WEXT(-1), NORTH(10);			// 끝에 ';'을 추가해야 함
//
//		private final int value;						// 정수를 저장할 필드(인스턴스 변수)를 추가
//		Direction(int value) {this.value = value;}		// 생성자 추가
//		
//		public int getValue() { return value; }
//		}
// 	3. 열거형의 생성자는 묵시적으로 private이므로, 외부에서 객체생성 불가
//	=> Direction d = new Direction(1);	// 에러 - 열거형의 생성자는 외부에서 호출불가
	



enum Direction2 { 
	EAST(1, "동"), SOUTH(2,"남"), WEST(3, "서"), NORTH(4,"북");

	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;

	Direction2(int value, String symbol) { // 접근 제어자 private이 생략
		this.value  = value;
		this.symbol = symbol;
	}

	public int getValue()     { return value;  }
	public String getSymbol() { return symbol; }

	public static Direction2 of(int dir) {
        if (dir < 1 || dir > 4) 
            throw new IllegalArgumentException("Invalid value :" + dir);

        return DIR_ARR[dir - 1];
	}	

	// 방향을 회전시키는 메서드. num의 값만큼 90도씩 시계방향으로 회전
	public Direction2 rotate(int num) {
		num = num % 4;

		if(num < 0) num +=4; // num이 음수일 때는 시계반대 방향으로 회전 

		return DIR_ARR[(value-1+num) % 4];
	}

	public String toString() {
		return name()+"="+getSymbol()+"쪽";
	}
	// toString() 왜 오버라이딩 했는지 생각해보기 -  hint => valueOf랑 연관
}

public class Java_Enum02 {

	public static void main(String[] args) {

		for(Direction2 d : Direction2.values()) 
			System.out.printf("%s=%d%n", d.name(), d.getValue()); 

		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);

		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
		
	}

}
