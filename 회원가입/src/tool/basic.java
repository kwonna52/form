package tool;


import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class View extends JFrame{
	public View() {
		
	     setTitle("회원가입");  //프레임의 타이틀 지정
	     setSize(350,400);  
	     setDefaultCloseOperation(EXIT_ON_CLOSE); // 종료 이벤트
	     setLayout (new FlowLayout() );
	     
	    
	     
	     JPanel panel = new JPanel(); //panel 생성
	     JPanel pn1 = new JPanel(); //panel 생성
	     JPanel pn2 = new JPanel(); //panel 생성
	     JPanel pn3 = new JPanel(); //panel 생성
	     JPanel pn4 = new JPanel(new FlowLayout(FlowLayout.LEFT)); //panel 생성
	   
	     JLabel label = new JLabel("회원가입을 위해 아래 정보 기입해주세요");
	     JLabel ID = new JLabel("ID"); // ID 라벨
	     JLabel PW = new JLabel("pw"); // PW 라벨
	       
	     JTextField t1 = new JTextField(10); // ID 입력 필드
	     JPasswordField t2 = new JPasswordField(10); // PW 입력 필드
	     
	     t1.selectAll();   //아이디의 입력된 모든 문자열 선택가능
	     t2.selectAll();   //비밀번호의 입력된 모든 문자열 선택가능
	     t2.setEchoChar('*');  //비밀번호의 입력을 *모양으로 표시되도록 설정
	     t1.setText("");  	     
	     t2.setText(""); 
	     
	     
	     ButtonGroup sex = new ButtonGroup(); // 성별 그룹
	     JRadioButton rb1 = new JRadioButton("여자"); //성별 체크박스
	     JRadioButton rb2 = new JRadioButton("남자");
	     rb1.setSelected(true);
	 	
	     sex.add(rb1);
	     sex.add(rb2);

	     this.add(rb1);
	     this.add(rb2);
 
	     JButton b1 = new JButton("가입하기");
	     
	     
	     panel.add(label); //"회원가입을 위해 아래 정보 기입해주세요" 라벨
	     
	     pn1.add(ID); // ID 라벨과 필드
	     pn1.add(t1);
	     
	     pn2.add(PW); // pw 라벨과 필드
	     pn2.add(t2);
	     
	     pn4.add(rb1); // 여자? or 남자?
	     pn4.add(rb2);
	     
	     pn3.add(b1,"South"); // 가입하기 버튼
	     
	    
	     b1.addActionListener( new ActionListener(){
		    	
				public void actionPerformed(ActionEvent e) {
		    										
					String id = t1.getText().trim();
					String pw = t2.getText().trim();
		
					if (id.length()==0 || pw.length()==0) { //미입력시 로그인 실패 
		        		
						JOptionPane.showMessageDialog(null, " failed \n "
								+ "아이디 또는 비밀번호를 입력 해주세요 ");
		    		}
		    		else { //로그인 성공
		    			
		    			  JOptionPane.showMessageDialog(null, " Welcome \n"
		    					  + "회원가입을 축하합니다!");
		    			 
		    		}
		    	}
	     });
	     
	     
 	
	     add(panel); //패널을 프레임에 추가
	     add(pn1);
	     add(pn2);
	     add(pn4);
	     add(pn3);
	    
	     
	     setVisible(true);
	}
}
public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		View V = new View();
		 
	}

}


