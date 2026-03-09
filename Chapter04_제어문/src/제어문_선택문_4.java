import java.util.Scanner;
public class 제어문_선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		System.out.print("첫번째 정수:");
		int num1=r.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		String op=r.next();
		
		System.out.print("두번째 정수:");
		int num2=r.nextInt();
		
		switch(op)
		{
		case "+":
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case "-":
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			break;
		case "/":
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
			    System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			break;
		default:
			System.out.println("연산처리를 할 수 없습니다.");
		}

	}

}
