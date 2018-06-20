package com.swing;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingTest2 {

	JFrame f;
	JButton ok, cancel;
	JTextField tf;
	JTextArea ta;
	
	public SwingTest2() {
		//화면 구성...
		f = new JFrame("swing test");
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		tf = new JTextField(20);
		ta = new JTextArea(8,20); // 세로로 8줄, 가로로 20글자 정도 크기의 입력 칸이 생성
		
		//JTextArea, JTable, JList --> 반드시 JScrollPane위에 얹어서 화면에 붙여야 함
		JScrollPane pane = new JScrollPane(ta); // scrollbar가 붙어 있는 컴포넌트
		
		// 배치 관리자 지정. BorderLayout--> 화면을 동,서,남,북,중앙으로 나눠서 사용
		f.setLayout(new GridLayout(2,2)); 
		
		// 닫기버튼 클릭시 동작 지정.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		//화면 구성요소들을 붙일 ContentPane을 알아냄
		Container c = f.getContentPane();
		
		c.add(ok, "East");
		c.add(cancel, "West");
		c.add(tf,"South");
		c.add(pane,"Center");
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingTest2();
	}

}
