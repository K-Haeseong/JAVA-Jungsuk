// String클래스	: 데이터(char[]) + 메서드(문자열 관련)
//				: 내용을 변경할 수 없는 불변 클래스
//				: 덧셈 연산자를 이용한 문자열 결합은 성능이 떨어진다. 
//				: 문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용
//
//
//
// <문자열의 비교>
// ==		: 주소를 비교
// equals 	: 내용을 비교 => 문자열 비교할 땐 equals 사용
//
//
// < String str = "abc" VS String str = new String("abc") >
	public class ch09_String {
 	public static void main(String[] args) {
	String str1= "abc";					// 문자열 리터럴 "abc"의 주소가 각각 str1,2에 저장이 된다.	
	String str2= "abc";					// => 같은 문자열 리터럴 주소를 각각 참조변수가 갖고 있는 것 
	
	
	String str3 = new String("ABC");	// 새로운 String인스턴스가 생성되어 각각의 참조변수가 각각의 인스턴스 주소 갖음
	String str4 = new String("ABC");
	
	System.out.println(str1);
	System.out.println(str2);
	System.out.println();
	System.out.println(str3);
	System.out.println(str4);
 	}
}
	
	
// <문자열 리터럴> 	: 문자열 리터럴은 프로그램 실행시 자동으로 생성된다.(constant pool:상수저장소에 저장된다.)
//					: 같은 내용의 문자열 리터럴은 하나만 만들어진다.
//
// <빈 문자열 ("", empty String)>
// 내용이 없는 문자열 = 크기가 0인 char형 배열을 저장하는 문자열
// 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능
//	char[]  cArr =  new  char[0];	=>	char[]  cArr =   {}；와  같다.
//	String s = new String(cArr); 	=>	String s = new String;와 같다•
