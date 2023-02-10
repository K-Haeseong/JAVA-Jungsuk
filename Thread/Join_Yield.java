// join()	: 지정된 시간동안 특정 쓰레드가 작업하는 것을 기다린다.
//			: 예외처리를 해야한다.(InterruptedException이 발생하면 작업 재개)

// void join()						: 작업이 모두 끝날 때가지
// void join(long millis)			: 천분의 일초 동안
// void join(long millis, int nanos): 천분의 일초 + 나노초 동안

// yield()	: 남은 시간을 다음 쓰레드에게 양보하고, 자신(현재 쓰레드)은 실행대기한다.
//			: yield()와 interrupt()를 적절히 사용하면, 응답성과 효율을 높일 수 있다.


class Thread11 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
}


class Thread12 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
}


public class Join_Yield {

		static long startTime = 0;
		
		public static void main(String[] args) {

			Thread11 t1 = new Thread11(); 
			Thread12 t2 = new Thread12(); 
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
