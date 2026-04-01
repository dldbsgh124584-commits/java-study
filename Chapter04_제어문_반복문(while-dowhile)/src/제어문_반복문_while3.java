/*
 *  1~100 사이의 총합 / 짝수 합 / 홀수 합
 */
public class 제어문_반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=0,b=0,c=0;
      
      int i=1;
      while(i<=100)
      {
    	  a+=i; // a=a+i
    	  if(i%2==0)
    		  b+=i; //even=even+i
    	  else
    		  c+=i; // odd=odd+i
    	  i++; // i -> 100까지 증가
      }
      System.out.println("1~100 총합:"+a);
      System.out.println("짝수의 합:"+b);
      System.out.println("홀수의 합:"+c);
      
	}

}
