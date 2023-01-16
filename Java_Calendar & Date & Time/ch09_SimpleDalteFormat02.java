import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDalteFormat 	:	날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다.
//						:	특정 형식으로 되어 있는 문자열에서 날짜와 시간을 뽑아낼 수도 있다.
//
// 문자열 	=> 날짜/시간	: parse()
// 날짜/시간 => 문자열 	: format()
//
// 문자열의 형식을 바꿀때
// 문자열 => parse() => 날짜/시간 => format() => 문자열

public class ch09_SimpleDalteFormat02 {

	public static void main(String[] args) {

		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2022년 01월 16일");
			System.out.println(df2.format(d));
		} catch (Exception e) { }
	}

}
