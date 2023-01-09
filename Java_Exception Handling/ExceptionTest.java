// ExceptionTest 
// 1. 설치실행 - 설치예외 발생 /  일반 예외
// 2. 설치예외	- 설치시작메서드 /(공간부족예외 발생 / 메모리부족 예외 발생 - 설치예외의 원인예외로 설정)
// 			- 파일복사메서드
// 3. 설치시작메서드에 공간부족/메모리 부족 예외 던지기


class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}


public class ExceptionTest {

	public static void main(String[] args) {

		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void install() throws InstallException {
		try {
		 startInstall();
		 copyfiles();
	} catch (SpaceException se) {
		InstallException ie = new InstallException("설치중 예외발생");
		ie.initCause(se);
		throw ie;
	} catch (MemoryException me) {
		InstallException ie = new InstallException("설치중 예외발생");
		ie.initCause(me);
		throw ie;
	}
}
	
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!engouhSpace()) {
			throw new SpaceException("설치공간이 부족합니다.");
		}
		
		if(!engouhMemoery()) {
			throw new MemoryException("메모리 설치공간이 부족합니다.");
//			throw new RuntimeException(new MemoryException("메모리 설치공간이 부족합니다."));
//			=> 이렇게 하면 startInstall() 에서 MemoryException 선언 지워도 된다.
		}
	}
	
	static boolean engouhSpace() {
		return false;
	}
	
	static boolean engouhMemoery() {
		return true;
	}
	
	
	static void copyfiles() {
		System.out.println("파일을 복사합니다.");
	}
	
}
