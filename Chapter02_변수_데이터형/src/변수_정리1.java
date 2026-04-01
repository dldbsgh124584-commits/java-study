 // 출력 형식
/*  
 *   변수
 *    => 데이터형 => 미리 설정
         정수 : int , long
         실수 : double
         논리 : boolean
         문자열 : String
         문자 : char
 *    => 선언 방식
 *       선언과 동시에 초기값 데이터형 변수명= 값
 *       선언만 데이터형 변수;
 *    => 초기값
 *       입력 / 윈도우 / 랜덤 / 명시적
 *    => 연산처리
 *       ------ 산술 / 단항 / 논리 / 비교 / 대입
 *                                      | = += -= *= op=
 *                                | == != < > <= >=
 *                           | && , ||                           
 *                     |++ , --
 *                     |형변환
 *                     |부정 연산자              
 *               | + - * % 
 *               | & | ^
 *               | << >>
        제어문
 *     ----- 조건문 / 반복문 / 선택문 / 반복제어문
 *    => 화면 출력
 *     System.out.print() => 가로 출력(inline)
 *     System.out.println() => 세로 출력(block)
 *     System.out.printf() => 서식이 있는 경우
 *     ------------------------------------------
 *     묶기 시작 : 명령어 묶기 : 메소드
 *               데이터 여러개 묶기 : 클래스 => ~VO , ~DTO
 *               --------------------- 클래스 ~DAO , ~Service
 *  
 */
public class 변수_정리1 {
	
	public static void main(String[] args) {
//		System.out.print("국어 영어 수학\n");
//		System.out.print("80  80  80\\n");
//		System.out.print("80  80  80\\n");
//		System.out.print("80  80  80\\n");
//		System.out.print("80  80  80\\n");
//		System.out.print("80  80  80\\n");
		
		
		System.out.printf("%-3d%-3d%-3d\n",90,90,90); // %d => 정수값 %s => 문자열 , %c => 문자 , %f => 실수
		System.out.println(10/3.0);
		System.out.printf("%.2f\n",10/3.0);
	
	}

}
