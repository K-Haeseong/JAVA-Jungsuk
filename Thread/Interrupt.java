import javax.swing.JOptionPane;

// < 쓰레드의 상태 >
// 1. NEW			: 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태
// 2. RUNNABLE		: 실행 중 또는 실행 가능한 상태
// 3. BLOCKED		: 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
// 4. WAITING		: 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은(unrunnable) 일시정지상태
// 4. TIMED_WAITING	: TIMED_WAITING은 일시정지시간이 지정된 경우를 의미
// 5. TERMINATED	: 쓰레드의 작업이 종료된 상태


// 쓰레드의 실행제어	: 쓰레드의 실행을 제어할 수 있는 메서드가 제공된다.
//				: 이 들을 활용해서 보다 효율적인 프로그램을 작성할 수 있다.

// interrupt()	: 대기상태(WAITING)인 쓰레드를 실행대기 상태(RUNNABLE)로 만든다.
//				: 쓰레드를 중단하거나, 중단시킨 쓰레드를 재개하고 싶을 때 사용한다.
//				: start()호출 => interrupt()를 호출 => interrupted 상태 : true
// < 종류 >
// void interrupt()				: 쓰레드의 interrupted상태(인스턴스 변수)를 false에서 true로 변경 
// boolean isInterrupted()		: 쓰레드의 interrupted상태(인스턴스 변수)를 반환
// static boolean interrupted()	: 현재 쓰레드의 interrupted상태(인스턴스 변수)를 알려주고, false로 초기화
//								: interrupt()가  호출 X => false
//								: interrupt()가  호출 O => true

class Thread07 extends Thread {
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<250000000000000000L; x++); // 시간 지연시키기
		}
		System.out.println("카운트 종료");
	}
}



public class Interrupt {

	public static void main(String[] args) {

		Thread07 t7 = new Thread07();
		t7.start();
		String input = JOptionPane.showInputDialog("원하는 값을 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		t7.interrupt();
		System.out.println("isInterrupted() : " + t7.isInterrupted());
		
	}

}
