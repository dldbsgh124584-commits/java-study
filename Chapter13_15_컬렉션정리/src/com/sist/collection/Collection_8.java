package com.sist.collection;
import java.util.*;
/*
 *    웹
 *      => ~ 예외처리 : 기본 문법
 *      => 라이브러리
 *         | java.lane
 *           => Object : toString(
 *           => String (********)
 *             StinrgBuffer => append
 *           => Math : ceil()
 *           => Wapper
 *              Integer,Double / Boolean
 *                |
 *             parseInd passDouble parseBoolean
 *         | java.util
 *           => StringTokenize
 *              => counterTokens , h
 *              
 *           => Random => newInt
 *           => Simpledateformat : 날자 변환
 *           => decimalformat : 숫자 변환
 *              => tolocalestring() => 자바스크립트
 *         | Collection
 *          List
 *            add / get /size  
 *         
 */
public class Collection_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> set=new TreeSet<>();
        set.add("apple");
        set.add("banana");
        set.add("grape");
        System.out.println(set.ceiling("blue"));
        System.out.println(set.floor("blue"));
        set.add("박문수");
        set.add("홍길동");
        set.add("심청이");
        set.add("춘향이");
        set.add("이순신");
        set.add("강감찬");
        set.add("김두한");
        set.add("이산");
        
        for(String name:set)
        {
        	System.out.println(name);
        }
        System.out.println("=====================");
        System.out.println(set.ceiling("이순호"));
        System.out.println(set.floor("이순호"));
        
        // ceiling / floor
        // 
        
	}

}
