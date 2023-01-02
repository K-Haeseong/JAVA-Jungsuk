// instanceof 연산자
// : 참조변수의 형변환 가능여부 확인에 사용, 가능하면 true 반환
// : 형변환 전에 반드시 instanceof로 확인해야 함


class Phone{
	void nomarl() {
		System.out.println("일반 핸드폰입니다.");
	}
}

class Iphone extends Phone {
	void getapple() {
		System.out.println("감성이 추가 되었습니다.");
}	
}
public class Ex07_26 {

	public static void main(String[] args) {
		
		Iphone I = new Iphone();
		
		if(I instanceof Phone) {  // 조상타입으로 참조변수 변화 가능한지 확인
			Phone ph = (Phone)I;
			ph.nomarl();
			}
		
	}
}
