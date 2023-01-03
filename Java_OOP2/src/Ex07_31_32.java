// 추상 클래스	: 일반 클래스가 추상메서드를 가지게 된 것 / 미완성 설계도, 미완성 메서드를 갖고 있는 클래스
// 		 	: 다른 클래스 작성에 도움을 주기 위한 것
//			: 인스턴스 생성 불가 – 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능

abstract class Player { 			//추상 클래스(미완성 클래스, 미완성 설계도)
	
	abstract void play(int pos); 	// 추상 메서드(미완성 메서드) - 선언부만 있고 구현부{}가 없는 메서드
	abstract void stop(); 
}
// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능

abstract class AudioPlayer extends Player{
	void play(int pos) {System.out.println(pos+"위치부터 play합니다.");}
// 상속받은 메서드 중에 하나만 구현했기 떼문에 이것도 추상 클래스가 되어 객체 생성 불가
}
	
class AudioPlayer2 extends Player{
	void play(int pos) {System.out.println(pos+"위치부터 play합니다.");}
	void stop() {System.out.println("재생을 멈춥니다.");}
// 이건 둘다 구현 했으므로 객체 생성 가능
}

public class Ex07_31_32 {

	public static void main(String[] args) {
		
//		Player p = new Player(); 				// 추상 클래스는 객체 생성불가 - 미완성 설계도라서
//		AudioPlayer ap = new AudioPlayer(); 	// 객체 생성 X - 메서드 하나만 구현했기 때문에 
		AudioPlayer2 ap2 = new AudioPlayer2(); 	// 객체 생성 O
		ap2.play(100);
		ap2.stop();
		System.out.println();
		
		Player ap3 = new AudioPlayer2(); 		// 객체 생성 O - 다형성
		ap3.play(200);
		ap3.stop();
		// 리모콘이 아무리 추상메서드 라고 해도 실제 연결된 것이 구현된 객체이므로 구현된 메서드 실행
		
		
	}
}
