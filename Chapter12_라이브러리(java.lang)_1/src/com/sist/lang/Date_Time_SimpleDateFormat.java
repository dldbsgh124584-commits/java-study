package com.sist.lang;
// Data => 현재 날짜 읽어온다 => 제어 (Calendar)
// 534p
import java.util.*;
import java.text.SimpleDateFormat;
public class Date_Time_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-DD hh:mm:ss"); 
        System.out.println(sdf.format(date));
         
        
        /*
         *   년도 => yy/ yyyy
         *   월 => MM / M ==> 03 /3  *** 월은 대문자로 
         *   일 => dd /d 
         *   
         *   시간 => hh / h
         *   분 => mm / m
         *   초 => s / ss 
         * 
         */
	}

}
