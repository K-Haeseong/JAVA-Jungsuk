// 싱글쓰레드	: 하나의 쓰레드로 두 작업을 처리하는 경우는 한 작업을 마친 후 다른 작업을 시작
// 멀티 쓰레드가 시간이 조금 더 걸린다  -  쓰레드간의 작업 전환(context switching)에 시간이 걸리기 때문에

public class Single_Thread {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		// 작업1
		for (int i = 0; i < 500; i++) {
			System.out.printf("%s", new String("-"));
		}
		System.out.println();
		System.out.println("소요시간1 : " + (System.currentTimeMillis() - startTime)/1000.0 + "초");
		
		// 작업2
		for (int i = 0; i < 500; i++) {
			System.out.printf("%s", new String("|"));
		}
		System.out.println();
		System.out.println("소요시간2 : " + (System.currentTimeMillis() - startTime)/1000.0 + "초");
		
	}

}
