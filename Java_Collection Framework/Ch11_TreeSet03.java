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


// SortedSet headSet (Object toElement)	: 지정된 객체보다 작은 값의 객체들을 반환한다.(지정된 객체 포함 X)
// SortedSet tailSet (Object toElement)	: 지정된 객체보다 큰 값의 객체들을 반환한다.(지정된 객체 포함 O)
public class Ch11_TreeSet03 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

		for(int i=0; i < score.length; i++)
			set.add(new Integer(score[i]));

		System.out.println("50보다 작은 값 : "	+ set.headSet(new Integer(50)));
		System.out.println("50과 같거나 큰 값 : "	+ set.tailSet(new Integer(50)));
		
	}

}
