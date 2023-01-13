import java.util.Calendar;

public class  ch09_AddRoll_Test {
	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();

		date.set(2019, 7, 31);	// 20년 8월 31일
		
		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		
		// roll()은 다른 필드에 영향을 주지 않는다. => 일을 바꾼다고 월이나 년도에 영향을 주지 않는다
		System.out.println();
		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));

		System.out.println();
		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		

	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) +"월 " + date.get(Calendar.DATE) + "일";	
		

	}
}


