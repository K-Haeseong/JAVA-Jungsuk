//	컬렉션(collection)	:	여러 객체(데이터)를 모아 놓은 것을 의미

//	프레임웍(framework)	:	표준화, 정형화된 체계적인 프로그래밍 방식

//	컬레션 프레임웍(collection framework)		:	컬렉션(다수의 객체)을 다루기 위한 표준화된 프로그래밍 방식
//											:	컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스를 제공
//											:	java.util패키지에 포함 (JDK1.2부터 제공)

//	컬렉션 클래스(collection class)	: 	다수의 데이터를 저장할 수 있는 클래스

//	<컬렉션 프레임웍의 핵심 인터페이스>
//
//	List인터페이스 : 순서 O, 중복 O			:	순서가 있는 데이터 집합, 데이터의 중복을 허용한다.
//												EX) 대기자명단
//		
// 	Set인터페이스  : 순서 X, 중복 X 			:	순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.
//												EX) 양의 정수집합, 소수의 집합
//
// 	MAp인터페이스  : 순서 X, 중복(키 X, 값 O)	:	키와 값의 쌍으로 이루어진 데이터의 집합
//											:	순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다.
//												EX) 아이디와 비밀번호, 우편번호, 지역번호


public class Ch11_Collections {

	public static void main(String[] args) {
		
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1,4)); 
		print(list1, list2);

		Collections.sort(list1);	// list1과 list2를 정렬한다.
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);

		list2.set(3, "AA");
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));	
		print(list1, list2);
		
		//  list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	} // main의 끝

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();	

	}

}
