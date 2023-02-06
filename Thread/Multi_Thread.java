// 멀티 쓰레드	: 두 개의 쓰레드로 작업 하는 경우, 짧은 시간동안 2개의 쓰레드가 번갈아 가면서 작업을 수행해서 동시에 두 작업이 처리
//			: 멀티 쓰레드가 싱글 쓰레드 보다 시간이 조금 더 걸린다 
//			 => 쓰레드간의 작업 전환(context switching)에 시간이 걸리기 때문에

public class Multi_Thread {

	static long startTime = 0;

	public static void main(String[] args) {
		
		Thread03 t3 = new Thread03();
		t3.start();
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}			
		System.out.println();
		System.out.println("작업1 소요시간 : " + (System.currentTimeMillis() - startTime)/1000.0 + "초");
	}
}


class Thread03 extends Thread {
	
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println();
		System.out.println("작업2 소요시간 : " + (System.currentTimeMillis() - Multi_Thread.startTime)/1000.0 + "초");
	}
}



