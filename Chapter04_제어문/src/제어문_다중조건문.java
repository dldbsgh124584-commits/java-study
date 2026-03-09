/*
 *  1. 단일 조건문
 *     if(조건문)
 *     {
 *       조건이 true => 실행문장 
 *     }
 *     false => 건너뛴다
 *     
 *  2. 선택 조건문
 *     if(조건문)
 *     {
 *       조건이 true일 때
 *     }
 *     else
 *     {
 *       조건이 false일 때
 *     }
 *  
 *  3. 다중 조건문
 *     if(조건문)
 *     {
 *       조건이 true => 문장을 수행 => 종료
 *       조건이 false
 *     }        |
 *     else if(조건문)
 *     {
 *       조건이 true => 문장을 수행 => 종료
 *       조건이 false
 *     }        |
 *     else if(조건문)
 *     {
 *       조건이 true => 문장을 수행 => 종료
 *       조건이 false
 *     }
 *     else // 생략이 가능
 *     {
 *       해당 조건이 없는 경우에 처리
 *     }
 *    --------------------------- 한개의 문장으로 되어 있다
 *                                무조건 한개만 수행
 *                                속도가 향상
 *                                => 중복해서 수행하지 못한다
 *     => 중첩 => A+ , A0 , A-
 *       if()
 *       {
 *         if()
 *         {
 *         }
 *       }  
 *        
 */ 
// 사칙연산 => 계산기
/*
 *   if(+)
 *   else if(-)
 *   else if(*)
 *   else if(/)
 *   else 없는 연산
 *   
 *  ----------------- 단순화 : switch   
 *   
 *   
 *   => 변수
 *      = 정수
 *      = 정수
 *      = 연산자
 *   
 *   
 *   
 *   
 *   
 *   
 */
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner r=new Scanner(System.in);
            System.out.println("첫번째 정수 입력:");
            
            int num1=r.nextInt();
            
            System.out.println("연산자 입력(+,-,*,/):");
            String op=r.next();
            
            System.out.println("두번째 정수 입력:");
            int num2=r.nextInt();
            
            char c=op.charAt(0); // 첫번째 입력된 문자 읽기
            // 문자열은 인덱스번호 => 0번부터 시작한다
            // == 정수/실수/논리/문자
            if(c=='+')
            {
            	System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
            }
            else if(c=='-')
            {
            	System.out.printf("%d-%d=%d\n",num1,num2,num1=num2);
            }
            else if(c=='*')
            {
	            System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
            }
	        else if(c=='/')	
	        {
	        	if(num2==0)
	        	{
	        	 System.out.println("0으로 나눌 수 없습니다");	
	        	}
	        
	        else
	        {
	        	System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
	        }
	        }
	        else // 해당 조건이 없는 경우 생략 가능
	        {	
	        	System.out.println("잘못된 연산자입니다");
	        }
	        
	}      
}
