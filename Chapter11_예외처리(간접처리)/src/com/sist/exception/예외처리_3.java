package com.sist.exception;
// 에러메세지 => 에러 확인 
/*
 *  public class AristhmeticException extends Exception
 *  {
 *     private String message;
 *     public AristhmeticException(String message)
 *     {
 *       this.message=message;
 *     }
 *     public String getMessage()
 *     {
 *       return message;
 *     }
 *   }
 * 
 */
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // printStackTrace
		// getMessage
		try
		{
			int a=10;  // 에러 시 => catch 블록 안으로 이동
			int b=0;
			if(b==0)
			{
				throw new ArithmeticException("0으로 나눌 수 없다");
			}
			else
			{
				System.out.println(a/b);
			}
			System.out.println(a);
		}catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("타입:"+ex.getClass());
			ex.printStackTrace();
		}
	}

}
