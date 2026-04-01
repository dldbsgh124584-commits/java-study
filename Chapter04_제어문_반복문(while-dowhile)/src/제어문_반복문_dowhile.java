import javax.swing.JOptionPane;
/*
 *  초기값
 *   => 지역변수(반드시 초기화)
 *      =Scanner
 *      =명시적 처리
 *      =JOptionPane
 *      =Random
 *  연산처리
 *  프로그램 제어
 *  결과값 출력
 */

public class 제어문_반복문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int i=1;
        while(i<=10)
        {
        	if(i==2)
        	    continue;
        	System.out.println(i);
        	i++;
        
        System.out.println("종료");*/
        	
        	int i=1;
        	do
        	{       		
        		System.out.print(i+" ");
        		i++;
        	}while(i<=10);
        	System.out.println();
        	char c='A';
        	do
        	{
        		System.out.print(c+" ");
        		c++;
        	}while(c<='Z');
        	System.out.println();
        	c='0';
        	do
        	{
        		System.out.print(c+" ");
        		c++;
        	}while(c<='9');
        	System.out.println();
        	String s=JOptionPane.showInputDialog("문자열 입력");
        	System.out.println("입력된 문자열:"+s);
        	// 글자수
        	System.out.println("글자수:"+s.length());
        	//A,a가 몇개인지 확인
        	int count=0;
        	i=0;
        	do
        	{
        		char d=s.charAt(i);
        		if(d=='A' || d=='a')
        			count++;
        		
        		i++;
        	}while(i<s.length());
        	
        	System.out.println("A,a는 총갯수:"+count);
        }
	}


