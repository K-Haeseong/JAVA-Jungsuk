// 연결된 예외		:	한 예외가 다른 예외를 발생시킬 수 있다.
//				:	예외 A가 예외 B를 발생시키면, A는 B의 원인 예외(cause exception)

// Throwable initCause (Throwable cause) : 지정한 예외를 원인 예외로 등록
// Throwable getCause() : 원인 예외를 반환


class InstallException extends Exception { ... }
class SpaceException extends Exception { ... }
class MemoryException extends Exception { ... }
 
public class Ex08_18 {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            System.out.println("원인 예외 : " + e.getCause()); // 원인 예외 출력
            e.printStackTrace();
        }
    }
 
    public static void install() throws InstallException {
        try {
            throw new SpaceException("설치할 공간이 부족합니다."); // SpaceException 발생
 
        } catch (SpaceException e) {
            InstallException ie = new InstallException("설치중 예외발생"); // 예외 생성
            ie.initCause(e); // InstallException의 원인 예외를 SpaceException으로 지정
            throw ie; // InstallException을 발생시켜 상위 메서드로 throws 된다.
        } catch (MemoryException e) {
            // ...
        }
    }
}


// 연결된 예외 사용이유
// 1. 여러 예외를 하나로 묵어서 다루기 위해서
// 2. checked예외(Exception과 자손 - 필수처리) 
//		→ unchecked예외(RuntimeException과 자손 - 선택처리)로 변경하려 할 때
// 자바 프로그래밍 언어가 처음 개발되던 때와 지금의 컴퓨터 환경은 많이 달라졌기 때문에, 
// 실제로 런타임 예외로 처리해도 될 것들이 아직도 checked exception으로 등록되어 강제적으로 try - catch 문을 사용해야 하는 불편함이 있고, 
// 또한 로직상 Runtime Exception으로 할 수 밖에 없는 경우가 있기 때문에, 추가된 기법이라고 생각하자

//class MyCheckedException extends Exception { ... } // checked excpetion
//
//public class Ex08_18 {
// public static void main(String[] args) {
//         install();
// }
//
// public static void install() {
//     throw new RuntimeException(new IOException("설치할 공간이 부족합니다."));
//     // Checked 예외인 IOException을 Unchecked 예외인 RuntimeException으로 감싸 Unchecked 예외로 변신 시킨다
// }
//}


