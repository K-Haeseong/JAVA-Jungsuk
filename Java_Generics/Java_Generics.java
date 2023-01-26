import java.util.ArrayList;

//지네릭스(Generics)	: 컴파일시 타입을 체크해 주는 기능(compile-time type check) - JDK 1.5
//				: 객체의 타입 안정성을 높이고 형변환의 번거로움을 줄여줌

// 지네릭스의 장점	: 타입 안정성을 제공한다.
//				: 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해진다.


public class Java_Generics {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("30");
		
		
		Object o = list.get(2); // 이게 뭐야? - Object o = new Object("30"); 이거야?
		System.out.println(o);
		String s = (String)list.get(2); // 굳이 이렇게 해서 출력 하는 이유는?
		System.out.println(s);
		
//		Integer i = (Integer)list.get(2); // 컴파일은 OK, but 실행시 에러
		// Class CastException : 형변환에러 발생
		//	=>	list.get(Object o) 메서드는 반환타입이 Object라서 Integer로 형변환 OK 해줬음 
		//		but 실제로 들어있는 것은 String(String은 Integer로 형변환 불가)
		//		이것이 바로 컴파일러의 한계
		//※중요※	실행시 발생 하는 에러를 컴파일에서 잡아내기 위해서	=> 제네릭을 사용
		//		(Runtime에러를 compile에러로 끌고 옴) 
		
		
//		System.out.println(i);
//		System.out.println(list);
		
	}

}
