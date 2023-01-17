import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Stack & Queue

//	스택(Stack)	: LIFO(Last In First Out)구조, 마지막에 저장된 것을 제일 먼저 꺼낸다.
//				: 저장(push)	/	추출(pop)
//				: Stack은 클래스
//
//	큐(Queue)	: FIFO(First In First Out)구조, 제일 먼저 저장한 것을 제일 먼저 꺼낸다.
//				: 저장(offer)	/	추출(poll)
//				: Queue는 인터페이스
//				: 1. Queue를 직접 구현한다.
//				: 2. Queue를 구현한 클래스를 사용한다.		



public class Ch11_Stack_Queue {

	public static void main(String[] args) {
		
		Stack sk = new Stack();
		Queue qe = new LinkedList();	// Queue가 인터페이스 이므로 구현한 링크드리스트 생성
		
		sk.push("0");
		sk.push("1");
		sk.push("2");
	
		qe.offer("0");
		qe.offer("1");
		qe.offer("2");
	
		
		// 스택에서 요소 하나씩 추출하기
		System.out.println("= Stack =");
		while(!sk.empty()) {			
			System.out.println(sk.pop());
		}
		System.out.println();
		
		// 큐에서 요소 하나씩 추출하기
		System.out.println("= Queue =");
		while(!qe.isEmpty()) {
			System.out.println(qe.poll());
		}

	}

}
