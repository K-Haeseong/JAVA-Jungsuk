// main쓰레드	: main메서드의 코드를 수행하는 쓰레드
//			: 쓰레드는 '사용자 쓰레드(main쓰레드)'와 '데몬 쓰레드(보조 쓰레드)' 두종류가 있다.
//			: 프로그램은 실행중인 사용자 쓰레드가 하나도 없을 때 종료된다.

class Thread01 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
}


class Thread02 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
}


public class Main_Thread {

	static long startTime = 0;
	
	public static void main(String[] args) {

		Thread01 t1 = new Thread01(); 
		Thread02 t2 = new Thread02(); 
		t1.start();
		t2.start();
		startTime = System.currentTimeMillis();
		
		try {
			t1.join(); // main쓰레드가 t1의 작업이 끝날 때까지 기다린다.
			t1.join(); // main쓰레드가 t2의 작업이 끝날 때까지 기다린다.
			t2.join();
		} catch (InterruptedException e){}
		
		System.out.print("소요시간 : " + (System.currentTimeMillis() - startTime)/1000.0 + "초");
	}

}
