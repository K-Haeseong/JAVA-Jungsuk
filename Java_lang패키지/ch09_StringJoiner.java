// StringJoiner : join()은 여러 문자열 사이에 구분자를 넣어서 결합한다.
//
//	String animals = "dong,cat,bear";
//	String[] arr = animals.split(",");
//	String str = String.join("-", arr);
//	System.out.println(str);
//	
//
// <문자열과 기본형 간의 변환>
//
//	
//	숫자를 문자열로 바꾸는 방법
//	int i = 100;
//	String str1 = i + "";				// 1. 편리함
//	String str2 = String.valueOf(i);	// 2. 성능UP
//	String 변수명 = String.valueOf(바꿀타입 + 입력값)
//	
//	문자열을 숫자로 바꾸는 방법
//	int i2 = Integer.parseInt("100"); 	// 1. 바꿀타입.parse바꿀타입(String s)
//	int i3 = Integer.valueOf("100");	// 2. 바꿀타입.valueOf(String s)
//	Integer i3 = Integer.valueOf("100");
	
	
	public class ch09_StringJoiner {
		public static void main(String[] args) {
	
			int iVal = 100;
			String strVal = String.valueOf(iVal);		// int를 String으로 변환 방법1
			// String StrVal = ival + "";				// 위에 문장과 같음
			
			double dVal = 200.0;
			String strVal2 = dVal + "";				//	double을 String으로 변환 방법2
			
			double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);	// 문자열을 숫자로 바꾸는 방법1
			double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);		// 문자열을 숫자로 바꾸는 방법2
			
			System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
			System.out.println(strVal+"+"+strVal2+"="+sum2);
			// 2개 다 같은 내용
	}
 	
}
