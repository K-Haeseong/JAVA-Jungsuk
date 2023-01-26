import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*;

// Collections	: 컬렉션을 위한 (static)메서드를 제공
// 1. 컬렉션 채우기, 복사, 정렬, 검색		- fill(), copy(), sort(), binarySearch() 등

// 2. 컬렉션의 동기화 					- synchronizedXXX(); 

// 3. 변경불가(readOnly) 컬렉션 만들기	- unmodifiableXXX();

// 4. 싱글톤 컬렉션 만들기 				- singletionXXX() / singletonSet X singleton O
//	* 싱글톤 => 객체 1개만 저장 가능

// 5. 한 종류의 객체만 저장하는 컬렉션 만들기 - checkedXXX()
//	* 하나의 클래스만 저장 가능하다


public class Ch11_CollectionsClass {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		System.out.println(list);

		
		addAll(list, 1,2,3,4,5); 
//		Collections.addAll(list, 1,2,3,4,5); // import문 때문에 Collections 생략가능

		System.out.println(list);
		
		
		rotate(list, 2);   // 오른쪽으로 두 칸씩 이동(반시계 방향으로 두번 회전)
		System.out.println(list);

		
		swap(list, 0, 2); // 첫 번째와 세 번째를 교환
		System.out.println(list);

		
		shuffle(list);    // 저장된 요소의 위치를 임의로 변경 
		System.out.println(list);
		

		sort(list, reverseOrder()); // 역순 정렬 reverse(list);와 동일 
		System.out.println(list);
		
		
		// binarySearch() 하기 전에 정렬 필수
		sort(list);       // 정렬 
		System.out.println(list);
 
		
		int idx = binarySearch(list, 3);  // 3이 저장된 위치(index)를 반환
		System.out.println("index of 3 = " + idx);
		
		
		System.out.println("max="+max(list));
		System.out.println("min="+min(list));
		System.out.println("min="+max(list, reverseOrder()));

		
		fill(list, 9); // list를 9로 채운다.
		System.out.println("list="+list);

		
		// list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(), 2); 
		System.out.println("newList="+newList);

		// 공통요소가 없으면 true
		System.out.println(disjoint(list, newList)); 

		
		// newList → list에 복사
		copy(list, newList); 
		System.out.println("newList="+newList);
		System.out.println("list="+list);

		
		replaceAll(list, 2, 1); 					// 2를 1로 다 바꾸기
		System.out.println("list="+list);

		
		Enumeration e = enumeration(list);			// Iterator랑 같은 것
		ArrayList list2 = list(e); 

		
		System.out.println("list2="+list2);
	
	
	
		

	}

}
