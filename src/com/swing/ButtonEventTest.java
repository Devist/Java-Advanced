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
		//ȭ�� ����...
		f = new JFrame("swing test");
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");

		f.setLayout(new FlowLayout()); // ��ġ ������ ����. FlowLayout--> ���� ��ܿ������� ���������� �پ��
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư Ŭ���� ���� ����.
		
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
