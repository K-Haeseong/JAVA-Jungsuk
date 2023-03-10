// 제어자, static, final, abstract
// 캡슐화
//
// < 제어자(modifier) > 
// 1. 클래스와 클래스의 멤버(멤버 변수·메서드)에 부가적인 의미를 부여
// 		=> 접근 제어자 : public, protected, (default), private
// 		=> 그	외	: static, final, abstract, native, transient, synchronized, volatile, strictfp
// 2. 하나의 대상에 여러 제어자를 같이 사용 가능 (접근 제어자 = 1개만 가능)
// 
// <접근 제어자> 	: 1개만 사용가능
// private	  -	: 같은 클래스 내에서만 접근이 가능 
// (default)  ~ : 같은 패키지 내에서만 접근이 가능
// protected  # : 같은 패키지 내 or 다른 패키지의 자손클래스에서 접근이 가능
// public	  +	: 접근 제한이 전혀 없음
// 
// 
// 
// <static – 클래스의, 공통적인>
// 사용될 수 있는 곳 - 멤버변수, 메서드, 초기화 블럭
// 
// 
// < final – 마지막의, 변경될 수 없는>
// 사용될 수 있는 곳 - 클래스, 메서드, 멤버변수, 지역변수
// 
// 
// 
// < abstract – 추상의, 미완성의>
// 1. 추상메서드 = 미완성메서드(선언부만 있음)
// 2. 추상 클래스의 인스턴스 생성불가 : 불완전한 설계도는 제품을 만들 수 없다.
// * 해결방법 : 추상클래스를 상속받아서 완전한 클래스(구상 클래스)를 만들어서 객체를 생성
//
//
//
// <제어자 조합 주의사항>
// 1. 메서드에 static과 abstract를 함께 사용할 수 없다.
// =>	static메서드는 몸통이 있는 메서드에만 사용할 수 있기 때문이다.
// 
// 2. 메서드에 private과 final을 같이 사용할 필요는 없다.
// =>	접근 제어자가 private인 메서드는 오버라이딩 될 수 없기 때문이다.
//  	이둘 중 하나만 사용해도 의미가 충분하다.
// 
// 3. abstract 메서드의 접근 제어자가 private일 수 없다.
// =>	abstract메서드는 자손클래스에서 구현해주어야 하는데,
// 	접근 제어자가 private이면, 자손클래스에서 접근할 수 없기 때문이다.
// 
// 4. 클래스에 abstract와 final을 동시에 사용할 수 없다.
// => 	클래스에 사용되는 final은 클래스를 확장할 수 없다는 의미이고,
// 	abstract는 상속을 통해서 완성되어야 한다는 의미이므로 서로 모순되기 때문이다.
// 
// 
//
// <캡슐화와 접근 제어자>
// * 접근 제어자를 사용하는 이유
// 1. 외부로부터 데이터를 보호하기 위해서
// 2. 외부에는 불필요한 부분 · 내부적으로만 사용되는 부분을 감추기 위해서
// 
// (Tip. 접근 제어자의 범위는 최대한 좁히고 필요할 때 넓히는 것이 좋다.)


class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isNotVaildHour(hour)) return; 		// alt + shift + M => 메서드 추출
		this.hour = hour;
	}

	private boolean isNotVaildHour(int hour) { 	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
		return 0 > hour || hour > 23;
	}
	
	public int getHour() { return hour;};
	}



public class Ex07_17_22 {

	public static void main(String[] args) {
		
		Time t = new Time();
//		t.hour = 100; // 이렇게 하면 오류 - 메서드를 통해서 변경할 수 있도록 데이터를 보호해야한다.
		System.out.println(t.getHour()); // 바뀌기 전 시간
		t.setHour(12);
		System.out.println(t.getHour()); // 바뀐 후 시간
		

	}

}
