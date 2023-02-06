// 쓰레드 그룹 : 서로 관련된 쓰레드를 그룹으로 묶어서 다루기 위한 것
//			: 모든 쓰레드는 반드시 하나의 쓰레드 그룹에 포함되어 있어야 한다. 
//			: 쓰레드 그룹을 지정하지 않고 생성한 쓰레드는 'main쓰레드 그룹'에 속한다.
//			: 자신을 생성한 쓰레드(부모 쓰레드)의 그룹과 우선순위를 상속받는다.

// < 쓰레드의 생성자 >
// Thread(ThreadGroup group)
// Thread(ThreadGroup group, Runnable target)
// Thread(ThreadGroup group, Runnable target, String name)
// Thread(ThreadGroup group, Runnable target, String name, long stackSize)

// < 쓰레드 그룹과 관련된 메서드 >
// ThreadGroup getThreadGroup() 				: 쓰레드 자신이 속한 쓰레드 그룹을 반환한다.
// void uncaughtExcption(Thread t, Throwable e) : 처리되지 않은 예외에 의해 쓰레드 그룹의 쓰레드가 실행이 종료되었을때,
//												  JVM에 의해 이 메서드가 자동적으로 호출된다.

public class Thread_Group {

	public static void main(String[] args) {

		
	}

}
