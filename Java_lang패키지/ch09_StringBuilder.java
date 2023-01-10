// StringBuilder	:	StringBuilder는 동기화 X (데이터 보호 X)
//					:	StringBuffer는 동기화 O (데이터 보호 O) (멀티쓰레드에 안전하다 = thread-safe)
//					:	멀티 쓰레드 프로그래임이 아닌 경우, 동기화는 불필요한 성능저하
//						=> 싱글 쓰레드 : StringBuilder 사용 
//						=> 멀티 쓰레드 : StringBuffer 사용 


// thread	- 싱글 쓰레드 : 한번에 1개의 작업
//		 	- 멀티 쓰레드 : 한번에 여러개의 작업 - EX) 채팅프로그램 => 파일 다운로드와 채팅 동시에 가능 


public class ch09_StringBuilder {

	public static void main(String[] args) {
		
	}

}
