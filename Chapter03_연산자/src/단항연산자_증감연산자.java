/*
 *  피연산자 1개
 *  증감연산자
 *    = 전치연산자
 *      ++a
 *       => 증가를 먼저 => 나중에 다른 연산 수행
 *    = 후치연산자
 *      a++
 *       => 다른 연산 수행 => 증가 
 *       
 *    => 정수/문자만 가능
 *      -------- 실수,문자열에서는 사용이 불가능
 *    => 1증가 / 1감소
 *    => 반복문에서 주로 사용
 *    => 게임 ==> 자동 이동
 *    
 *   int a=10;
 *   int b=a ++;
 *       ---
 *        1  ---
 *           a+1
 *   -------------------- a:11 b=10        
 *   int a=10;
 *   int b=++a;        
 *   -------------------- a:11 b=11
 *       
 *       
 */      
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		int b=a++;
//		System.out.println("a="+a+",b="+b);
//		int a=10;
//		int b=++a + ++a;
//		System.out.println(b);
//		int a=10;
//		int b=a--;
//		System.out.println("a="+a+",b="+b);
//		int a=10; 
//		int b=--a;
//		System.out.println("a="+a+",b="+b);
		/*
		 *  int b=--a
		 *    1. a-1
		 *    2/ b=a
		 *  int b=a--
		 *    1. b=a
		 *    2. a-1
		 * 
		 */
		int c=10;
		c++;
		c++;
		c++;
		--c;
		--c;
		--c;
		System.out.println("c="+c);
		
		//반복문 ==> 증가 / 감소 => 조건 false
		//c+=5
		

	}

}
