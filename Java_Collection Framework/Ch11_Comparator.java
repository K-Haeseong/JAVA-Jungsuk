import java.util.Comparator;

// Comparator	: 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용 => "객체를 비교할 수 있도록 만든다."
//				: Comparator는 "두 매개변수 객체를 비교"
//				: Comparator을 사용하고자 한다면 compare메서드를 재정의(Override/구현)을 해주어야 한다
//				: compare()는 정수(int값)을 반환하며, 자기 자신을 기준으로 상대방과의 차이 값을 비교하여 반환한다. 
//												((자신보다=오른쪽이) 크면 : +1, 같으면 : 0, 작으면 : -1 )	
	

// ※ Comparator	=> util패키지	: import 필요 O	
// ※ 기본적으로 compare메소드 매커니즘 자체는 compareTo와 같다.자기 자신과 비교되느냐 안되느냐의 차이 						
																					//출처 : Stranger's LAB



	public class Ch11_Comparator {
	
		public static void main(String[] args) {
	
			Student a = new Student(17, 2);	// 17살 2반
			Student b = new Student(18, 1);	// 18살 1반
			Student c = new Student(15, 3);	// 15살 3반
	
			// a객체와는 상관 없이 b와 c객체를 비교한다.
			int isBig = a.compare(b, c);
	
			if(isBig > 0) {
				System.out.println("b객체가 c객체보다 큽니다.");
			}
			else if(isBig == 0) {
				System.out.println("두 객체의 크기가 같습니다.");
			}
			else {
				System.out.println("b객체가 c객체보다 작습니다.");
			}
	
		}
	}

	class Student implements Comparator<Student> {
	
		int age;			// 나이
		int classNumber;	// 학급
	
		Student(int age, int classNumber) {
			this.age = age;
			this.classNumber = classNumber;
		}
	
		@Override
		public int compare(Student o1, Student o2) {
			return o1.classNumber - o2.classNumber;
	
	
		}
	
	}
