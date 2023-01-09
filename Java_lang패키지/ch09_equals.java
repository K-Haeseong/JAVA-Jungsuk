// Object클래스 : 모든 클래스의 최고 조상, 오직 11개의 메서드만을 가지고 있다.
//
// equals(Object obj) 	: 객체 자신(this)과 주어진 객체(obj)를 비교한다. 같은면 true 다르면 false
//						: Object클래스의 equals()는 객체의 주소를 비교(참조변수 값 비교)


class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
//	Object의 equals()를 오버라이딩해서 주소가 아닌 value를  비교
	public boolean equals (Object obj) {
//		return this==obj; 					// 주소비교 - 서로 다른 객체는 항상 거짓
		if(!(obj instanceof Value)) {		// 참조변수의 형변환 전에는 반드시 instanceof로 확인
			return false;
		}
		
		Value v = (Value)obj;
		return this.value == v.value;
//		return this.value == ((Value)obj).value;
//		위에 두개의 문장을 하나로 합친 것
	}
	
	
}


public class ch09_equals {

	public static void main(String[] args) {

		Value v1 = new Value(700);
		Value v2 = new Value(700);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		
	}

}
