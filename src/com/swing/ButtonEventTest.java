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
		//ȭ�� ����...
		f = new JFrame("swing test");
		
		ok = new JButton("ok");
		cancel = new JButton("cancel");
		
		//������ ���
		ok.addActionListener(this);
		cancel.addActionListener(this);

		f.setLayout(new FlowLayout()); // ��ġ ������ ����. FlowLayout--> ���� ��ܿ������� ���������� �پ��
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư Ŭ���� ���� ����.
		
		c = f.getContentPane();
		c.add(ok);
		c.add(cancel);
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonEventTest();
	}

	// actionPerformed(): ����� �߻����� �� �����ڰ� ������ ������ ��� �ִ� �޼ҵ�
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
