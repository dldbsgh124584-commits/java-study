/*
 *  메소드 만들기
 *      |
 *    필요한 위치 호출
 *             ----메소드를 가지고 온다
 *    -------- 다른 클래스일 수 있다
 *    
 *    = 사용자 정의
 *    = 라이브러리 => 반드시 원형
 *                 --------- 리턴형 / 매개변수
 *      
 */
public class 메소드_재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 다른 클래스에서 재사용
	   // 메소드_1.sum(); // 호출
		메소드_2.process();
	    
	   // String s="Hello Java!!";
	   // char c=s.charAt(0);
	    
	    /*
	     *  char java.lang.String.charAt(int index)
	     *  ----                         ---
	     *  리턴형                        매개변수
	     *  
	     */
	  // double d=Math.random();
	   // double java.lang.Math.random()
  }
	 /*
	  *  1.매개변수 => 사용자 입력값
	  *  2.입력값을 가공해서 결과값 : 리턴형
	  *  3.정해진 것은 없다
	  *  ---------------------------
	  *   어떤 값을 받는지
	  *   결과값 처리
	  *   식별자 처리 
	  *   
	  *   ==> 메소드는 호출하면 반드시 처음부터 시작해서 return; 이 있는 곳에서 끝이 난다
	  *   
	  *   static boolean b()
	  *   {
	  *     int a=10;
	  *     if(a%2==0)
	  *       return true; // 종료
	  *     else
	  *       return false; // 종료
	  *   }
	  *   
	  *   퍼즐게임 
	  *   
	  */
}
