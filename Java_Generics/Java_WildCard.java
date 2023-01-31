import java.util.ArrayList;

//	와일드 카드 < ? >
//	1. 하나의 참조변수로 대입된 타입이 다른 객체를 참조 가능
//
//	<? extend T>	와일드 카드의 상한 제한. T와 그 자손들만 가능
//	<? super T> 	와일드 카드의 하한 제한. T와 그 조상들만 가능
//	<?> 			제한 없음. 모든 타입이 가능<? extends Object>와 동일
//
//	ArrayList<? extend T> list = new ArrayList<Tv>();		// 가능
//	ArrayList<? extend T> list = new ArrayList<Audio>();	// 가능
//	ArrayList<Product> list = new ArrayList<Tv>();			// 불가능 - 대입된 타입 불일치


//	2. 메서드의 매개변수에 와일드 카드를 사용
//
//	static Juice makeJuice(FruitBox< ? extends Fruit> box {
//		String tmp = "";
//		for(Fruit f : box.getList()) tmp += f + " ";
//		return
//	}
//		System.out.println(Juice makeJuice(new FruitBox<Fruit>()));
//		System.out.println(Juice makeJuice(new FruitBox<Apple>(););	


class Fruit2		       	{ public String toString() { return "Fruit";}}
class Apple2 extends Fruit2	{ public String toString() { return "Apple";}}
class Grape2 extends Fruit2	{ public String toString() { return "Grape";}}

class Juice {
	String name;

	Juice(String name)       { this.name = name + "Juice"; }
	public String toString() { return name;                }
}

class Juicer {
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";

		for(Fruit2 f : box.getList()) 
			tmp += f + " ";
		return new Juice(tmp);
	}
}


class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);      }
	T get(int i)     { return list.get(i);  }
	ArrayList<T> getList() { return list;   }
	int size()       { return list.size();  }
	public String toString() { return list.toString();}
}



public class Java_WildCard {

	public static void main(String[] args) {

		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();

		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());

		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		
		
	}

}
