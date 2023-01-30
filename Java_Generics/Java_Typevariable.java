import java.util.ArrayList;

// 타입 변수	: 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용
//			: 객체를 생성시, 타입 변수(E) 대신 실제 타입(Tv)을 지정 (대입)
//			: 타입 변수 대신 실제 타입이 지정되면, 형변환 생략가능

class Phone {}
class Radio{}


public class Java_Typevariable {

	public static void main(String[] args) {
		
		ArrayList<Phone> list = new ArrayList<>();
		list.add(new Phone());
//		list.add(new Radio());	// 제네릭을 통해서 걸러준다.
		
		
		
		Phone p = list.get(0); 	// list의 0번째 요소를 꺼낸다.
//		Phone p = (Phone)list.get(0); 	// 원래는 이렇게 형변환 시켜주어야 하나 제네릭으로 하지 않아도 괜찮음
										// 왜 (Phone)를 붙여서 형변환을 해주었어야 하는가?
										//=> get의 반환타입이 Object이다. Object는 모든 클래스의 조상
										//	 참조변수 형변환에 의해 업캐스팅 가능 ( 업캐스팅 특징 형변환 생략불가)
		
		
		
		
	}

}
