//	제네릭 타입의 형변환

//	1. 제네릭 타입과 원시 타입 간의 형변환은 바람직 하지 않다.(가능은 하지만 But 경고 발생)
//
//	Box<Object> objBox = null;
//	box = (Box)objBox; 				// OK. 지네릭 타입 — 원시 타입. 경고 발생 
//	objBox = (Box<Object>)box;		// OK. 원시 타입 一 지네릭 타입. 경고 발생
	

//	2. 지네릭 타입 간에는 형변환이 불가능
//
//	objBox = (Box<Object>)strBox;	// 에러. Box<String> — Box<Object> 
//	strBox = (Box<String>)objBox;	// 에러. Box<Object> — Box<String>


//	3. 와일드 카드가 사용된 지네릭 타입으로는 형변환 가능
//	※ 반대로도 제네릭 타입 -> 와일드 카드 사용된 제네릭 타입도 가능 (타입이 불명확 -> 명확이기 때문에 가능)
//	※ But  경고발생

//  Box<Object> objBox = (Box<Object>)new Box<String>();	// 에러 - 형변환 불가능

//	Box<? extends Object>  wBox  =  new  Box<String>();							// OK
//	Box<? extends Object>  wBox  =  (<? extends Object>)new  Box<String>();		// 위와 같은 것

//	매개변수로 FruitBox<Fruit>, FruitBox<Apple>, FruitBox<Grape> 등 가능
//	static Juice makeJuice(FruitBox<?  extends  Fruit>  box)    {      ... }

//	FruitBox<? extends Fruit> box  = new FruitBox<Fruit>(); //	OK
//	FruitBox<? extends Fruit> box  = new FruitBox<Apple>(); //	OK
//	FruitBox<? extends Fruit> box  = new FruitBox<Grape>(); //	OK



public class Java_Generics_casting {

	public static void main(String[] args) {

		
	}

}
