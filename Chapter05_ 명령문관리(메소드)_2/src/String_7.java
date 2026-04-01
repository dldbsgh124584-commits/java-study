/*
 *   trin() : 좌우의 공백 제거
 *     => 유효성 검사
 *     " Hello Java " -> "Hello Java" 좌우 끝의 공백만 제거 가운데는 x
 *   valueOf() : 모든 데이터형을 문자열로 변경
 *   valueOf(100) => "100"
 *   format()  => 형식을 변경
 *   -------- printf와 동일 
 *  
 */
import javax.swing.*;
public class String_7 extends JFrame{
	JTextField tf=new JTextField();
	public String_7()
	{
		add("North",tf);
		tf.setText(String.valueOf(10));
		// => static => 메모리에 저장하지 않고 사용
		setSize(300,350);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new String_7();
	}

}
