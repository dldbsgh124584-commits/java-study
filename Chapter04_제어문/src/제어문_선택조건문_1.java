// 문자열 비교 => equals ==> 로그인처리
// == (equals) , != (!equals)
import java.util.Scanner; 
public class 제어문_선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner r=new Scanner(System.in);
         System.out.print("ID 입력:");
         String id=r.next();
         
         System.out.print("비밀번호 입력:");
         String pwd=r.next();
         
         if(id=="admin" && pwd=="1234")
         {
        	 System.out.println("로그인 되었습니다");
         }
         else
         {
        	 System.out.println("ID나 Password가 틀렸습니다.");
         }
	}

}
