import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDalteFormat 	:	날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다.
//						:	특정 형식으로 되어 있는 문자열에서 날짜와 시간을 뽑아낼 수도 있다.
//
// 문자열 	=> 날짜/시간	: parse()
// 날짜/시간 => 문자열 	: format()
//
// 문자열의 형식을 바꿀때
// 문자열 => parse() => 날짜/시간 format() => 문자열

public class ch09_SimpleDalteFormat01 {

	public static void main(String[] args) {
		
		
		Date today = new Date();

		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");

		System.out.println(sdf1.format(today));	// format(Date d)
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println();
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));

	}

}
