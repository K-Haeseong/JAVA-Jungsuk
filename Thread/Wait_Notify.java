import java.util.ArrayList;

// 동기화의 단점 : 데이터 보호가 되지만 한번에 한 쓰레드만 임계영역에 들어가야 하니 비효율적이다.
// 			 : 동기화의 효율을 높이기 위해 wait(), notify()를 사용

// wait()과 notify()	: 동기화의 효율을 높이기 위해 wait(), notify()를 사용
//					: Object클래스에 정의되어 있으며, 동기화 블록 내에서만 사용할 수 있다.
//
// wait()		: 객체의 lock을 풀고 쓰레드를 해당 객체의 waiting pool에 넣는다.
// notify()		: waiting pool에서 대기중인 쓰레드 중 하나를 깨운다.
// notifyAll()	: waiting pool에서 대기중인 모든 쓰레드를 깨운다.

// 코드와 개념 반복학습 필요
class Customer2 implements Runnable {
	private Table2 table;
	private String food;
	
	Customer2(Table2 table, String food) {
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try { Thread.sleep(100);} catch 
				(InterruptedException e ) {} 
			
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food + '.');
		}
	}
}

class Cook2 implements Runnable {
	private Table2 table;
	
	Cook2(Table2 table) {this.table = table; }
	
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			try { Thread.sleep(10);} catch(InterruptedException e) {}
		}
	}
}

class Table2 {
	String[] dishNames = { "donut", "donut", "burger"};
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting.");
			try {
				wait();
				Thread.sleep(500);
			} catch (InterruptedException e) {};
		}
		dishes.add(dish);
		notify();
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public void remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size()==0) {
				System.out.println(name+" is waiting.");
				try {
					wait();
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}
			
		while(true) {
			for (int i = 0; i < dishes.size(); i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return;
				}
			}
		
		try {
			System.out.println((name + " is waiting."));
			wait();
			Thread.sleep(500);
		} catch(InterruptedException e) {}
		}
	}
	
	}
	public int dishNum() { return dishNames.length; }
}



public class Wait_Notify {

	public static void main(String[] args) throws Exception {
		Table2 table = new Table2();
		
		new Thread(new Cook2(table), "COOK").start();
		new Thread(new Customer2(table, "donut"), "CUST1").start();
		new Thread(new Customer2(table, "burger"), "CUST2").start();
		Thread.sleep(2000);
		System.exit(0);
	}

}
