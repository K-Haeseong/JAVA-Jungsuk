import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

// Iterator / ListIterator / Enumeration	
//	1.	컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
//	2.	Enumeration은 Iterator의 구버전
//	3.	ListIterator는  Iterator의 접근성을 향상 시킨것(단방향 → 양방향) / next(), previous()


// Iterator	: 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
//			: 컬렉션에 Iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
// 			: hasNext()(확인), next()(읽기)
//			: Iterator는 1회용 / 끝까지 읽고나면 끝 -> 다시 얻어와야 한다
//	
//
//
// ※ Map에는 Iterator()가 없다. 
//	=> Iterator는 Collection 인터페이스에 정의 되어 있는데, Collection은 List와 Set의 조상 
//	=> keySet(), entrySet(), values()를 호출해야한다.

//	Map map = new HashMap();
//	...
//	Iterator it = map.entrySet().iterator();	// Set eSet = map.entrySet();
												// Iterator it = eSet.iterator();

// 1.map.entrySet()의 실행결과가 Set이므로
//	=>	Iterator it = map.entrySet().iterator();	→   Iterator it = Set인스턴스.iterator();
//
// 2. map.entrySet()를 통해 얻은 Set인스턴스의 iterator()를 호출해서 Iterator인스턴스를 얻는다. 
//	=>	Iterator it = Set인스턴스• iterator();	 →	Iterator it = Iterator인스턴스;
//
// 3. Iterator인스턴스의 참조가 it에 저장된다.


public class Ch11_Iterator_ListIterator {

	public static void main(String[] args) {

//		ArrayList list = new ArrayList();
		Collection c = new TreeSet();	// Set은 Collection의 자손
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();	// Iterator는 1회용
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
//		한번 더 읽고 싶어도 Iterator로 끝까지 읽어서 나오지 않음		

		
	}

}
