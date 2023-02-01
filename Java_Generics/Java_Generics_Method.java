//	제네릭 메서드
//
//	1. 제네릭 타입이 선언된 메서드 (타입 변수는 메서드 내에서만 유효)
//	=> [접근 제어자] <제네릭타입> [반환타입] [메소드명]([제네릭타입] [파라미터]) {
//		// 텍스트
//		}
//	=> static <T> void sort(List<T> list, comparator<? super T> c)


//	2. 클래스의 타입 매개변수 <T>와 메서드의 타입 매개변수 <T>는 별개
//	class FruitBox <T> -> (1번 T 이거랑) {
//	...
//	static <T> -> (2번 T는 별개) void sort(List<T> -> (2번 영향) list, comparator<? super T->(2번 영향)> c)
//	...
//		}
//}

//	3. 메서드를 호출할 때마다 타입을 대입해야함 (대부분 생략 가능)
//	FruitBox<Fruit> => 이런식으로 호출할 때마다 타입을 대입 해야함 fruitBox = new FruitBox<Fruit>();
//	FruitBox<Apple> => 				"					appleBox = new FruitBox<Apple>();

//	static Juice makeJuice(FruitBox<T extends Fruit> box) { // <T extends Fruit> 이렇게 할 경우
//		String tmp = "";
//
//		for(Fruit2 f : box.getList()) 
//			tmp += f + " ";
//		return new Juice(tmp);
//	}


//	4. 메서드를 호출할 때 타입을 생략하지 않을 때는 클래스 이름 생략 불가
//	System.out.println (<Fruit>makeJuice (fruitBox));		// 에러 - 클래스 이름 생략불가
//	System.out.println(this.<Fruit>makeJuice(fruitBox));	//  OK
//	System.out.printin(Juicer.<Fruit>makeJuice(fruitBox));	//  OK



public class Java_Generics_Method {

	public static void main(String[] args) {

	}

}
