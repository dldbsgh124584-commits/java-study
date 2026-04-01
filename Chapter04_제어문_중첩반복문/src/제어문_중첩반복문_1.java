/*
 *  중첩
 *  ---
 *        로그인이 된 경우 => 인증 => 메뉴 / 기능
 *                        => 댓글
 *                        => 예약
 *                        => 결제
 *                        => 여행 경로  
 *     if(조건문)  =======> if(조건문 && 조건문)
 *     {
 *         if(조건문)
 *     }
 *     
 *     --------------------
 *           1    2    7
 *     for(초기값;조건식;증가식)  ====> 세로 (줄수)
 *     {       3    4    6
 *       for(초기값;조건식;증가식)  ===> 가로 (실제출력물)
 *       {      5      
 *         반복 수행 문장
 *       }
 *     }
 *     
 *     ****
 *     ****
 *     ****
 *     ****
 *     
 */
public class 제어문_중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=2;i<=9;i++)
        {
        	for(int j=1;j<=9;j++)
        	{
        		System.out.printf("%d*%d=%2d\t",j,i,j*i);  // \t tab (일정 간격)
        	}
        	 System.out.println();
        }
	}

}
