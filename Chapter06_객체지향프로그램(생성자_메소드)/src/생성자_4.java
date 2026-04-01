/*
 *  생성자 => 229p
 *     => 자신의 생성자를 호출이 가능하다
 *     => this() => 자신의 생성자 => 상속 super()
 *     => this => 객체(자신) => 상속 내린 클래스 : super 
 *  
 *  ======> 1. 반복 제거 => for / 메소드 / 생성자
 *          -------------------------------
 *          공통모듈 => 수정 편리 
 *      
 *        
 *      
 */
class Member2
{   // 사용이 안 되는 곳 -> static{} , static메소드 안에서는 사용이 불가능
	// static은 모든 곳에서 사용이 가능
	// ctrl+클릭 => 현재 선언된 메소드 위치로 이동
	int mno;
	String name;
	String address;
	
	Member2(){
		mno=1;
		name="홍길동";
		address="서울";
		
	}
	Member2(String n)
	{ 
		this(); // 생성자 안에서만 사용이 가능
		        // 중복코딩이 많은 경우
		        // 반드시 첫번째줄에서 사용
		name=n;
	}
	Member2(String n,String a)
	{
		this(n); // 현재 클래스의 생성자를 호출 
		name=n;
		address=a;
	}
	
}
public class 생성자_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member2 m1=new Member2();
        System.out.println("회원번호:"+m1.mno); 
        System.out.println("이름:"+m1.name); 
        System.out.println("주소:"+m1.address); 
        
        Member2 m2=new Member2("심청이");
        System.out.println("회원번호:"+m2.mno); 
        System.out.println("이름:"+m2.name); 
        System.out.println("주소:"+m2.address); 
        
        Member2 m3=new Member2("박문수,부산");
        System.out.println("회원번호:"+m3.mno); 
        System.out.println("이름:"+m3.name); 
        System.out.println("주소:"+m3.address); 
	}

}
