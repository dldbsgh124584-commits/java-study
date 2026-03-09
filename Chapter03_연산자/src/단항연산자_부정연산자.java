/*
 *   ++/-- ==> 정수형(byte,int,long,char)
 *   ! ==> boolean(논리형)
 *   !true => false
 *   !false=> true
 *   
 *   ==> 범위에 없는 값 / 예약이 없는 날 / 로그인이 안 된 사람 ...
 *   ==> 부정연산자
 *       !(score>=0 && score<=100) => 입력이 잘못된 경우
 *   ==> 턴
 *   
 */
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        boolean b=false;
        int i=0;
        while(i<10) {
        	b=!b;
        	if(b==true)
        		System.out.println("사용자");
        	else
        		System.out.println("컴퓨터");
        	i++;
        }}}
	


