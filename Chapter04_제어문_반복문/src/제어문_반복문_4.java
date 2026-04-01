/*
 *  1~100까지 정수중에 3의 배수 / 5의 배수 / 7의배수 갯수
 */
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int a3=0,a5=0,a7=0;
        
        for(int i=1;i<=100;i++)
        {
        	if(i%3==0)
        		a3++;
        	if(i%5==0)
        		a5++;
        	if(i%7==0)
        		a7++;
        }
        System.out.println("1~100사이의 3의 배수의 갯수:"+a3);
        System.out.println("1~100사이의 5의 배수의 갯수:"+a5);
        System.out.println("1~100사이의 7의 배수의 갯수:"+a7);
        
        // 1 변수 , 반복문 , 결과값
        // 1~100사이의 짝수합 / 홀수합*/
		int sum=0;
        int sum1=0;
        for(int i=1;i<=100;i++)
        {
        	 
        	if(i%2==0)
        		sum+=i;
        	else
        
        		sum1+=i;
        	
        		System.out.println("짝수의 합:"+sum);
        		System.out.println("홀수의 합:"+sum1);
        }
	}

}
