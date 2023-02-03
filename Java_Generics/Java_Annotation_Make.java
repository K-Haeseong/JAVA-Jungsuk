import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// < 애너테이션 타입 정의하기 >
//
// 1. 애너테이션을 직접 만들어 쓸 수 있다.
//	=>  @interface 애너테이션이름 {
//			타입 요소이름();	// 애너테이션 요소를 선언
//			...
//		}
//
// 2. 애너테이션의 메서드는 추상 메서드이며, 애너테이션을 적용할 때 지정(순서X)
// 3. 적용시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정 가능(null은 제외)
// 4. 요소가 하나이고 이름이 value일 때는 요소의 이름 생략가능
// 5. 요소의 타입이 배열인 경우, 괄호{}를 사용해야 한다.
//	* 1개일 경우는 괄호{}생략가능
//	* 값이 없을 때는 비어 있는 괄호{} 반드시 넣어야함



// < 모든 애너테이션의 조상 - java.lang.annotation.Annotation >
//	1. Annotation은 모든 애너테이션의 조상이지만 상속은 불가
//	2. 사실 Annotation은 인터페이스
//	* Annotation 속에 존재 하는 추상메서드들은 구현 X, but 사용가능


// < 마커 애너테이션 - Marker Annotation >
//	1. 요소가 하나도 정의되지 않은 애너테이션 - @Test / @Override : 줄 값은 없지만 충분한 정보 제공


// < 애너테이션 요소의 규칙>
//	* 애너테이션의 요소를 선언할 때 아래의 규칙을 반드시 지켜야 한다.
//	1. 요소의 타입은 기본형, String, enum, 애너테이션, Class만 허용됨
//	2. 괄호()안에 매개변수를 선언할 수 없다.
//	3. 예외를 선언할 수 없다.
//	4. 요소를 타입 매개변수로 정의할 수 없다.


@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class Java_Annotation_Make {
		
		public static void main(String[] args) {
			
			// Ex12_8의 Class객체를 얻는다.
			Class<Java_Annotation_Make> cls = Java_Annotation_Make.class;

			TestInfo anno = cls.getAnnotation(TestInfo.class);
			System.out.println("anno.testedBy()="+anno.testedBy());
			System.out.println("anno.testDate().yymmdd()=" +anno.testDate().yymmdd());
			System.out.println("anno.testDate().hhmmss()=" +anno.testDate().hhmmss());

			for(String str : anno.testTools())
				System.out.println("testTools="+str);

			System.out.println();

			// Ex12_8에 적용된 모든 애너테이션을 가져온다.
			Annotation[] annoArr = cls.getAnnotations();

			for(Annotation a : annoArr)
				System.out.println(a);
	}

}


@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정 
@interface TestInfo {
	int       count()	  	default 1;
	String    testedBy();
	String[]  testTools() 	default "JUnit";
	TestType  testType()    default TestType.FIRST;
	DateTime  testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }

