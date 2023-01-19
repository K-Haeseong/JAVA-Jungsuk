import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// 	Set인터페이스  : 순서 X, 중복 X	: 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.
//								  EX) 양의 정수집합, 소수의 집합

// TreeSet	: 범위 탐색, 정렬
//			: 이진 탐색 트리(binary search tree)로 구현 범위 탐색과 정렬에 유리
//			: 이진 트리는 모든 노드(요소)가 최대 2개의 하위 노드를 갖는다.
//			  각 요소(node)가 나무(tree)형태로 연결(LinkedList의 변형)


// binary search tree(이진 탐색 트리)	: 이진 트리의 한 종류
//									: 부모보다 작은 값은 왼쪽, 큰 값은 오른쪽에 저장
//									: 단점 - 데이터가 많아질 수록 추가, 삭제에 시간이 더 걸림(비교 횟수 증가)


// TreeSet의 데이터 저장과정		: TreeSet은 compare()를 호출해서 비교 / HashSet은 equals(), hashCode()로 비교
// boolean add(Object o)	: 루트부터 트리를 따라 내려가며 값을 비교 (작으면 왼쪽, 크면 오른쪽에 저장) 
// 	


// Tree traversal(트리 순회)	: 이진 트리의 모든 노드를 한번씩 읽는 것을 트리 순회라고 한다.
//							: 전위, 중위, 후위 순회법이 있으며, 중위 순회하면 오름차순으로 정렬된다.



public class Ch11_TreeSet01 {

	public static void main(String[] args) {

		Set set = new TreeSet();
//		Set set = new HashSet();	// HashSet은 정렬되어서 나오지 않음
		

		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
			
		}
		
		System.out.println(set);
		// 정렬 되어서 나오는 이유 - TreeSet이기 때문에 : TreeSet 저장과정
	}
 }





// 생성한 객체 스스로 가지고 있는 Comparable이 구현되어 기준을 갖게 하거나 
// Comparator로 기준을 생성해서 넣어주어 기준을 갖게 해야한다.


// Comparator로 구현 했을때
//public class Ch11_TreeSet01 {
//
//	public static void main(String[] args) {
//
//		Set set = new TreeSet();
//		
////			set.add(new Test());	// 이렇게 하면 예외 발생 - 비교 기준이 없음
//			set.add(new Test());	
//			set.add(new Test());	
//			System.out.println(set);
//	}
//}
//
////class Test {} - 비교 기준이 없음 (Comparable 구현 안해서) 
//
//
//class Test implements Comparable {
//
//	@Override
//	public int compareTo(Object o) {
//		return 1;	// 0으로 하면 같은 객체로 알기 때문에 1,-1로 해야 계속 추가 가능
//	}
//	
//}



//Comparator로 구현 했을때
//public class Ch11_TreeSet01 {
//
//	public static void main(String[] args) {
//
////		Set set = new TreeSet();	// 기준이 없음 - 여기에 기준을 넣어줘야한다.
//		Set set = new TreeSet(new TestComp());	
//		
//			set.add(new Test());	
//			set.add(new Test());	
//			System.out.println(set);
//	}
//}
//
//class Test {}
//
//class TestComp implements Comparator {
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		return 1; // 0으로 하면 같은 객체로 알기 때문에 1,-1로 해야 계속 추가 가능
//	}
//	
//}






