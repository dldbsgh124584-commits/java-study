/*
 *  자바 반복문
 *    1.for ==> 126p
 *       화면 출력(UI) => 반복 횟수가 정해진 경우
 *    2.while==> 131p
 *      데이터베이스 / 네트워크 => 반복 횟수가 없는 경우
 *    3.do~while ==>134p
 *       게임 ==> 반복횟수는 없고 반드시 1번이상 수행
 *    ------------------
 *    반복제어
 *    1.break ===> 136p
 *      반복을 중단
 *    2.continue ===> 138p
 *      특정부분을 제외할 때 주로 사용
 *    
 *    최신 => for-each : 웹에서 주로 사용함
 *          --------- 변경은 불가능 => only 출력 ==> 배열 /컬렉션
 */
public class 제어문_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~10까지 출력 ==> 반복횟수 지정 ==> for
		/*
		 *  반복문
		 *     1. 형식
		 *        for(초기값;조건식;증가식)
		 *        {
		 *          반복 실행문
		 *        }
		 *     2. 실행순서
		 *        1) 초기값
		 *        2) 조건식 ----------------------------
		 *                                            |
		 *            = true ==> 3)반복 수행문장 수행 ==> 4)증가식
		 *            = false ==> 종료
		 *            
		 *     3.
		 *        int i=1;
		 *        i<=10 <= true => 문장수행
		 *              <= false => 종료
		 *        i++
		 *        
		 *    for 무한루프 => for(;;) => 계속 반복
		 *        
		 *        
		 *       
		 */
//	  for(int i=1;i<=10;i+=2)
//	  {
//		  System.out.println(i);
//		  
//	  }
//		for(;;)
//			System.out.println("Hello Java!!");
		
	/*
	 *  알파벳 ==> char
	 */ 
		
		for(char c='A';c<='Z';c++)
		System.out.println(c);
		         
	}

}
