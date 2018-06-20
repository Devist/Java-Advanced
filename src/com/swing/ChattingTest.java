package com.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChattingTest implements ActionListener{

	JFrame f;
	JLabel text;	//화면에서의 문자열
	JTextField tf;	//한줄 입력칸
	JTextArea ta;	//여러줄 입력칸
	
	public ChattingTest() {
		//화면 구성...
		f = new JFrame("swing test");
		text = new JLabel("Cute Chat",JLabel.CENTER);
		Font font = new Font("consolas",Font.BOLD,20);
		text.setFont(font);
		
		tf = new JTextField(20);
		ta = new JTextArea(8,20); // 세로로 8줄, 가로로 20글자 정도 크기의 입력 칸이 생성
		
		//JTextArea, JTable, JList --> 반드시 JScrollPane위에 얹어서 화면에 붙여야 함
		JScrollPane pane = new JScrollPane(ta); // scrollbar가 붙어 있는 컴포넌트
		
		f.setLayout(new BorderLayout()); // 배치 관리자 지정. FlowLayout--> 왼족 상단에서부터 오른쪽으로 붙어나감
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 클릭시 동작 지정.
		
		Container c = f.getContentPane();
		c.add(text, "North");
		c.add(tf,"South");
		c.add(pane,"Center");
		
		f.setSize(500, 500);
		f.setVisible(true);
		
		ta.setEditable(false);
		tf.requestFocus();
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		new ChattingTest();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 감시자가 할 작업 내용
		// 1. tf에 입력한 내용 알아내기
		String message = tf.getText();
		
		// 2. 알아낸 내용을 ta에 붙이기
		ta.append(message+ "\n");
		
		// 3. tf의 내용 지우기
		tf.setText(null);
		
		
	}

}
