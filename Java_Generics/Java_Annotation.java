// 애너테이션(Annotation)	: 주석처럼 프로그래밍 언어에 영향을 미치지 않으며, 유용한 정보를 제공
//	
// 표준 애너테이션 : Java에서 제공하는 애너테이션
//
// @OVerride 	: 오버라이딩을 올바르게 했는지 컴파일러가 체크하게 한다.
//			 	: 오버라이딩할 때 메서드이름을 잘못적는 실수를 하는 경우가 많다.
//			 	: 오버라이딩할 때는 메서드 선언부 앞에 @Override를 붙이자!
//
// @Deprecated	: 앞으로 사용하지 않을 것을 권장하는 필드나 메서드에 붙인다. 
// 				: ‘©Deprecated’가 붙은 대상을 사용하는 코드를 작성하면, 컴파일할 때 아래와 같은 메시지가 나타남
//					=>	Note:  AnnotationEx2.java  uses  or  overrides  a  deprecated API. 
//						Note:  Recompile  with  -Xlint:deprecation  for  details.
//						해당 소스파일이 ‘deprecated’된 대상을 사용하고 있으며, 
//						‘-Xlint：deprecation’옵션을 붙인 후 컴파일하면 자세한 내용 확인 가능
//
// @FunctionalInterface	: 함수형 인터페이스에 붙이면, 컴파일러가 올바르게 작성했는지 체크
//						: 함수형 인터페이스에는 하나의 추상메서드만 가져야 한다는 제약이 있음
//
// @SuppressWarinings	: 컴파일러의 경고메시지가 나타나지 않게 억제
//						: 괄혼()안에 억제하고자하는 경고의 종류를 문자열로 지정
// 							=> @SuppressWarnings ("xinchecked")		// 지네릭스와 관련된 경고를 억제 
//								ArrayList list = new ArrayList ();	// 지네릭 E|■입을 지정하！■지 *t음. 
//								list .add (obj); 					// 여기서 경고가 발생
//
//						: 두개 이상의 경고를 동시에  억제하려면 아래와 같이 한다. 
//						: 배열에서처럼  괄호{}를 추가로 사용해야함
//							=> @SuppressWarnings({"deprecation",   "unchecked",   "varargs"})
//						
//						: -Xlint옵션으로 컴파일하면 경고메시지 확인 가능, 대괄히[] 안에 있는 것이 바로 메시지의 종류

public class Java_Annotation {
		
		public static void main(String[] args) {
			
	}

}

