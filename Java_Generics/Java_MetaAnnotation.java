// 메타 애너테이션	: 메타 애너테이션은 '애너테이션을 위한 애너테이션 => 애너테이션 만들때 사용
//			: java.lang.annotation패키지에 포함

// @Target	: 애너테이션이 적용가능한 대상을 지정하는데 사용한다.
// @Documented 	: 애너테이션 정보가 javadoc으로 작성된 문서에 포함되게 한다.
// @Inherited	: 애너테이션이 자손 클래스에 상속되도록 한다.
// @Retention	: 애너테이션이 유지되는 기간를 지정하는데 사용한다.
//		: 컴파일러에 의해 사용되는 애너테이션의 유지 정책은 SOURCE(소스파일에만 존재O, 클래스파일 존재X
//		: 실행시에 사용 가능한 애너테이션의 정책은 RUNTIME(클래스파일 존재O, 실행시에 사용가능)
// @Repeatable	: 애너테이션을 반복해서 적용할 수 있게 한다.(JDK 1.8)
//		: @Repeatable이 붙은 애너테이션은 반복해서 붙일 수 있다.
//		: @Repeatable을 하나로 묶을 컨테이너 애너테이션도 정의해야함


public class Java_MetaAnnotation {
		
		public static void main(String[] args) {
			
	}

}

