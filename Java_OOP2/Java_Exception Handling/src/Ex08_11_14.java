import java.io.File;

// 예외선언하기, finally블럭

// 예외를 처리하는 방법	: try-catch문, 선언하기, 덮기

// 메서드에 예외 선언하기 : 메서드 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것
// ArrayIndexOutOfBoundsException 기본값이 0??

// finally 블럭 : 예외 발생여부와 관계없이 수행되어야 하는 코드를 넣는다.


public class Ex08_11_14 {

	public static void main(String[] args) {
	
		try {
			File f = createFile("text.txt");
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+ " 다시 입력해주시기 바랍니다.");
		}
	} // main 메서드 끝
	
	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("파일이름이 유효하지 않습니다.");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}
