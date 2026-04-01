/*
 *  선택문 => 다중 조건문을 단순화 
 *          복잡한 소스코딩에서 주로 사용
 *          -------- 게임 / 네트워크
 *                   |===> 복잡도
 *  형식)
 *     switch(정수/문자/문자열) ===> boolean / double (x)
 *     {
 *      case "+":  => if
 *           처리문장
 *           break; ===> 종료
 *      case "+":  => else if
 *           처리문장
 *           break; ===> 종료
 *      ...
 *      ...
 *      default: 처리 ==> else
 *     }
 */
import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
        
         System.out.print("첫번째 정수입력:");
         int num=r.nextInt();
        
         System.out.print("연산자 입력(+,-,*,/):");
         String op=r.next();
         
         System.out.print("두번째 정수입력:");
         int num1=r.nextInt();
         
         switch(op)
         {
         case "+":
        	 System.out.printf("%d+%d=%d\n",num,num1,num+num1);
        	 break;
         case "-":
        	 System.out.printf("%d-%d=%d\n",num,num1,num-num1);
        	 break;
         case "*":
        	 System.out.printf("%d*%d=%d\n",num,num1,num*num1);    	 
        	 break;
         case "/":
        	 System.out.printf("%d/%d=%d\n",num,num1,num/num1);
        	 break;
         default: System.out.println("없는 연산자입니다.");
         }
         switch(op)
         {
         case "+" ->{
        	 System.out.printf("%d+%d=%d\n",num,num1,num+num1);             
        	 System.out.println("프로그램 종료");} // 두개문장은 블록{}을 써야함
         case "-" ->
        	 System.out.printf("%d-%d=%d\n",num,num1,num-num1);
        	 
         case "*" ->
        	 System.out.printf("%d*%d=%d\n",num,num1,num*num1);    	 
        	 
         case "/" ->
        	 System.out.printf("%d/%d=%d\n",num,num1,num/num1);
        	 
         default -> System.out.println("없는 연산자입니다.");
         }
	}

}

