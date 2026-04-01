package com.sist.lang;
// 포장 클래스 => 데이터형을 쉽게 다루기 위해서 만들어진 클래스
//               => 제네릭에서 사용이 가능하게 만든 클래스
// <클래스> : 데이터형 통일 <int> x , <Integer> o
/*
 *    기본형 : 클래스화 
 *    ------------
 *    byte => Byte
 *    short => Short
 *    int => Integer
 *    long => Long
 *    --------------
 *    문자형
 *     char => Character
 *    실수형
 *     float => Float
 *     double => Double
 *    논리
 *    boolean => Boolean
 *    문자배열
 *     char[] => String
 *     
 *    양쪽의 호환성
 *    ---------
 *    AutoBoxing / UnBoxing 
 *    
 *    Integer i=new Integer(10)
 *    -------------------------
 *    Integer i=10; // 클래스에 실제 값을 주입 => 오토박싱
 *    int ii=i; // 기본형에 클래스 객체 주입 => 언박싱
 * 
 */
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Integer i=10;
        Integer j=20;
        System.out.println(i+j);
        
        int k=10;
        int m=20;
        System.out.println(k+m);*/
        
        // 주요 메소드
        // => 웹 / 윈도우 => 넘어오는 모든 값 => String
        // String page=request.getPameter("page")
        // => 정수형으로 변경
        // => 네트워크 => 정수(x),문자열 전송
        //int page="1";
        /*
         * 
         *   값을 받는 경우 
         *   parseXxx()
         *    정수형 변환 : Integer.parseInt("10") => 10
         *    실수형 변환 : Double.parseDouble("10.5") => 10.5
         *    논리형 변환 : Boolean.parseBoolean("ture") => true 
         *    
         *   값을 전송하는 경우
         *    String.valueOf()
         *    
         *    
         */
		
		int a=10;
		// 2진법  => 반드시 기억	 앞에 0b 붙이면 됨	
		System.out.println(Integer.toBinaryString(a));
		System.out.println(0b1010);
		// 16진법	 => 0x 붙이면 됨
		System.out.println(Integer.toHexString(a));
		// 8진법 => 0 붙이면 됨 
		System.out.println(Integer.toOctalString(a));
	}

}
