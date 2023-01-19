import java.util.HashSet;
import java.util.Objects;

// 	Set인터페이스  : 순서 X, 중복 X	: 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다.
//								  EX) 양의 정수집합, 소수의 집합

// HashSet	: Set인터페이스를 구현한 대표적인 컬렉션 클래스
//			: 중복 허용X, 순서를 유지하려면 => LinkedHashSet 사용
//			: HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인
//			  같은 객체가 없으면 저장하고, 있으면 저장하지 않는다 = 중복 X 의미
//			: boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
//			: equals()와 hashCode()가 오버라이딩 되어 있어야 함 	



public class Ch11_HashSet02 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		
		set.add("ABC");
		set.add("ABC");						// 중복이라 저장안됨
		set.add(new Person("Mike",17));
		set.add(new Person("Mike",17));
		
		System.out.println(set);
	}
}


// equals()와 hashCode()가 오버라이딩해야 HashSet이 바르게 동작
class Person {
	int age;
	String name;
	
	Person(){};
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
			return name + ":" + age;
	}
	
	
// hashCode()	: 객체의 해시코드(hashCode)를 반환하는 메서드
//				: Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
//				: 객체의 지문이라고도 함.	
	
	@Override
	public int hashCode() {
		// int hasCod(Object...values); // 가변인자 {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
			Person p = (Person)obj;
			// 자신(this)의 이름과 나이를 p와 비교
			return this.name.equals(p.name) && this.age==p.age;
			// <문자열의 비교>
			// ==		: 주소를 비교
			// equals 	: 내용을 비교 => 문자열 비교할 땐 equals 사용
		}
		
		
	}
	