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
		//ȭ�� ����...
		f = new JFrame("swing test");
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		tf = new JTextField(20);
		ta = new JTextArea(8,20); // ���η� 8��, ���η� 20���� ���� ũ���� �Է� ĭ�� ����
		
		//JTextArea, JTable, JList --> �ݵ�� JScrollPane���� �� ȭ�鿡 �ٿ��� ��
		JScrollPane pane = new JScrollPane(ta); // scrollbar�� �پ� �ִ� ������Ʈ
		
		// ��ġ ������ ����. BorderLayout--> ȭ���� ��,��,��,��,�߾����� ������ ���
		f.setLayout(new GridLayout(2,2)); 
		
		// �ݱ��ư Ŭ���� ���� ����.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		//ȭ�� ������ҵ��� ���� ContentPane�� �˾Ƴ�
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
