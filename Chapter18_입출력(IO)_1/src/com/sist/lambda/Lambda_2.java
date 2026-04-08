package com.sist.lambda;
import java.util.*;
import javax.swing.*;
// null 대신 사용 : Optional => map , filter
// orElse("이미지없음.jpg") / ifPresent
// Optional + stream(데이터가 여러개인 경우)
public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input=JOptionPane.showInputDialog("이름 입력:");
       // System.out.println(input);  확인 : "" / 취소 : null
      /*  String result=Optional.ofNullable(input)
        		.filter(s->s.length()>3)
        		.map(s->s.toUpperCase())
        		.orElse("입력값 없음");*/
        if(input!=null)  // null을 비교시에는 == 
        {
        	if(input.length()>3)
        	{
        		input=input.toUpperCase();
        		System.out.println(input);
        	}
        	else
        	{
        		System.out.println(input);
        	}
        }
        else
        {
        	System.out.println("입력값 없음");
        }
       
	}

}
