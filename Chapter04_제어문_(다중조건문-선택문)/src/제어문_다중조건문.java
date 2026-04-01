/*
 *  1. 기본 문법 : 변수,데이터형,연산자,제어문
 *  2. 프로그램 제어 => 관련된 명령문,변수 묶기
 *                  ---------- -------
 *                     |메소드     |배열/클래스
 *  3. 데이터 보호 / 재사용 / 수정 쉽게 / 추가 기능
 *       |캡슐화    |상속/포함 |오버라이딩   |오버로딩
 *  4. 설계 : 인터페이스
 *  -----------------------------------------
 *  5. 프로그램이 비정상 종료 방지 / 미리 에러에 대한 처리 => 예외처리
 *  6. 라이브러리 (자바 제공)
 *  --------------------------------------- 
 *  최종 : 네트워크 / 데이터베이스 
 *                ---------
 *  제어문 : 다중 조건문 => 일반 프로그램에서는 많이 사용
 *                      ---------
 *                      1. 화면 => 메뉴 클릭시
 *                      2. 성적 처리
 *                      3. 계산기 => 금융계산기
 *                      웹에서 가끔 사용
 *                      ------------ 부메뉴가 있는 경우
 *  1) 형식
 *        if(조건문)
 *        {
 *          조건문 true면 실행하는 명령문======> 종료
 *          조건이 false면
 *                |======> 다음 조건으로 이동
 *        }
 *        else if(조건문)
 *        {
 *          조건문 true면 실행하는 명령문 
 *        }
 *        else if(조건문)
 *        {
 *          조건문 true면 실행하는 명령문 
 *        }
 *        else // 필요시에만 사용 => + , - , * , /
 *        {
 *          조건이 없는 경우
 *        }
 *        
 *        ==> 1개의 해당 조건만 수행
 *        
 *  2) 동작
 *        처음부터 시작 ==> 해당 조건을 찾는다
 *        => 해당 조건을 찾으면 문장을 실행학 종료        
 *  3) 처리 : 경우수가 여러개인 경우
 *           + , - , * , /
 *           enter / space ...  키보드값 처리
 *           메뉴가 여러개일때
 *  =====> 단순화 : switch~case
 *                -----------
 *                다중조건문 : 범위가 있는 경우 (웹은 범위 처리)
 *                          
 */
// 사직연산 처리 + , - , * , => 다른 연산 처리 else
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.입력받는 준비
        Scanner r=new Scanner(System.in);
        // System.in => 키보드 입력값 => 받아서 메모리에 저장하는 역할
        // => API => 자바에서 제공
        // 1.첫번째 숫자
         System.out.print("첫번째 정수입력:");
         int num=r.nextInt();
        // 2.연산자
         System.out.print("연산자 입력(+,-,*,/):");
         String op=r.next();
         // 자바에서 입력하는 모든 장치는 char(x) => String
         // scanner => 단점은 엔터/공백
         // aaa bbb ccc => enter => 결과값은 aaa => next()
         // => nextline()
         // => 웹/window => 입력창 
        // 3.두번째 숫자 ==> 저장 했다가 ==> 결과값 출력시 읽기
         System.out.print("두번째 정수입력:");
         int num1=r.nextInt();
         
         // 처리(연산처리)
         if(op.equals("+"))
         {
        	 System.out.printf("%d+%d=%d\n",num,num1,num+num1);
         }
         else if(op.equals("-"))
         
        	 System.out.printf("%d-%d=%d\n",num,num1,num-num1);
         
         else if(op.equals("*"))
         
        	 System.out.printf("%d*%d=%d\n",num,num1,num*num1);
         
         else if(op.equals("/"))
         {
        	 if(num1==0)
        		 System.out.println("0으로 나눌 수 없습니다");
        	 else
        	     System.out.printf("%d/%d=%d\n",num,num1,num/num1);
         }
         else
         
        	 System.out.println("연산자입력이 잘못되었습니다");
         
	}

}
