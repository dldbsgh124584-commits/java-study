/*
 *   비교 연산자
 *   
 *    결과값은 boolean => true/false
 *    ==같다
 *    !=다르다
 *    <작다
 *    >크다
 *    <= 작거나 같다
 *    >= 크거나 같다
 *    
 *    ------------------ 사용할 수 있는 데이터
 *      정수 / 실수 / 문자 => 전체 사용이 가능
 *      논리 => == , != 
 *      문자열 : 사용하지 않는다 : equals() / compare()  
 *      ===== 주소 이용(참조 데이터형)
 *      
 *      6==7 =>false
 *      6!=7 =>true
 *      6>7 =>false
 *      6<7 =>true
 *      6>=7 =>false  6==7 6>7
 *      6<=7 =>true   6==7 6<7
 *      
 *      'A'<'B' char는 모든 연산자를 사용하면 자동으로 정수형으로 변경
 *      65  66
 *      
 *     
 *      
 *      
 */
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=6==7;
		System.out.println("b1="+b1);
		
		b1=6!=7;
		System.out.println("b1="+b1);
		
		b1=6>7;
		System.out.println("b1="+b1);
		
		b1=6<7;
		System.out.println("b1="+b1);
		
		b1=6<=7;
		System.out.println("b1="+b1);
		
		b1=6>=7;
		System.out.println("b1="+b1);
		
		System.out.println("==================================");
		
		
	    b1='A'=='C';
		System.out.println("b1="+b1);
		
		b1='A'!='C';
		System.out.println("b1="+b1);
		
		b1='A'>'C';
		System.out.println("b1="+b1);
		
		b1='A'<'C';
		System.out.println("b1="+b1);
		
		b1='A'<='C';
		System.out.println("b1="+b1);
		
		b1='A'>='C';
		System.out.println("b1="+b1);
		
		boolean r1=false;
		boolean r2=true;
		
		b1=r1==r2;
		System.out.println("b1:"+b1);
		b1=r1!=r2;
		System.out.println("b1:"+b1);
		
		b1 = 'A'==66; //false 
		System.out.println("b1="+b1);
		
		b1 = 'A'!=66; //true
		System.out.println("b1="+b1);
		
		b1 = 'A'>66; //false
		System.out.println("b1="+b1);
		
		b1 = 'A'<66; //true
		System.out.println("b1="+b1);
		
		b1 = 'A'<=66;//true
		System.out.println("b1="+b1);
		
		b1 = 'A'>=66;//false
		System.out.println("b1="+b1);
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
		// char => wjdtn
		// 조건문에서 주로 사용
		
		
		
				

	}

}
