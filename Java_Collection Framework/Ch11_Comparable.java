// Comparable	: 기본 정렬기준을 구현하는데 사용=> "객체를 비교할 수 있도록 만든다."
//				: Comparable은 "자기 자신과 매개변수 객체를 비교"하는 것
//				: Comparable과 Comparator는 모두 인터페이스(interface)
//				: Comparable을 사용하고자 한다면 compareTo 메서드를 재정의(Override/구현)을 해주어야 한다
//				: compareTo()는 정수(int값)을 반환하며, 자기 자신을 기준으로 상대방과의 차이 값을 비교하여 반환한다. 
//				  										((자신보다=오른쪽이) 크면 : +1, 같으면 : 0, 작으면 : -1 )


// ※ 기본 자료형이기 때문에 부등호로 쉽게 비교가 가능하다.
//
// ※ 객체는 왜 부등호로 비교하면 안 되는건가? 
//	=> 비교할 기준이 명확X, 객체는 사용자가 기준을 정해주지 않으면, 어떤 객체가 더 높은 우선순위를 갖는지 판단 할 수가 없다. 
//
// ※ Comparable	=> lang패키지	: import 필요 X 
//   Comparator	=> util패키지	: import 필요 O	

																	// 출처 : Stranger's LAB
// 생성한 객체 스스로 가지고 있는 Comparable이 구현되어 기준을 갖게 하거나 
// Comparator로 기준을 생성해서 넣어주어 기준을 갖게 해야한다.

	public class Ch11_Comparable {
	
		public static void main(String[] args) {
			
			Student a = new Student(17, 2);	// 17살 2반
			Student b = new Student(18, 1);	// 18살 1반
			
			
			int isBig = a.compareTo(b);	// a자기자신과 b객체를 비교한다.
			
			if(isBig > 0) {
				System.out.println("a객체가 b객체보다 큽니다.");
			}
			else if(isBig == 0) {
				System.out.println("두 객체의 크기가 같습니다.");
			}
			else {
				System.out.println("a객체가 b객체보다 작습니다.");
			}
			
		}
	 
	}
	 
	class Student implements Comparable<Student> {
	 
		int age;			// 나이
		int classNumber;	// 학급
		
		Student(int age, int classNumber) {
			this.age = age;
			this.classNumber = classNumber;
		}
		
		@Override
		public int compareTo(Student o) {
			return this.age - o.age;	// ※ 비교대상의 값 차이를 반환할 경우 => 'Underflow'와 'Overflow' 발생 가능성 주의
		}
	}

