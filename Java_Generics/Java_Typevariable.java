import java.util.ArrayList;

// 타입 변수	: 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용
//			: 객체를 생성시, 타입 변수(E) 대신 실제 타입(Tv)을 지정 (대입)
//			: 타입 변수 대신 실제 타입이 지정되면, 형변환 생략가능

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Java_Typevariable {

	public static void main(String[] args) {
		
				ArrayList<Product> productList = new ArrayList<Product>();
				ArrayList<Tv>      tvList = new ArrayList<Tv>();
//		  		ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러.
//		 		List<Tv>           tvList = new ArrayList<Tv>(); // OK. 다형성

				productList.add(new Tv());
				productList.add(new Audio());

				tvList.add(new Tv());
				tvList.add(new Tv());

				printAll(productList);
				// printAll(tvList); // 컴파일 에러가 발생한다.
			}

			public static void printAll(ArrayList<Product> list) {
				for (Product p : list)
					System.out.println(p);
	}

}
