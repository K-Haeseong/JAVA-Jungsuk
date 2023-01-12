import java.util.Calendar;

// java.util.Date	: 날짜와 시간을 다룰 목적으로 만들어진 클래스(JDK1.0)
//					: Date의 메서드는 거의 deprecated되었지만, 여전히 쓰이고 있다.
//
// java.util.Caledar	: Date클래스를 개선한 새로운 클래스(JDK1.1) 여전히 단점이 존재
//
// java.time패키지	: Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공(JDK1.8)


//	Calendar 클래스	: 추상 클래스이므로 getInstace()를 통해 구현된 객체를 얻어야 한다.
//					: get()으로 날짜와 시간 필드로 가져오기 - int get(int field)
//
//	Calendar cal = Calendar.getInstance();	// Calendar 객체는 생성하면 기본적으로 현재날짜와 시간으로 설정된다.
//  이달의 마지막 날 => cal.getActualMaximum(Calendar.DATE) ); 

					
public class ch09_Calendar {

	public static void main(String[] args) {
		// Calendar 객체는 생성하면 기본적으로 현재날짜와 시간으로 설정된다.
		Calendar today = Calendar.getInstance();
		System.out.println("올해의 년도는? " + today.get(Calendar.YEAR) + "년");
		System.out.println("몇월(0~11, 0:1월)? " + today.get(Calendar.MONTH));
		//	System.out.println("현재 몇월? : " + today.get(Calendar.MONTH)+ 1 + "월");
		//	이렇게 1을 추가하면 헷갈리지 않고 월을 알 수 있다!
		
		System.out.println("올해의 몇째주? " + today.get(Calendar.WEEK_OF_YEAR)); 
		System.out.println("이번 달의 몇째주? " + today.get(Calendar.WEEK_OF_MONTH));
		
		// DATE와 DAY_OF_MONTH는 같음
		System.out.println("현재 몇일? " + today.get(Calendar.DATE));
		System.out.println("이번달 몇일? " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 몇일?" + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK)); // 1:일요일, 2:월요일, ... 7:토요일
		System.out.println("이번달의 몇째 요일: "+ today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후): "+ today.get(Calendar.AM_PM));
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59): " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));
		
		//		천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60분 * 60초)
		System.out.println("TimeZone(-12~+12): " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000))+"시간 차이"); 
		
		// 이번 달의 마지막 날 찾기
		System.out.println("이번 달의 마지막날: " + today.getActualMaximum(Calendar.DATE) ); 
		
	}

}
