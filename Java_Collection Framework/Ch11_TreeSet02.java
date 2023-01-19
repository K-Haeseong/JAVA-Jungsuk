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


// SortedSet subSet (Object  fromElement, Object tenement)
//	=> 범위 검색（fromElement와   toElement사이）의 결과를 반환한다.（끝 범위인 toElement는 포함 X）
public class Ch11_TreeSet02 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();

		String from = "b";
		String to	= "d";

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");

		System.out.println(set);
		System.out.println("range search : from " + from  +" to "+ to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "zzz"));
//		System.out.println("result2 : " + set.subSet(from, "dzzz")); 
//		to + "zzz"가  "dzzz"로 바뀌므로 범위가 c까지에서 dy까지로 바뀜
		
	}

}
