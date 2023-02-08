// 데몬 쓰레드(daemon thread)	: 일반 쓰레드(non-daemon thread)의 작업을 돋는 보조적인 역할을 수행
//							: 일반 쓰레드가 모두 종료되면 자동적으로 종료된다. 
//							: 가비지 컬렉터, 자동저장, 화명 자동갱신 등에 사용된다.
//							: 무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성한다.
//
// boolean isDaemon ()	: 쓰레드가 데몬 쓰레드인지 확인한다. 데몬 쓰레드이면 true를반환한다.
// void setDaemon(boolean  on)	: 쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경한다.
//								: 매개변수 on을 true로 지정하면 데몬 쓰레드가 된다.
// * setDaemon메서드는 반드시 start()를 호출하기 전에 실행되어야한다. 
//	 그렇지 않으면 IllegalThreadStateException이 발생한다.

// < 쓰레드의 상태 >
// 1. NEW			: 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태
// 2. RUNNABLE		: 실행 중 또는 실행 가능한 상태
// 3. BLOCKED		: 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
// 4. WAITING		: 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은(unrunnable) 일시정지상태
// 4. TIMED_WAITING	: TIMED_WAITING은 일시정지시간이 지정된 경우를 의미
// 5. TERMINATED	: 쓰레드의 작업이 종료된 상태



public class Daemon_Thread implements Runnable {
	
	static boolean autoSave = false;
	
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(3*1000); // 3초
			}catch(InterruptedException e) {}
		
		if(autoSave) autoSave();
		}
	}

	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Daemon_Thread());
		t1.setDaemon(true);
		t1.start();
		
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);
			
			if(i==5) {autoSave=true;}
		}
		System.out.println("프로그램 종료");
	}

	
}
