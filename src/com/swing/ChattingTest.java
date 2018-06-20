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
	JLabel text;	//ȭ�鿡���� ���ڿ�
	JTextField tf;	//���� �Է�ĭ
	JTextArea ta;	//������ �Է�ĭ
	
	public ChattingTest() {
		//ȭ�� ����...
		f = new JFrame("swing test");
		text = new JLabel("Cute Chat",JLabel.CENTER);
		Font font = new Font("consolas",Font.BOLD,20);
		text.setFont(font);
		
		tf = new JTextField(20);
		ta = new JTextArea(8,20); // ���η� 8��, ���η� 20���� ���� ũ���� �Է� ĭ�� ����
		
		//JTextArea, JTable, JList --> �ݵ�� JScrollPane���� �� ȭ�鿡 �ٿ��� ��
		JScrollPane pane = new JScrollPane(ta); // scrollbar�� �پ� �ִ� ������Ʈ
		
		f.setLayout(new BorderLayout()); // ��ġ ������ ����. FlowLayout--> ���� ��ܿ������� ���������� �پ��
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư Ŭ���� ���� ����.
		
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
		// �����ڰ� �� �۾� ����
		// 1. tf�� �Է��� ���� �˾Ƴ���
		String message = tf.getText();
		
		// 2. �˾Ƴ� ������ ta�� ���̱�
		ta.append(message+ "\n");
		
		// 3. tf�� ���� �����
		tf.setText(null);
		
		
	}

}
