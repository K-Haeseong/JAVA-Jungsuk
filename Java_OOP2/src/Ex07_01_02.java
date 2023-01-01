// 상속관계

class Tv {
	boolean power; 	// 전원
	int channel;	// 채널
	
	void power() { power =! power; } 	// 전원 (on/off)
	void channelUp() { ++channel; }		// 채널 올리기
	void channelDown() { --channel; }	// 채널 내리기
	
}

class SmartTv extends Tv {
	boolean caption;					// 캡션 (on/off)
	void displayCaption(String text) {
		if (caption) {					// 캡션 (on-true일때) text 보여주기
			System.out.println(text);
		}
	}
}
	
public class Ex07_01_02 {

	public static void main(String[] args) {
		
		SmartTv stv = new SmartTv();
		stv.channel = 76;	// 상속 받은 멤버
		stv.channelUp();	// 상속 받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Do you see it?"); // 캡션 꺼져 있어서 보이지 않음
		stv.caption = true;
		stv.displayCaption("Weclome");
		
	}

}
