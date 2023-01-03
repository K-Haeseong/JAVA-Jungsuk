//<추상 클래스 작성> : 	여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나,
//					기존클래스의 공통부분을 뽑아서 추상클래스를 만든다.

//스타크레프트 여러 유닛 만들고 한번에 이동시키기
// 유닛 - 이동, 정지, 위치, 고유기술

abstract class Unit {
	int x, y;  // 이거 왜 있어야 되나? - 현재 위치가 있어야 다른 위치로 이동을 한다 - 그래서 변수 선언해줌
	abstract void move(int x, int y);
	void stop() {
		System.out.println("현재위치에 멈춥니다.\n");		
	}
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine이/가" + "["+ x + ", " + y + "]" + " 위치로 이동합니다.");
	}
	
	void stop() {
		System.out.println("현재위치에 멈춥니다.\n");		
	}
	void StimPack() {
		System.out.println("스팀팩을 사용합니다.");
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank이/가" + "["+ x + ", " + y + "]" + " 위치로 이동합니다.");
	}
	
	void stop() {
		System.out.println("현재위치에 멈춥니다.\n");		
	}
	void ChangeMode() {
		System.out.println("모드를 전환합니다.");
	}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship이/가" + "["+ x + ", " + y + "]" + " 위치로 이동합니다.");
	}
	
	void stop() {
		System.out.println("현재위치에 멈춥니다.\n");		
	}
	void Load() {
		System.out.println("유닛을 태웁니다.");
	}
	
	void UnLoad() {
		System.out.println("유닛을 내립니다.");
}
	}


public class Ex07_33_34 {

	public static void main(String[] args) {
		
		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		
//		group[0].move(10, 20); 
//		group[1].move(10, 20); 
//		group[2].move(10, 20); 
		
//		group[0].stop();
//		group[1].stop();
//		group[2].stop();
// 		위에 내용을 반복문으로 바꾼다.
		
		for (int i = 0; i < group.length; i++) {
			group[i].move(10,20);
			group[i].stop();
		}
	}
}
