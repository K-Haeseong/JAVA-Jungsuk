// 프로세스와 쓰레드(process & thread)
// 프로세스	: 실행 중인 프로그램, 자원(resources : 메모리, CPU 등)와 쓰레드로 구성
// 쓰레드		: 프로세스 내에서 실제 작업을 수행
//			: 모든 프로세스는 최사한 하나의 쓰레드를 가지고 있다.
// 프로세스 => 공장 / 쓰레드 => 일꾼

// 싱글 쓰레드 프로세스 : 자원 + 쓰레드 1개
// 멀티 쓰레드 프로세스 : 자원 + 쓰레드 n개

// *하나의 새로운 프로세스를 생성하는 것보다 하나의 새로운 쓰레드를 생성하는 것이 더 적은 비용이 든다!


// <멀티 쓰레드의 장단점>		: 대부분의 프로그램이 멀티쓰레드로 작성되어 있다.
//						: 그러나, 멀티쓰레드 프로그래밍이 장점만 있는 것은 아니다.

// 장점	: 시스템 자원을 보다 효율적으로 사용할 수 있다.
//		: 사용자에 대한 응답성(responseness)이 향상된다.
//		: 작업이 분리되어 코드가 간결해 진다.

// 단점	: 동기화(synchronization)에 주의해야 한다.
//		: 교착상태(dead-lock)가 발생하지 않도록 주의해야 한다.
//		: 각 쓰레드가 효율적으로 고르게 실행될 수 있게 해야 한다.


// <쓰레드의 구현과 실행>
// 1. Thread클래스를 상속
//	=> class MyThread extends Thread {
//		public void run() { // Thread클래스의 run()을 오버라이딩
//			//작업내용
//		}
//	2. Runnable 인터페이스를 구현		
//	=> class MyThread2 implements Runnable {
//			public void run() { // Runnable인터페이스의 추상메서드 run()을 구현
//			//작업내용
//		}
//	}

// < 쓰레드의 실행 - start() >	: 쓰레드를 생성한 후에 start()를 호출해야 쓰레드가 작업을 시작한다. 
// * 쓰레드의 실행순서는 OS의 스케쥴러가 작성한 스케쥴에 의해 결정된다. 
				 

// < tart()와 run()의 차이 >
// main메서드에서 run()을 호출하는 것은 생성된 쓰레드를 실행시키는 것이 아니라 단순히 클래스에 선언된 메서드를 호출하는 것일 뿐이다.
// 반면에 start()는 새로운 쓰레드가 작업을 실행하는데 필요한 호출스택(call stack)을 생성한  다음에 run()을 호출해서, 
// 생성된 호출스택에 run()이  첫번째로 올라가게 한다. 모든 쓰레드는 독립적인 작업을 수행하기 위해 자신만의 호출스택을 필요로 하기 때문에, 
// 새로운 쓰레드를 생성하고 실행시킬때마다 새로운 호출스택이 생성되고 쓰레드가 종료되면 작업에 사용된 호출스택은 소멸된다.

// < 단계 >
// 1. main메서드에서   쓰레드의   start()를   호출한다.
// 2. start()는 새로운 쓰레드를 생성하고, 쓰레드가 작업하는데 사용될 호출스택을 생성한다. 
// 3. 새로 생성된 호출스택에 run()이 호출되어, 쓰레드가 독립된 공간에서 작업을 수행한다. 
// 4. 이제는 호출스택이 2개이므로 스케줄러가 정한 순서에 의해서 번갈아 가면서 실행된다.


public class Process_Thread {

	public static void main(String[] args) {

		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	  // 생성자 Thread(Runnable target)

		t1.start();
		t2.start();
		
	}

}

class ThreadEx1_1 extends Thread { // 1. Thread클래스 상속해서 쓰레드 구현
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println(this.getName()); // 조상인 Thread의 getName()을 호출	
												// this 사용가능한 이유 => 참조변수 this 정리한 내용 다시 보기
		}
	}
}

class ThreadEx1_2 implements Runnable { // 2. Runnable인터페이스를 구현해서 쓰레드 구현
	public void run() {
		for(int i=0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
			System.out.println(Thread.currentThread().getName());
		}
	}
}