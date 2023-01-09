// hashCode()	: 객체의 해시코드(hashCode)를 반환하는 메서드
//				: Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
//				: 객체의 지문이라고도 함.
//
// 오버라이딩 방법
// public int hashCode () {
//		return Objects.hash(); - 매개변수가 가변인자라서 호출시 지정하는 값의 개수가 정해져 있지 않음
//	}
//
// <주의사항>
// 1. equals()를 오버라이딩하면, hashCode()도 오버라이딩 해야함
//	=> equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문이다. - 2가지는 객체의 주소값을 가지고 비교하기 때문
// 2. hashCode() 오버라이딩 후 원래 hashCode() 기능 사용하고 싶다면, System.identityHashCode(Object obj) 사용
//
//



public class ch09_hashCode {

	public static void main(String[] args) {

	}

}
