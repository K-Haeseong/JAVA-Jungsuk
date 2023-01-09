import java.util.Objects;

// toString() 	: 객체를 문자열(String)으로 변환하기 위한 메서드
//				: 객체==iv집합 / 객체를 문자열로 변환한다 == iv의 값을 문자열로 변환한다.

// Object클래스의 toString() 
// public String toString() { return getClass().getName()+"@"+Integer.toHexString(hashCode()); }
//							 	설계도객체 / 클래스이름 / 위치 / 16진 / 객체주소

class Card {
	String kind;
	int number;
	
	Card () {
		this("HEART", 7);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
		
	}
	
	// hashCode() 오버라이딩
	public int hashCode () {
		return Objects.hash(kind, number);
	}
	
	// equals() 오버라이딩
	public boolean equals(Object obj) {
		if(!(obj instanceof Card)) {
			return false;
		}
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number==c.number;
	}
	
	// toString() 오버라이딩
	public String toString() {
		return "kind : " + kind + ", number" + number;
	}
	
	
}

public class ch09_toString {

	public static void main(String[] args) {

		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c2));
		
	}

}
