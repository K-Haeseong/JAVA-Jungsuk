// 문자열을 숫자로 변환하는 다양한 방법
//	1. int i = new Integer("100").intValue();
//	2. int i2 = Integer.parseInt("100");
//	3. Integer i3 = Integer.valueOf("100");

// n진법의 문자열을 숫자로 변환하는 방법
// int i4 = Integer.parseInt("100",2) // 100(2) => 십진수 4
// int i5 = Integer.parseInt("100",8) // 100(8) => 십진수 64
// int i6 = Integer.parseInt("100",16) // 100(16) => 십진수 256
// int i7 = Integer.parseInt("FF",16) // 100(16) => 십진수 255
// int i8 = Integer.parseInt("FF") // FF(16) => NumberFormatException발생

public class ch09_ConvertTest {

	public static void main(String[] args) {
		
		
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100",10));
		System.out.println("i="+Integer.parseInt("100",2));	// 2진수
	    System.out.println("i="+Integer.parseInt("100",8));	// 8진수
		System.out.println("i="+Integer.parseInt("100",16));	// 16진수
		System.out.println("i="+Integer.parseInt("FF",16));
//		System.out.println("i="+Integer.parseInt("FF")); 
	}                                                
}
