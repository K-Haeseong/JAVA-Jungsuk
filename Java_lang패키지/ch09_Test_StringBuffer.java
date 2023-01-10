public class ch09_Test_StringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56); 				// 메서드 체이닝
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		System.out.println("sb = " + sb);
		System.out.println("sb1 = " + sb2);
		System.out.println("sb2 = " + sb3);
		
		
		System.out.println("sb = " + sb.deleteCharAt(10));
		System.out.println("sb = " + sb.delete(3,6));
		System.out.println("sb = " + sb.insert(3, "abc"));
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		
		
		System.out.println("capacity = "+sb.capacity());	// 배열의 길이
		System.out.println("length = "+sb.length());		// 저장된 문자의 개수
	}

}
