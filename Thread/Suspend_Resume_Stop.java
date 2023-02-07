// < 쓰레드의 상태 >
// 1. NEW			: 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태
// 2. RUNNABLE		: 실행 중 또는 실행 가능한 상태
// 3. BLOCKED		: 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
// 4. WAITING		: 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은(unrunnable) 일시정지상태
// 4. TIMED_WAITING	: TIMED_WAITING은 일시정지시간이 지정된 경우를 의미
// 5. TERMINATED	: 쓰레드의 작업이 종료된 상태


// 쓰레드의 실행제어	: 쓰레드의 실행을 제어할 수 있는 메서드가 제공된다.
//				: 이 들을 활용해서 보다 효율적인 프로그램을 작성할 수 있다.

// suspend()	: 쓰레드를 일시정지 시킨다.
// resume()		: suspend()에 의해 일시정지된 쓰레드를 실행대기상태로 만든다.
// stop()		: 쓰레드를 즉시 종료시킨다.
// * but 위에 메서드들은 deprecated => 사용권장X : 교착상태(deadlock)를 일으키기 쉽게 작성되어있으므로 사용이 권장되지 않는다. 

class Thread08 extends Thread {
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
					Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}


public class Suspend_Resume_Stop { 

	public static void main(String[] args) {

		Thread08 r = new Thread08();
		Thread th1 = new Thread(r,"*");
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r,"***");
		
//		th1.setPriority(9);
//		th2.setPriority(6);
//		th3.setPriority(3);
		
		th1.start();
		th2.start();
		th3.start();
		
		
		try {
			Thread.sleep(2000);
			th1.suspend();	// 쓰레드 th1 잠시 중단	
			Thread.sleep(2000);
			th2.suspend();	// 쓰레드 th2 잠시 중단	
			Thread.sleep(2000);
			th1.resume();	// 쓰레드 th1 재개
			Thread.sleep(3000);
			th1.stop();		// 쓰레드 th1 강제종료
			Thread.sleep(3000);
			th2.stop();		// 쓰레드 th2 강제종료
			Thread.sleep(2000);
			th3.stop();		// 쓰레드 th3 강제종료
		} catch (InterruptedException e) {}
		
		
	}

}
