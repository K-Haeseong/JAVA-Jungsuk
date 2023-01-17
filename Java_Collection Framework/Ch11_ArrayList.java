import java.util.ArrayList;
import java.util.Collections;

//	ArrayList	:	ArrayList는 기존의 Vector를 개선한 것으로 구현원리와 기능적으로 동일
//				:	ArrayList => 동기화 처리 X
//				:	Vector	=>	동기화 처리 O
//				:	List인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용한다.
//				:	데이터의 저장공간으로 배열을 사용한다.(배열기반)


// 	ArrayList에 저장된 객체의 삭제과정
// 	1.	삭제할 데이터 아래의 데이터를 한 칸씩 위로 복사해서 삭제할 데이터를 덮어쓴다. 
//	2.	데이터가 모두 한 칸씩 이동했으므로 마지막 데이터는 null로 변경
//	3. 	데이터가 삭제되어 데이터의 개수가 줄었으므로 size의 값을 감소한다.
//	4.  마지막 데이터 삭제의 경우 1번 과정 필요없음
//
//	※ 참고사항	※
//	반복문으로 ArrayList에저장된 	객체 1번째 부터 삭제 할 경우 - 배열복사로 다 삭제 되지 X
//								마지막 객체부터 삭제 할 경우 - 배열복사 이루어지지 X, 다 삭제 OK


public class Ch11_ArrayList {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		// 기본길이(capacity=용량)가 10인 ArraysList를 생성
		// ArrayList는 객체만 저장가능
		
		list1.add(new Integer(5));
		// lsit1.add(5); => 가능 - 오토박싱을 통해 기본형이 참조형으로 자동 변환
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		
		// sbuList() - from부터 to 사이에 저장된 객체를 반환
		System.out.println("sbuList() ");
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1, list2);
		
		
		// sort() - 오름차순으로 정렬
		// Collection은 인터페이스,	Collections는 유틸 클래스
		// Collection 정렬시에너는 Collections 클래스의 sort() 사용
		System.out.println("sort() ");
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		
		// contains() - 포함
		System.out.println("contains()");
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		// list1이 list2의 모든요소를 가지고 있냐? 	O => true반환
		//											X => false반환
		System.out.println();
		
		
		// add() - 추가
		System.out.println("add()");
		list2.add("A");
		list2.add("B");
		list2.add(3, "C");	// 추가할 위치는 정해줄 수 있음
		print(list1, list2);
		
		
		// set() - 변경
		System.out.println("set()");
		list2.set(5, "EE");
		print(list1, list2);
		
		
		
		// indexOf() - 지정된 객체의 위치(인덱스)를 알려준다.
		System.out.println("indexOf()");
		list1.add(0, "1");
		print(list1, list2);
		System.out.println("1의 위치는? : " +  list1.indexOf("1"));	// 문자열 1의 위치가 어떤 인덱스에 있는지 알려준다.
		System.out.println("1의 위치는? : " + list1.indexOf(1));		// System.out.println(list1.indexOf(new Integer (1)));	
		// 2개의 결과가 다름 - why? => 하나는 문자열 1을 찾고 나머지는 인스턴스 1의 위치를 찾기 때문에
		System.out.println();
		
		
		// remove() - 삭제
		System.out.println("remove()");
		list1.remove(6);				//	인덱스 6인 객체를 삭제
		// list1.remove(new Integer(1)); 	//	객체를 선택해서 지우고 싶다면 정확하게 삭제
		print(list1, list2);
		
		
		// retain() - list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));	
		print(list1, list2);
		
		
		// list2에서 list1과 겹치는 부분 삭제하기
		for (int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) 
				list2.remove(i);
		}
		print(list1, list2);
		
		
	}
	
	
	static void print (ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
