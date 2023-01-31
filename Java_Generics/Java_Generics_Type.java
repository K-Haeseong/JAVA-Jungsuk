import java.util.ArrayList;

// 제네릭 용어	: Box<T> 제네릭 클래스, 'T의 Box' 또는 'T Box'라고 읽는다.
//			: T		=> 타입 변수 또는 타입 매개변수(T는 타입문자)
//			: Box	=> 원시타입(raw type)


//	제네릭 타입과 다형성
//	1. 참조 변수와 생성자의 대입된 타입은 일치해야 한다.
//	ArrayList<Tv> 		list = new ArrayList<Tv>(); // 가능
//	ArrayList<Product> 	list = new ArrayList<Tv>(); // 에러 - 불일치
	
//	2. 제네릭 클래스간의 다형성은 성립(대입된 타입은 일치 해야함)
//	List<Tv> list = new ArrayList<Tv>();	// 가능 - ArrayList가 list를 구현했기 때문에

//	3. 매개변수의 다형성도 성립
//	ArrayList<Product> 	list = new ArrayList<Product>(); // 에러 - 불일치
//	list.add(new Product());
//	list.add(new Tv());
//	list.add(new Audio());



class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Java_Generics_type {

	public static void main(String[] args) {
		
				ArrayList<Product> productList = new ArrayList<Product>();
				ArrayList<Tv>      tvList = new ArrayList<Tv>();
//		  		ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러.
//		 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. 다형성

//				public boolean add(Product e) 매개변수의 다형성으로 Product 자손들 가능
				productList.add(new Tv());		
				productList.add(new Audio());

//				public boolean add(Tv t)	// 여기는 Tv 또는 그 자손만 가능
				tvList.add(new Tv());
				tvList.add(new Tv());
//				tvList.add(new Audio());	// 에러

				printAll(productList);
//				printAll(tvList); 			// 컴파일 에러가 발생한다.
			}

			public static void printAll(ArrayList<Product> list) {	// 향상된 for문
				for (Product p : list)								// for( 타입변수명 : 배열 또는 컬렉션) { 
					System.out.println(p);							// 반복할문장
																	// }
	}

}
