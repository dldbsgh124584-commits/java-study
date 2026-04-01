/*
 *    41 페이지
 *    정수 타입
 *   -----------------------------
 *    정수
 *      byte => 1byte (네트워크,파일 읽기)
 *      int  => 4byte (일반 숫자에 주로 사용) = 프로그램에서 가장 많이 사용
 *      long => 8byte (주로 시간,날짜)
 *   -----------------------------
 *    문자
 *   -----------------------------
 *    논리
 *   ----------------------------- 
 * 
 */  import java.util.Random;

import javax.swing.*; // java (1.0) / javax (1.2)

 public class 변수_정리 {
  public static void main(String[] args){
	  // TODO Auto-generated method stub
	  
	  
	 /*
	  *  변수 선언
	  *  변수= 초기값
	  *       ---- 명시적
	  *       ---- 입력값
	  *       ---- 랜덤
	  *            Math.random()
	  *            ------------
	  *             (int)(0.0 ~ 0.99) => 0~99 + 1
	  *       ---- 외부에서 데이터 일기
	  *       ---- 윈도우
	  *            JOptionPane.showInputDialog()
	  *  String name="홍길동"      
	  * 
	  */
	  
	 // String name=JOptionPane.showInputDialog("이름 입력:");
	 // System.out.println(name);
//	  int kor=(int)(Math.random()*101);
//	  int eng=(int)(Math.random()*101);
//	  int math=(int)(Math.random()*101);
//	  
//	  System.out.println("국어:"+kor);
//	  System.out.println("영어:"+eng);
//	  System.out.println("수학:"+math);
//	
	  Random r=new Random();
	  int kor=r.nextInt(101);
	  int eng=r.nextInt(101);
	  int math=r.nextInt(101);
	  System.out.println("국어:"+kor);
	  System.out.println("영어:"+eng);
	  System.out.println("수학:"+math);
	  
  } 
 }



