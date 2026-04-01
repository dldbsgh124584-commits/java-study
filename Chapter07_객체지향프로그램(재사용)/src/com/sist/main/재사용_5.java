package com.sist.main;
// 같은 파일에서 클래스 여러개 만드는 경우 => public class 한번만 사용이 가능 


class Saram
{
	String name;
	String sex;
	static int age;
	public Saram(String name,String sex)
	{
		this.name=name;
		this.sex=sex;
		age=20; // => 인스턴스,static => 초기화 
	}
}
class Member extends Saram
{   
	 // 상속
    // =생성자 => default 생성자는 자동 호출
    // =매개변수가 있는 경우에는 super()
	public Member(String name, String sex) {
		super(name, sex);
		// TODO Auto-generated constructor stub
	}
         
	public void display()
	{
		this.name="박문수";
		this.sex="남자";
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		Member.age=25;  // 변경이 가능 => 상속예외 => 사용은 가능 
		System.out.println("나이:"+Member.age);
	}
}
/*
 *   1. 상속을 내리는 클래스 => 매개변수가 있는 생성자가 있는 경우
 *      => 상속받는 클래스에서 반드시 super(값...) 호출
 *   2. 변수 상속시에 => super / this는 구분이 없다
 *      => 구분 : 상속받은 클래스에서 변수를 다시 설정
 *      
 * 
 */
public class 재사용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m=new Member("홍길동","남자");
        m.display();
	}

}
