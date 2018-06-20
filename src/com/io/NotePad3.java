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
    	frame = new JFrame("MenuLookDemo");	//창
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기버튼 눌렀을 때 프로그램 종료
    	
    	fc = new JFileChooser(); //파일 선택기
        
        JPanel menuPane = new JPanel(new FlowLayout());
        JPanel contentPane = new JPanel(new BorderLayout());
        open = new JButton("open");
        save = new JButton("save");
        
        open.addActionListener(this);	//사건 발생에 대한 감시자를 붙여놓는 부분
        save.addActionListener(this);	//사건 발생에 대한 감시자를 붙여놓는 부분
        
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
    	//JFrame.setDefaultLookAndFeelDecorated(true);	//단순히 룩앤필임.
        NotePad3 demo = new NotePad3();
		demo.makeGUI();
		                
    }

    //EVENT, EXCEPTION 처리
    //사건 발생시 처리할 작업 내용이 있는 메소드(callback method.콜백 메소드:사용자가 직접 호출 X, 특정 조건이 되면 자동으로 호출됨).
    //open 버튼이나 save 버튼이나 다 여기로 들어옴
    @Override
	public void actionPerformed(ActionEvent e) {
		try {
			Object o = e.getSource();	//사건이 발생한 대상을 알아냄
			if(o == open){//불러오기
				int returnVal = fc.showOpenDialog(frame);
	
	            if (returnVal == JFileChooser.APPROVE_OPTION) { //열기버튼 클릭시
	            	
	            	output.setText("");//열기 중복시 초기화
	            	
	                File file = fc.getSelectedFile();//선택파일 알아내기
	                String name = file.getName();
	                frame.setTitle(name);
	                
	                //=============Start 파일 내용 불러오기
	        		FileReader fr = new FileReader(file);		//파일->읽기용 파이프
	        		BufferedReader br = new BufferedReader(fr);
	        		
	        		for(String msg; (msg = br.readLine()) !=null;) {
	        			System.out.println(msg);
	        			output.append(msg+"\n");
	        		}
	        		
	        		br.close();
	        		fr.close();
	                //=============End 파일 내용 불러오기
	            }
		            
			}else if(o == save){//저장하기
				int returnVal = fc.showSaveDialog(frame);
	
	            if (returnVal == JFileChooser.APPROVE_OPTION) { //열기버튼 클릭시
	                File file = fc.getSelectedFile();//선택파일 알아내기	       

	                //=============Start 파일에 내용 저장하기
	        		FileWriter fw = new FileWriter(file);		//쓰기용 파이프. 하나씩 가능하다. Node Stream
	        		BufferedWriter bw = new BufferedWriter(fw); //->줄단위용 쓰기 위하여 사용하는 파이프. Process Stream
	        		
	        		bw.write(output.getText());
	        		bw.close();
	        		fw.close();
	                //==============End 파일에 내용 저장하기
	            }
	            
			}
		}catch(Exception a) {
			a.printStackTrace();
		}
	
	}
	
}