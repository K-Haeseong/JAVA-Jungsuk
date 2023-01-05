// printStackTrace()와 getMessage()

// 1. 예외가 발생하면 예외객체가 생성된다.
// 2. 예외 객체 안에 예외의 정보들이 있다.
// 3. 각각의 메서드를 통해서 정보를 가지고 올 수 있다.


// printStackTrace() 	: 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
// getMessage()			: 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

// 멀티 catch블럭 : 내용이 같은 catch블럭을 하나로 합친 것

// try {
//	....
// } catch (ExcepetionA e) {
//	 e.printStackTrace();
// } catch (ExcepetionB e2) {
//	 e2.printStackTrace();
//}
//
// 위에 내용이 동일하기 때문에 중복제거를 위해 하나로 합친다.
//
// try {
//	...
// } catch (ExcepetionA | ExcepetionB) {
//	 e.printStackTrace();
// }

public class Ex08_07_08 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); 			// 예외 발생
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외메시지 내용 : " + e.getMessage());
		}
		
		System.out.println(4);
	}

}
