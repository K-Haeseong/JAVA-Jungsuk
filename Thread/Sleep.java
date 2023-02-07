// < 쓰레드의 상태 >
// 1. NEW			: 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태
// 2. RUNNABLE		: 실행 중 또는 실행 가능한 상태
// 3. BLOCKED		: 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
// 4. WAITING		: 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은(unrunnable) 일시정지상태
// 4. TIMED_WAITING	: TIMED_WAITING은 일시정지시간이 지정된 경우를 의미
// 5. TERMINATED	: 쓰레드의 작업이 종료된 상태


// 쓰레드의 실행제어	: 쓰레드의 실행을 제어할 수 있는 메서드가 제공된다.
//				: 이 들을 활용해서 보다 효율적인 프로그램을 작성할 수 있다.


// static void sleep()	: 현재 쓰레드를 지정된 시간동안 멈추게 한다.
//						: 예외처리를 해야 한다.(InterruptException이 발생하면 깨어남)
//						* InterruptException => Exception의 자손 => 필수예외처리 
//						: 특정 쓰레드를 지정해서 멈추게 하는 것은 불가능하다.

// < 종류 >					
// static void sleep(long millis) - 천분의 일초 단위
// static void sleep(long millis, int nanos) - 천분의 일초 + 나노초



class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.println("<<작업1 종료>>");
	}
}


class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.println("<<작업2 종료>>");
	}
}


public class Sleep {

	public static void main(String[] args) {

		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {}
		
		System.out.println("<<main 작업종료>>");
		
	}

}
