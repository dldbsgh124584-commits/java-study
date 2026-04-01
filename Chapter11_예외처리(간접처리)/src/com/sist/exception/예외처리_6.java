package com.sist.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *  String id,pwd,name,
 *  int age
 *  double ki
 *  ...==> class 
 * 
 */

public class 예외처리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // UnCheckedException
		// => NumberFormatException 
		// 웹/윈도우/모바일 => 서버 데이터 전송 / 브라우저 전송 받기
		// => 모든 데이터 문자열
		// ?no=10   String no=request.getParameter("no")
		// NullPointerException
		// => 500 
		//IllegalArgumentException // 매개변수값 다른경우 
		String image=null;
		try
		{
			System.out.println(image.length()); // image가 null값인데 길이가 없어서 오류가 난다 -> catch절로 이동
			System.out.println("Image를 브라우저에 출력");
		}
		catch(NullPointerException e)
		{
			System.out.println("이미지 없을을 보내라");
		}
		/*
		 *        String page=request.getParameter("page");
		 *        => 문제
		 *        => if(page==null)
		 *             page="1"; 
		 * 
		 */
	    
		
	}

}
