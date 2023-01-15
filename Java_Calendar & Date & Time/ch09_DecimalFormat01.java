// 형식화 클래스	: java.text패키지의 DecimalFormat,SimpleDateFormat
//				: 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능(숫자, 날짜 => 형식 문자열)
//				: 형식 문자열에서 숫자와 날짜를 뽑아내는 기능(형식 문자열 => 숫자, 날짜 )

// DecimalFormat	: 숫자를 형식화할 때 사용(숫자 => 형식 문자열)
//					: 특정 형식의 문자열을 숫자로 변환할 때도 사용(형식 문자열 => 숫자)
//
// *주의* - Integer.parseInt()는 콤마( , )가 포함된 문자열을 숫자로 변환 못한다.



import java.text.DecimalFormat;

public class ch09_DecimalFormat01 {

	public static void main(String[] args) {

		double number  = 1234567.89;

		String[] pattern = {
			"0",
			"#",
			"0.0",
			"#.#",
			"0000000000.0000",
			"##########.####",
			"#.#-",
			"-#.#",
			"#,###.##",
			"#,####.##",
			"#E0",
			"0E0",
			"##E0",
			"00E0",
			"####E0",
			"0000E0",
			"#.#E0",
			"0.0E0",
			"0.000000000E0",
			"00.00000000E0",
			"000.0000000E0",
			"#.#########E0",
			"##.########E0",
			"###.#######E0",
			"#,###.##+;#,###.##-",
			"#.#%",
			"#.#\u2030",
			"\u00A4 #,###",
			"'#'#,###",
			"''#,###",
		};
		
		for(int i=0; i < pattern.length; i++) {
		    DecimalFormat df = new DecimalFormat(pattern[i]);
		    System.out.printf("%19s : %s\n",pattern[i], df.format(number));
		}
		
	}

}
