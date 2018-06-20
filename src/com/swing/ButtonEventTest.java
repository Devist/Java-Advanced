package com.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonEventTest {

	JFrame f;
	JButton ok, cancel;

	
	public ButtonEventTest() {
		//화면 구성...
		f = new JFrame("swing test");
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");

		f.setLayout(new FlowLayout()); // 배치 관리자 지정. FlowLayout--> 왼족 상단에서부터 오른쪽으로 붙어나감
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 클릭시 동작 지정.
		
		Container c = f.getContentPane();
		c.add(ok);
		c.add(cancel);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEventTest();
	}

}
