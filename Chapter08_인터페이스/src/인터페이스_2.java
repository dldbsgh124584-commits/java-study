import java.awt.*;
import java.awt.event.*;
import javax.swing.*;             // extends 가 먼저 받아야 함 
public class 인터페이스_2 extends JFrame implements ActionListener{
    JButton north=new JButton("North");
   // JButton south=new JButton("south");
    JButton center=new JButton("Center");
    JButton east=new JButton("East");
    JButton west=new JButton("West");
    JTextField tf=new JTextField();  //입력창
    public 인터페이스_2()
    {
    	//화면 UI
    	add("North",north);// window추가
    	//add("South",south);
    	add("Center",center);
    	add("East",east);
    	add("West",west); 
    	add("South",tf);
    	
    	//윈도우 크기
    	setSize(350, 400);
    	setVisible(true);
    	
    	north.addActionListener(this);
    	//south.addActionListener(this);
    	center.addActionListener(this);
    	east.addActionListener(this);
    	west.addActionListener(this);
    	tf.addActionListener(this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 생성자 호출
		new 인터페이스_2();
	}
	@Override                   //액션이벤트 : 눌림버튼
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==north)//눌림 버튼이 어떤 거냐
		{
			JOptionPane.showMessageDialog(this, "North Button Click");
		}
//		else if(e.getSource()==south)
//		{
//			JOptionPane.showMessageDialog(this, "south Button Click");
//		}
		else if(e.getSource()==center)
		{
			JOptionPane.showMessageDialog(this, "center Button Click");
		}
		else if(e.getSource()==east)
		{
			JOptionPane.showMessageDialog(this, "east Button Click");
		}
		else if(e.getSource()==west)
		{
			JOptionPane.showMessageDialog(this, "west Button Click");
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText(); // 입력된 값
			if(msg.length()<1)
				return;
			JOptionPane.showMessageDialog(this, msg);
		}
	}

}
