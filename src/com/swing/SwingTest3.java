package com.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingTest3 {

	JFrame f;
	JButton ok, cancel;
	JTextField tf;
	JTextArea ta;
	
	public SwingTest3() {
		//ȭ�� ����...
		f = new JFrame("swing test");
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		tf = new JTextField(20);
		ta = new JTextArea(8,20); // ���η� 8��, ���η� 20���� ���� ũ���� �Է� ĭ�� ����
		
		//JTextArea, JTable, JList --> �ݵ�� JScrollPane���� �� ȭ�鿡 �ٿ��� ��
		JScrollPane pane = new JScrollPane(ta); // scrollbar�� �پ� �ִ� ������Ʈ
		
		f.setLayout(new FlowLayout()); // ��ġ ������ ����. FlowLayout--> ���� ��ܿ������� ���������� �پ��
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư Ŭ���� ���� ����.
		
		Container c = f.getContentPane();
		c.add(ok);
		c.add(cancel);
		c.add(tf);
		c.add(pane);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingTest3();
	}

}
