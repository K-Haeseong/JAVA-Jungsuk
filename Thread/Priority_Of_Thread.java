// 쓰레드의 우선순위 (Priority_Of_Thread) 
// => 쓰레드는 우선순위(priority)라는 속성(멤버변수)을 가지고 있는데, 이 우선순위의 값에 따라 쓰레드가 얻는 실행시간이 달라진다.
//	  작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수 있다.
//	* 우선순위(1~10)는 보통 5로 지정되어있다.
//	* 하지만 우선순위를 정한다고 절대적으로 순위 변경되는 것이 아니라, 그저 OS스케줄러가 참고해서 진행 할 뿐이다. 

// void setPriority(int new Priority)	: 쓰레드의 우선순위를 지정한 값으로 변경한다.
// int getPriority()					: 쓰레드의 우선순위를 반환한다.


class Thread05 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
			for (int j = 0; j < 10000000; j++) {
			}
		}
	}
}

class Thread06 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
			for (int j = 0; j < 10000000; j++) {
			}
		}
	}
}



public class Priority_Of_Thread {

	public static void main(String[] args) {

		Thread05 t5 = new Thread05();
		Thread06 t6 = new Thread06();
		
		t5.setPriority(5);
		t6.setPriority(7);
		
		System.out.println("Priority_Of_Thread(-)" + t5.getPriority());
		System.out.println("Priority_Of_Thread(|)" + t6.getPriority());
		t5.start();
		t6.start();
	}

}

