package com.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonEventTest implements ActionListener{

	JFrame f;
	JButton ok, cancel;
	Container c;
	
	public ButtonEventTest() {
		//화면 구성...
		f = new JFrame("swing test");
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		
		//감시자 등록
		ok.addActionListener(this);
		cancel.addActionListener(this);

		f.setLayout(new FlowLayout()); // 배치 관리자 지정. FlowLayout--> 왼족 상단에서부터 오른쪽으로 붙어나감
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 클릭시 동작 지정.
		
		c = f.getContentPane();
		c.add(ok);
		c.add(cancel);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEventTest();
	}

	// actionPerformed(): 사건이 발생했을 때 감시자가 실행할 내용이 들어 있는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == ok) {
			System.out.println("ok : " +ok.getActionCommand());
			c.setBackground(Color.YELLOW);
		}else {
			System.out.println("cancel : " + cancel.getActionCommand());
			System.exit(0);
		}
	}
}
