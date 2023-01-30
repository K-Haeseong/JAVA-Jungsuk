import java.util.ArrayList;
import java.util.Iterator;

// Iterator <E>	: 클래스를 작성할 때, Object타입 대신 T와 같은 타입 변수를 사용

public class Java_Iterator {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕", 1, 1));
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
//			Student s = (Student)it.next();		// 지네릭스를 사용하지 않으면 형변환 필요.
			Student s = it.next();
			System.out.println(s.name);
//			System.out.println(it.next().name);	// 위에 2개 합친 것 - 이게 코드가 더 간결
			
		}
	} // main
}

class Student {
	String name = "";
	int ban;
	int no;

	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}

}
