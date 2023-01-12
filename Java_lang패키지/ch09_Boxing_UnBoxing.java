import java.util.ArrayList;

// Boxing & UnBoxing
//	Boxing		: 기본 타입의 데이터 → 래퍼 클래스의 인스턴스로 변환
//	UnBoxing	: 래퍼 클래스의 인스턴스에 저장된 값 → 기본 타입의 데이터로 변환


//public class ch09_Boxing_UnBoxing {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(new Integer(100));		//	list에는 객체만 추가가능
//		list.add(100);					// JDK1.5에는 에러.
//		
//		
//		Integer i = list.get(0);		//	list에 저장된 첫번째 객체를 꺼낸다.
//		int i = list.get(0).intValue();	//	intValue()로 Integer로 int로 변환
//		int i = list.get(0);
//		
//	}
//
//}


// 기본형 →  참조형으로 형변환 연산자 사용불가가 원칙 but 허용으로 바뀜 - 컴파일러의 힘으로!
public class ch09_Boxing_UnBoxing {

	public static void main(String[] args) {
		
		int i = 10;
		
		
		// 기본형을 참조형으로 형변환(형변환 생략가능)
		
		Integer intg = (Integer)i;			// Integer intg = Integer.valueOf(i);	
		Object obj = (Object)i;				// Object obj = (Object)Integer.valueOf(i);
		
		Long lng = 100L;					// Long lng = new Long(100L);
		
		int i2 = intg + 10;					// 참조형과 기본형간의 연산 가능
		long l = intg + lng;				// 참조형 간의 덧셈도 가능
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;				// 참조형을 기본형으로 형변환도 가능(형변환 생략가능)
		
		
		
	}
}