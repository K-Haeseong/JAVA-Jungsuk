//	매개변수의 다형성 : 참조형 매개변수는 메서드 호출시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.
//
//	<다형성의 장점>
//	1. 다형적 매개변수 : 메서드의 매개변수로 조상타입의 참조변수를 사용하여, 하나의 메서드로 여러 타입의 객체를 받을 수 있다.
//
//	2. 하나의 배열에 여러 개 객체를 짚어 넣기 => 여러종류의 유닛을 한번에 담아서 이동시키기 가능

// 물품 : LedTv, Computer, Laptop 가격, 포인트
// 기능 : 구매, 장바구니, 총금액, 총포인트, 부족
// 구매자

class Product {
	int price;
	int bonusPoint;
	
	Product() {}
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
}

class LedTv extends Product {
	LedTv () {super(200);}
	public String toString() {return "LedTv";}
}

class Computer extends Product {
	Computer () {super(100);}
	public String toString() {return "Computer";}

}

class Laptop extends Product {
	Laptop () {super(150);}
	public String toString() {return "Laptop";}
}

class Buyer	{
	int money = 400;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	
	int i = 0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p.toString()+"을(를) 구매하셨습니다.");
	}
	
	void summary () {
		int sum = 0;
		int bonusPoint = 0;
		String itemList = "";
		
		for (int i = 0; i < item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			bonusPoint += item[i].bonusPoint;
			itemList += (i==0)? "" + item[i] : ", " + item[i]; // 삼항 연산자 기억하기
		}
		System.out.println();
		System.out.println("주문하신 상품은 " + itemList + "입니다.");
		System.out.println("총 구매하신 물건의 가격은 " + sum + "만원입니다.");
		System.out.println("적립된 포인트는 " + bonusPoint + "점입니다.");
	}
}
	
	

public class Ex07_27_30 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		
		b.buy(new LedTv());
		b.buy(new Computer());
		b.buy(new Laptop());
		b.summary();
		
		
		
	}
}
