import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// 	Set인터페이스  : 순서 X, 중복 X	: 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.
//								  EX) 양의 정수집합, 소수의 집합

//HashSet	: Set인터페이스를 구현한 대표적인 컬렉션 클래스
//: 중복 허용X, 순서를 유지하려면 => LinkedHashSet 사용
//: HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인
//  같은 객체가 없으면 저장하고, 있으면 저장하지 않는다 = 중복 X 의미
//: boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
//: equals()와 hashCode()가 오버라이딩 되어 있어야 함 	

// ※ 언제 쓰면 좋은걸까?
// 	=>	게임에서 '닉네임'을 만든다거나 아이디를 생성할 때 '중복확인'을 눌러 중복된 닉네임 또는 아이디인지 확인하는 것이다. 
// 		이는 데이터가 정렬되어있을 필요도 없고, 빠르게 중복되는 값인지만 찾으면 되기 때문에 유용한 방법이 될 수 있다.
// 		좀 더 상세하게 말하자면 hash에 의해 데이터의 위치를 특정시켜 해당 데이터를 빠르게 색인(search)할 수 있게 만든 것이다. 
// 		즉, Hash 기능과 Set컬렉션이 합쳐진 것이 HashSet이다. 그렇기 때문에 삽입, 삭제, 색인이 매우 빠른 컬렉션 중 하나다.



//public class Ch11_HashSet {
//
//	public static void main(String[] args) {
//
//		Object[] objArr = { "1", new Integer(1), "2", "2","3","3","3","4","4","4","4"};
//		Set set = new HashSet();
//		
//		for(int i = 0; i < objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		// HashSet에 저장된 요소들 출력
//		System.out.println(set);
//		
//		// Iterator사용 - HashSet에 저장된 요소들 출력
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//	}
//
//}


public class Ch11_HashSet01 {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45)+1;
			// set.add(new Integer(num));	원래는 이렇게!
			set.add(num);
		}
		
		System.out.println(set);
		// 정렬이 되어서 나오지 않음 순서가 엉망!!
		
		// 정렬하기 위해서는 sort()사용 해야함 - but Set은 순서 X, 중복 X - List로 바꿔주어야함
		List list = new LinkedList(set); // 그림 어떻게 그려지는거임? - 단순히 컬렉션 바꿔주는거라고 생각?
		Collections.sort(list);
		System.out.println(list);
		
	}
}