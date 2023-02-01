// 제네릭 타입의 제거
//
// * 컴파일러는 제네릭 타입을 제거하고, 필요한 곳에 형변환을 넣는다.

// 1. 제네릭 타입의 경계(bound)를 제거
//		
// class Box*<T extends Fruit>*  { 
// 
// 	void  add(T  t)   {
// 		...
// 	}
// }
//
//			↓
//
// class Box {
// void  add(Fruit  t)   {
// 	...
// 	}
// }

// 2. 지네릭 타입을 제거한 후에 타입이 일치하지 않으면, 형변환을 추가한다. 
//	  List의 get()은 Object타입을 반환하므로 형변환이 필요하다.
//
// T get(int i) {
//  return  list.get (i); 
// }
//
//			↓			
//
// *Fruit* get(int i) {
// 	return *(Fruit)*list.get(i);
// }


// 3.와일드 카드가 포함되어 있는 경우에는 다음과 같이 적절한 타입으로의 형변환이 추가
//	static  Juice makeJuice(FruitBox<? extends Fruit> box) { 
//		String  tmp   =	" ";
//		for(Fruit f : box.getList()) 
//			tmp += f + " ";
//		return  new   Juice(tmp);
//	}
//		
//					↓	
//		
//	static Juice makeJuice(FruitBox  box) { 
//		String tmp = " ";
//		Iterator  it = box.getList().iterator(); 
//		while(it.hasNext()) {
//			tmp += *(Fruit)*it.next() + " ";
//		}
//		return  new   Juice(tmp);
//		}



public class Java_TypeErasure {

	public static void main(String[] args) {

	}

}
