import java.util.ArrayList;

// 제네릭 타입과 다형성
// 1. 참조 변수와 생성자의 대입된 타입은 일치해야 한다.
// ArrayList<Tv> 		list = new ArrayList<Tv>(); // 가능
// ArrayList<Product> 	list = new ArrayList<Tv>(); // 에러 - 불일치

// 2. 제네릭 클래스간의 다형성은 성립(대입된 타입은 일치 해야함)
// List<Tv> list = new ArrayList<Tv>();	// 가능 - ArrayList가 list를 구현했기 때문에
   
// 3. 매개변수의 다형성도 성립
// ArrayList<Product> 	list = new ArrayList<Product>(); // 에러 - 불일치
// list.add(new Product());
// list.add(new Tv());
// list.add(new Audio());

// 제한된 제네릭 클래스	: extends로 대입할 수 있는 타입을 제한
//					: 인터페이스인 경우에도 extends를 사용 (implements X)


// 제네릭의 제약	: 타입 변수에 대입은 인스턴스 별로 다르게 가능
//
//				: static멈버에 타입 변수 사용 불가
//				 => static멤버는 모든 인스턴스에 공통인데 인스턴스 별로 다르게 적용 가능한 제네릭을 쓰는 것은 불가능
//
//				: 객체/배열 생성할 때 타입 변수 사용불가, 타입변수로 배열 선언은 가능
//				 => new 연산자 뒤에는 타입변수 불가 (new 뒤에는 타입 확정적이어야함 => new String)

class Fruit implements Eatable {
	public String toString() { return "Fruit"; }
}

interface Eatable {}

class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy { public String toString() {return "Toy";}}


class Box<T> {
	ArrayList<T> basket = new ArrayList<>();
	void add(T item) { basket.add(item); }
	T get(int i) { return basket.get(i); }
	int size() { return basket.size(); }
	public String toString() { return basket.toString();}
	
}

class FruitBox <T extends Fruit & Eatable> extends Box<T> {}

public class Java_Limited_Generics {

	public static void main(String[] args) {


		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>(); 
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> fruitBox = new FruitBox<Apple>(); 	에러 - 타입 불일치
//		FruitBox<Toy> 	toyBox	 = new FruitBox<Toy>();		에러 - Toy는 	<T extends Fruit & Eatable>  조건 충족X
		
		
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
//		grapeBox.add(new apple());	// 에러 - apple은 grape의 자손이 아님
		

		
		System.out.println("fruitBox : " + fruitBox);
		System.out.println("appleBox : " + appleBox);
		System.out.println("grapeBox : " + grapeBox);
		
//		get() 써보기
		Fruit qwe = fruitBox.get(0);
		System.out.println(qwe);
		
		
	}
}

