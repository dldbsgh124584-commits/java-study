package com.sist.collection;
/*
 *         Collection (데이터 모아서 처리) => 관리를 쉽게 할 수 있게 하는 라이브러리
 *            |                          -------- 표준화
 *      ------------------------
 *      |            |          |
 *    List          Set        Map
 *    -----------------Iterator
 *    ---- ListIterator
 *    
 *    List : ArrayList / Vector
 *                       | 네트워크 저장 (게임에 주로)
 *           | 데이터베이스 연동
 *    Set : HashSet / TreeSet(검색 빨라서 쓰는 사람도 있음)
 *          | 쿠키 / 세션 
 *    Map : HasMap
 *          | 웹에서 주로 => 라이브러리 / 스프링 , 마이바티스  
 *   => 주요 메소드 : 웹
 *      List : add() / size() / get() / isEmpty()
 *             => for-each
 *      Set : add() / size() / isEmpty()
 *             => 출력하지 않는다 : 중복 제거
 *      Map : put() / size() / get() / isEmpty()
 *      
 *      Iterator : => hasNext() / next()
 *            => 출력 전용
 *      ListIterator : hasNext() / next()
 *            => List 출력
 *    => 반드시 제네릭을 이용해서 데이터형을 통일 
 *       <클래스형> (일반x)
 *       ------- 기본데이터형 : Wrapper   
 */

public class Collection_total_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
