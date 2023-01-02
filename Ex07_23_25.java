// 다형성 : 조상 타입 참조변수로 자손 타입 객체를 다루는 것
//
// * 자손타입 참조변수로 조상타입 객체를 가리킬 수 없다. (리모콘 버튼 7개인데 사용할 수 있는 것은 5개)
// 	=> 참조변수가 사용할 수 있는 멤버의 개수는 인스턴스의 멤버 개수보다 같거나 적어야 한다.
//
// * 참조변수의 타입은 인스턴스의 타입과 보통 일치, 하지만 일치 하지 않을 수도 있다. 
//	=> 객체와 참조변수 타입이 일치할 때와 일치 하지 않을 때의 차이? : 사용할 수 있는 멤버 개수가 차이 난다. 



// 참조변수 형변환 : 사용할 수 있는 멤버의 갯수를 조절하는 것
//   			 조상과 자손 관계의 참조변수는 서로 형변환 가능


class Car{
	String color;
	int door;
	
	void dirve() {
		System.out.println("drive모드입니다.");
	}
	void stop() {
		System.out.println("stop합니다.");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water 발사!!");
	}
}
 
public class Ex07_23_25 {

	public static void main(String[] args) {
		
		Car car = new Car();
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		car = fe; 				// car = (Car)fe; 형변환 생략가능 - 리모콘 버튼을 줄이기 때문에 형변환 생략가능
//		car.water();			// Car 클래스에는 water 기능없음
		fe2 = (FireEngine)car;	// 리모콘 개수를 늘리기 때문에 형변환 생략불가
		fe2.water();
		
		// 컴파일은 되지만 형반환시 실행 오류 나는 경우 
		// 형변환시 참조변수 타입만 따질 것이 아니라, 
	  	// 참조변수들이 가리키는 실제 인스턴스가 무엇인지 확인 후 그 멤버의 개수를 넘어서면 안 되도록 한다.
		
//		Car c = new Car();
//		FireEngine fe3 = (FireEngine)c;
//		fe3.water(); // 컴파일 OK , 실행오류 - 셀제로 가르키는 인스턴스가 Car라서 water기능 자체가 없음
	}

}
