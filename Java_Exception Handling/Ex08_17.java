// 예외 되던지기	: 예외를 처리한 후에 다시 예외를 발생시키는 것
//				: 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것




public class Ex08_17 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main 메서드에서 예외가 처리되었습니다.");
		}
	} // main메서드의 끝




	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1 메서드에서 예외가 처리되었습니다.");
			throw e;
		}
	}//method1메서드의 끝

}