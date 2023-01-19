import java.util.HashSet;
import java.util.Iterator;

// HashSet	: Set인터페이스를 구현한 대표적인 컬렉션 클래스
//			: 중복 허용X, 순서를 유지하려면 => LinkedHashSet 사용
//			: HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인
//			  같은 객체가 없으면 저장하고, 있으면 저장하지 않는다 = 중복 X 의미
//			: boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
//			: equals()와 hashCode()가 오버라이딩 되어 있어야 함 	


// 합집합, 교집합, 차집합 구하기

public class Ch11_HashSet03 {

	public static void main(String[] args) {


		HashSet setA    = new HashSet();
		HashSet setB    = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();

		setA.add("1");		setA.add("2");
		setA.add("3");		setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);

		setB.add("4");		setB.add("5");
		setB.add("6");		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);
		
		//교집합 => A ∩ B
		// setA.retainAll(setB)		// setA에 2개의 공통된 요소만 남기고 삭제
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}

		//차집합 => A - B
		// setA.removeAll(setB) 	// setA에 2개의 공통 요소의 제거
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		

		//합집합 => A ∪ B
		// setA.addAll(setB)		// setA에 setB의 모든요소 추가(당연히 중복 제외)
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());

		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		// Set은 당연히 중복은 없으니까 두개의 요소 다 넣자
		
		System.out.println("A ∩ B = "+setKyo); 
		System.out.println("A ∪ B = "+setHab); 
		System.out.println("A - B = "+setCha); 
		
		}
		
		
	}
	