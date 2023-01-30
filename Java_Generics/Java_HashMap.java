import java.util.HashMap;

// HashMap <K, V>	: 여러 개의 타입 변수가 필요한 경우 콤마(,)를 구분자로 선언

public class Java_HashMap {

	public static void main(String[] args) {
		
			
		HashMap<String, Student2> map = new HashMap<String, Student2>();
//		HashMap<String, Student2> map = new HashMap<>();	// JDK 1.7부터 생략가능
		
		map.put("킹자바", new Student2("킹자바", 1, 1, 100, 100, 100));
		System.out.println(map);
		
//		Student2 s = (Student2)map.get("킹자바");		// 제네릭때문에 형변환 생략가능
		Student2 s = map.get("킹자바");	
		System.out.println(s);
		
		}
	}

class Student2 {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}

}
