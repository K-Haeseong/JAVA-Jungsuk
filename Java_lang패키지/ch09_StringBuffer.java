public class ch09_StringBuffer {

	public static void main(String[] args) {

// StringBuffer클래스	: String처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
//						: 그러나, String과 달리 내용을 변경할 수 있다.
//
//
// StringBuffer의 생성자	: 배열은 길이 변경 불가 공간이 부족하면 새로운 배열 생성 해야함
//						=> 1. 새로운 배열 생성( 보통은 원래 있던 것 X2 ) 2. 전에 있던 내용 복사 3. 참조변경
//
//						: StringBuffer는 저장할 문자열의 길이를 고려해서 적절한 크기로 생성해야함(기본 버퍼 크기는 16)
//
// StringBuffer의 변경	: StringBuffer는 String과 달리 내용 변경이 가능하다.
//						: append()는 지정된 내용을 StringBuffer에 추가 후, StringBuffer의 참조를 반환(반환타입 StringBuffer)
						
						StringBuffer sb1 = new StringBuffer("ABC");
						sb1.append("123");			// sb1 뒤에 123을 추가
						System.out.println(sb1);	// ABC123
						
						
						StringBuffer sb2 = sb1.append("ZZ"); // sb1 뒤에 내용 추가 후 자기 주소를 반환
						System.out.println(sb1);
						System.out.println(sb2);			// 따라서 2개가 같은 객체의 주소값을 갖음
						System.out.println();
						
						
						StringBuffer sb3 = new StringBuffer("Hi");
						sb3.append("나도");
						sb3.append("안녕");
						System.out.println(sb3);
						System.out.println();
//						sb3.append("나도").append("안녕");
//						=> 위 2개를 하나로 합치기도 가능 / 메서드 체이닝
//						=> append()는 지정된 내용을 StringBuffer에 추가 후 StringBuffer 자신을 반환하기 때문에
						

						
// StringBuffer의 비교	: StringBuffer는 equals()가 오버라이딩 되어있지 않다.(주소비교)
//						
						StringBuffer sb4 = new StringBuffer("abc");
						StringBuffer sb5 = new StringBuffer("abc");

						System.out.println(sb4==sb2);
						System.out.println(sb4.equals(sb5));
						
//						: StringBuffer을 String으로 변환 후에 equals()로 비교해야 한다.
						String s = sb4.toString();
						String s2 = sb5.toString();
						
						System.out.println(s.equals(s2));
	}

}
