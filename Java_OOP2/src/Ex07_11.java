// 생성자 super()

class Point4 {
	int x;
	int y;

//	Point4 () {}
	
	Point4(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y;	
	}
	
}

class Point4D extends Point4{
	int z;
	
	Point4D(int x, int y, int z){	
//		super(); - 기본 생성자를 추가해서 이렇게 해도 된다. 이것도 좋지만 다른 방법 
//		this.x = x;
//		this.y = y; // 이것들은 조상의 멤버이므로  super(x,y)로 하는 것이 좋음
		super(x,y);
		this.z = z;
	}
	
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}


public class Ex07_11 {

	public static void main(String[] args) {
		
		Point4D p4 = new Point4D(1,2,3);
		System.out.println(p4.getLocation());
		
		
	}

}
