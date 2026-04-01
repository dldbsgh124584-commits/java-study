package com.sist.main;
//295p
/*    기본
 *    ---------------------------------- 면접 
 *     클래스 : 설계 => 요구사항 분석
 *     객체 : 결과물
 *     캡슗화 : 감춘다 => 노출
 *            private => 메소드
 *     상속 : 공유
 *     다형성 : 상황별로 다르게 구현
 *     추상클래스 : 절반만 완성 설계도 => 미완성된 설계도
 *               => 개발자가 완성 시켜야 함
 *     인터페이스 : 표준화 작업 => 규칙
 *     내부클래스 : 공통변수 / 공통 메소드
 *     ----------------- 쉽게 유지보수 목적
 *                           ------ 추가 / 수정 / 재사용
 *     => 권장이다 문법사항은 아니다
 *     => OOP에 연연할 필요가 없다
 *     
 *     -----------------------------------------------
 *     
 *     5장 : 클래스 구조
 *     6장 : 객체지향 특성 : 캡슐화 => getter/setter
 *     7장 : 재사용 : 상속 / 포함
 *           => 추가 / 수정 => 다형성
 *     8장 : 클래스의 종류
 *          추상클래스 / 인터페이스
 *     9장 : 내부클래스
 *     10장: 라이브러리 => 모듈화
 *     11장: 견고한 프로그램 : 예외처리
 *     -----------------------------------------1권
 *     2권 => 라이브러리
 *     java.lang / java.util / java.io / java.net / java.sql
 *     ---------------------     파일       네트워크     데이터베이스
 *     
 *     => 40% - 라이브러리 50% - 사용자정의 클래스 10% - 조립
 *     
 *     ***=> Back-End : 자바 , JSP , Spring , DataBase
 *     => Front-End : 자바스크립트 => Jquery , Ajax , Vue , Pinia , React , Redux , TanStack-Query , TypeScript , NodeJs
 *     => 아키텍쳐 : 설계 => 문서 , UML , ERD
 *     ***=> SE : CI/CD
 *             리눅스 , AWS , Docker , Jenkins
 *             
 *     
 *     1. 118page : 클래스 구조
 *        [접근지정어] [제어자] class ClassName
 *                  ------
 *                  static : 공통으로 사용
 *                  final : 종단 => 상속을 내릴 수 없다 (고정)
 *                   => 라이브러리 : String , System , Math
 *                                => 제공한 기능을 그대로 사용 
 *                  abstract : 추상 => 미완성 
 *        --------- public / protected / default / private
 *                  ------               -------
 *                 다른클래스와 연결 => public
 *                 
 *        {
 *        
 *                ----------------------------
 *                1. 변수
 *                   => 데이터 보호 => private
 *                   => 접근이 가능 => public getter/setter
 *                   => 인스턴스 변수
 *                   => 공통변수(정적변수) => 극히 드물다
 *                   => 캡슐화
 *                ----------------------------
 *                2. 초기화 => 시작과 동시 처리되는 기능
 *                   인스턴스블록 => 특별한 경우가 아니면 거의 사용빈도가 없다
 *                   static 블록 => 메모리 할당 없이 자동 처리
 *                      => static변수일 경우
 *                   생성자 => 인스턴스 초기화
 *                   ---- 접근지정어 : public 많이 씀
 *                   ---- 클래스명과 동일
 *                   ---- 여러개 나오는 경우도 있다 : 오버로딩
 *                        -------------
 *                        | => 초기화를 다르게 만드는 경우
 *                   ---- 클래스를 메모리에 저장할 때 주로 사용
 *                   ---- 호출 : new 생성자()
 *                   ---- 생성자 리턴형이 없다
 *                   ---- ** new를 사용하면 다른 메모리가 생성된다   
 *                ----------------------------
 *                3. 메소드 : 변수를 활용
 *                   ---- 다른 클래스와 통신 : public 
 *                   ---- 한가지 기능만 수행
 *                   ---- 여러개 명령어로 처리 => 관련된 명령어의 집합
 *                        --------- {}
 *                   ---- 구성 
 *                   public 리턴형 메소드명(매개변수)    리턴형 : 처리결과값,반드시1개,클래스/배열  매개변수 : 사용자가 보내준 값(0이상)
 *                   {
 *                      구현
 *                      return 값;  => 값이 없는 경우 void - return 생략이 가능
 *                   }
 *                   --- 메소드 호출시마다 처음부터 return이 있는 곳까지 수행
 *                   --- 종료 => 호출위치 돌아간다
 *                   --- 다형성
 *                       => 기능 추가 : 오버로딩
 *                       => 기능 수정 : 오버라이딩 
 *                ----------------------------
 *                ** 변수 : private / 메소드,클래스,인터페이스 => public
 *                ** 변수
 *                   기본형 / 클래스 / 배열
 *                          ----------- 주소 참조 => 참조형
 *                   ------------------ 변수 
 *                ** MethodArea / Heap
 *                   | 메모리 1개생성   | => new 마다 따로 생성
 *                     => static 변수   => 클래스에 등록 변수
 *              
 *                              
 *              class A
 *              {
 *                 int a,b;
 *                 public void aaa(){}
 *                 public void bbb(){}
 *              }
 *              
 *              A aa=new A();
 *              
 *              ---aa---
 *              연결할 주소
 *              0x100 => new => int => malloc(A)
 *              => 주소는 int를 넘어가지 못 한다 
 *              --------     0x100---a---- ==> aa.a 
 *                                   0
 *                                ---b---- ==> aa.b
 *                                   0
 *                                -------- ==> aa.aaa()
 *                                  aaa()
 *                                -------- ==> aa.bbb()
 *                                  bbb()
 *                                --------
 *                           * 자신에게 할당된 메모리 주소에만 연결 가능
 *                           * 상속 => 메모리 두개 => 두개를 연결할 수 있게
 *                                    -------- this / super
 *  
 *        오버라이딩
 *          => 상속받은 메소드를 변경해서 사용
 *          => 메소드의 형태가 동일
 *             접근지정어 : 확대가 가능 
 *             리턴형
 *             메소드명
 *             매개변수
 *             ------ 동일해야 된다 
 */
class Super
{
	int a,b;
	public Super()
	{
		a=100;
		b=200;
		System.out.println("Super.a="+a);
		System.out.println("Super.b="+b);
	}
	public void disp()
	{
		System.out.println("Super.disp() Call...");
	}
}
class Sub extends Super
{
	public Sub()
	{
		this.a=1000;
		this.b=2000;
		System.out.println("Super.a="+super.a);
		System.out.println("Super.b="+super.b);
		System.out.println("this.a="+this.a);
		System.out.println("this.b="+this.b);
	}
	public void disp()
	{
		System.out.println("Sub.disp() Call...");
	}
	  // a,b 값이 내려온 게 아니라 int a,b 를 쓸 수 있는 메모리가 생성 
}
public class 다형성_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Sub sub=new Sub();
          sub.disp();
          
          Super su=new Sub();// 자동 형변환
          su.disp();
          // *** 상속 => 상위>하위 
          // 상위 = 하위 ==> 변수(상위) 메소드(하위)
          // 상위클래스는 하위클래스의 변수/메소드를 사용할 수 없다
          
	}
}
