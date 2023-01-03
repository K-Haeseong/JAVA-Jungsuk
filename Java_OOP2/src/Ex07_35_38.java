// 인터페이스의 선언, 상속, 구현
// 인터페이스와 다형성

interface Fightable {
	void move (int x, int y); 	// 인터페이스는 항상 public abstract 생략 된 것 주의
	void attack (Fightable f);
}


abstract class Unit2 {
	int x,y;
	abstract void move(int x, int y);
	void stop () {System.out.println("현재 위치에 멈춥니다.");}
}

class Fighter extends Unit2 implements Fightable {
	// 오버라이딩 규칙 - 조상과 접근제어자가 같거나 넓어야 한다.
	public void move(int x, int y) {
		System.out.println("["+ x + ", " + y + "]" + " 위치로 이동합니다.");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격합니다.");
	}
	
}

public class Ex07_35_38 {

	public static void main(String[] args) {

		Fighter f = new Fighter();
		f.move(50, 50);
		f.stop();
		f.attack(f); 		// Fighter B = new Fighter(); 
		System.out.println();			// A.attack(B)
										// 같은 코드이다

		Unit2 u = new Fighter();	   
		u.move(100, 100);
		u.stop();
//		u.attack(new Fighter()); 		// Unit2에는 attack기능이 없어서 실행불가 
		System.out.println();
		
		
		Fightable f3 = new Fighter();
		f3.move(200, 200);
//		f3.stop();						// Fightable에는 stop기능이 없어서 실행불가			
		f3.attack(new Fighter());
		
	}

}
