package com.io;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class NotePad3 implements ActionListener {
	JFileChooser fc;//***

	JFrame frame;
	JButton open, save;
	
    JTextArea output;
    JScrollPane scrollPane;
   

    public void makeGUI() {
    	frame = new JFrame("MenuLookDemo");	//â
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ݱ��ư ������ �� ���α׷� ����
    	
    	fc = new JFileChooser(); //���� ���ñ�
        
        JPanel menuPane = new JPanel(new FlowLayout());
        JPanel contentPane = new JPanel(new BorderLayout());
        open = new JButton("open");
        save = new JButton("save");
        
        open.addActionListener(this);	//��� �߻��� ���� �����ڸ� �ٿ����� �κ�
        save.addActionListener(this);	//��� �߻��� ���� �����ڸ� �ٿ����� �κ�
        
        menuPane.add(open);
        menuPane.add(save);
       
        //Create a scrolled text area.
        output = new JTextArea(5, 30);
        scrollPane = new JScrollPane(output);       
        contentPane.add(menuPane, BorderLayout.NORTH);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        frame.setContentPane(contentPane);
        
        frame.setSize(850, 600);
        frame.setVisible(true); 
    }    

    public static void main(String[] args) {
    	//JFrame.setDefaultLookAndFeelDecorated(true);	//�ܼ��� �������.
        NotePad3 demo = new NotePad3();
		demo.makeGUI();
		                
    }

    //EVENT, EXCEPTION ó��
    //��� �߻��� ó���� �۾� ������ �ִ� �޼ҵ�(callback method.�ݹ� �޼ҵ�:����ڰ� ���� ȣ�� X, Ư�� ������ �Ǹ� �ڵ����� ȣ���).
    //open ��ư�̳� save ��ư�̳� �� ����� ����
    @Override
	public void actionPerformed(ActionEvent e) {
		try {
			Object o = e.getSource();	//����� �߻��� ����� �˾Ƴ�
			if(o == open){//�ҷ�����
				int returnVal = fc.showOpenDialog(frame);
	
	            if (returnVal == JFileChooser.APPROVE_OPTION) { //�����ư Ŭ����
	            	
	            	output.setText("");//���� �ߺ��� �ʱ�ȭ
	            	
	                File file = fc.getSelectedFile();//�������� �˾Ƴ���
	                String name = file.getName();
	                frame.setTitle(name);
	                
	                //=============Start ���� ���� �ҷ�����
	        		FileReader fr = new FileReader(file);		//����->�б�� ������
	        		BufferedReader br = new BufferedReader(fr);
	        		
	        		for(String msg; (msg = br.readLine()) !=null;) {
	        			System.out.println(msg);
	        			output.append(msg+"\n");
	        		}
	        		
	        		br.close();
	        		fr.close();
	                //=============End ���� ���� �ҷ�����
	            }
		            
			}else if(o == save){//�����ϱ�
				int returnVal = fc.showSaveDialog(frame);
	
	            if (returnVal == JFileChooser.APPROVE_OPTION) { //�����ư Ŭ����
	                File file = fc.getSelectedFile();//�������� �˾Ƴ���	       

	                //=============Start ���Ͽ� ���� �����ϱ�
	        		FileWriter fw = new FileWriter(file);		//����� ������. �ϳ��� �����ϴ�. Node Stream
	        		BufferedWriter bw = new BufferedWriter(fw); //->�ٴ����� ���� ���Ͽ� ����ϴ� ������. Process Stream
	        		
	        		bw.write(output.getText());
	        		bw.close();
	        		fw.close();
	                //==============End ���Ͽ� ���� �����ϱ�
	            }
	            
			}
		}catch(Exception a) {
			a.printStackTrace();
		}
	
	}
	
}