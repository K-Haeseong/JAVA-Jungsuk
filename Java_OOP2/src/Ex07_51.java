// <익명 클래스>

// 익명 클래스 : 이름이 없는 일회용 클래스. 정의와 생성을 동시에 

import java.awt.*;
import java.awt.event.*;

class Ex07_51 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		// 주석 처리 되어 있는 부분 익명클래스로 만들
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("ActionEvent occurred!!!");
				}
		});
	}
}



//class EventHandler implements ActionListener {
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent occurred!!!");
//	}
//}
