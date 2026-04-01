package com.sist.regex;
//[가-힣] => 한글자만 [가-힣]{3} => 세글자   3~7 사이 => {3,7} 
public class 정규식_6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("dat".matches("[abc]at"));
        
        System.out.println("a".matches("[a-z]"));
        System.out.println("A".matches("[A-Z]"));
        System.out.println("1".matches("[0-9]"));
        System.out.println("홍".matches("[가-힣]"));
        // "코메디"
        System.out.println("코메디".matches("[가-힣]{3}"));
	}

}
