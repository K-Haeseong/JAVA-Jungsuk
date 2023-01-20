import java.util.HashMap;
import java.util.Scanner;

// 	Map인터페이스  : 순서 X, 중복(키 X, 값 O)	: 키와 값의 쌍으로 이루어진 데이터의 집합
//										: 순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다.
//											EX) 아이디와 비밀번호, 우편번호, 지역번호

//	< HashMap VS Hashtable(구버전) >
//	HashMap		: 동기화 X
//	Hashtable	: 동기화 O

//	HashMap	: Map인터페이스를 구현한 대표적인 컬렉션 클래스
//			: 순서를 유지하려면, LinkedHashMap클래스를 사용하면 된다.
//			: 해싱(hashing)기법으로 데이터를 저장 - 데이터가 많아도 검색이 빠르다
//			: Entry[] table 안에 키(key) 값(value)에 쌍으로 저장된다.(객체지향적)
//			: Object[]에 각각 저장할 수도 있긴하다(But 비객체지향적)

//	* 해싱(hashing)기법		: 해시함수(hash function)로 해시테이블(hashtable)에 데이터를 저장, 검색 
//	* 해시테이블(hash table)	: 배열 + 링크드 리스트 조합된 형태
//	  						  =>배열의 장점인 접근성과 링크드리스트의 장점 변경에 유리함을 섞음
//	* Hash 붙어있는 것은 해싱(hashing)기법 사용한 것

//	* 해싱테이블에 저장된 데이터를 가져오는 과정
//		1. 키로 해시함수를 호출해서 해시코드(배열의 index=캐비넷의 위치)를 얻는다.
//		2. 배열에서(캐비넷의 위치) 해시코드(해시함수의 반환값)에 대응하는 링크드리스트를 찾는다.
//		3. 링크드리스트에서 키와 일치하는 데이터를 찾는다.
//		※ 해시함수는 같은 키에 대해 항상 같은 해시코드를 반환해야 한다.
//		※ 서로 다른 키일지라도 같은 값의 해시코드를 반환할 수도 있다. => 같은 캐비넷 안에 들었을 수도 있기 때문에  

// 	TreeMap	: 범위 검색과 정렬에 유리한 컬렉션 클래스
//			: HashMap보다 데이터 추가, 삭제에 시간이 더 걸림
//			: TreeSet과 거의 비슷함



// 아이디와 패스워드
public class Ch11_HashMap01 {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("myId", "1234");
		hm.put("qwer", "1111");
		hm.put("qwer", "5678");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 PASSWORD를 입력하세요.");
			System.out.print("ID : ");
			String id = sc.nextLine();
			
			if(!hm.containsKey(id)) {
				System.out.println("입력하신 ID가 존재하지 않습니다. 다시 입력해주세요.");
				System.out.println();
				continue;
			} 
			
			System.out.print("PASSWORD : ");
			String pw = sc.nextLine();
			
			
			if(!hm.get(id).equals(pw)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				System.out.println();
			} else {
				System.out.println("로그인 되었습니다.");
				break;
			}
		}
		
		
		
	}

}
