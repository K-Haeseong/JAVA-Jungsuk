import java.util.EmptyStackException;
import java.util.Stack;

// 스택의 활용	: EX) 수식계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹브라우저의 뒤로/앞으로

// 큐의 활용		: EX) 최근사용문서, 인쇄작업 대기목록, 버퍼(buffer)

public class Ch11_StackQueue_Test {

	public static void main(String[] args) {
		
//		if(args.length !=1) {
//			System.out.println("Usage:java Ch11_StackQueue_Test \"EXPRESSION\"");	//	Usage = 사용법
//			System.out.println("Excapmle:Ch11_StackQueue_Test \"((2+3)*1)+3\"");
//			System.exit(0);	//	정상종료
//			System.exit(1);	//	비정상종료
//		}
		
		Stack st = new Stack();
//		String expression = "((3+5*8-2)";		// 예외
		String expression = "((3+5)*8-2)";
		
		System.out.println("expression : " + expression);
		
		try {
			for(int i=0; i< expression.length(); i++) {			//	범위를 ( <=)  이렇게 하면 안되나?
				char ch = expression.charAt(i);				// 	=> 안돼. 범위 벗어난다. expression의 범위 숫자로 바꿔 넣어보자.

				if(ch == '(') {
					st.push(ch+"");				//	: 왜 ""를 붙이지?	=> 지네릭스 타입인자와 관련 <String>
												// 	: stack에는 String만 들어가야하나? =>  위와 관련되어있음
				} else if(ch ==')') {
					st.pop();
				}
			}

			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}

		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.(예외)");
		}
		
	}

}
