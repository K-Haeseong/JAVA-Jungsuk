// 오버라이딩
// 오버로딩 VS 오버라이딩

class Point2D {
	int x;
	int y;
	
	String getLocation() {
		return "x: " + x + ", y: " + y; 
//		String result =  "x: " + x + ", y: " + y;
//		return result;
// 		위 2개를 하나로 합친 것
	}
}

class Point3D extends Point2D {
	int z;
	
//	조상의 getLocation()을 오버라이딩
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}

}

public class Ex07_07_09 {

	public static void main(String[] args) {
		
		Point3D a = new Point3D();
		a.x = 3;
		a.y = 4;
		a.z = 5;
		
		System.out.println(a.getLocation());	// 오버라이딩 전 - x: 3, y: 4
												// 오버라이딩 후 - x: 3, y: 4, z: 5
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
