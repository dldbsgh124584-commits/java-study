/*
 *   up / down 게임
 *   -------------
 *       컴퓨터에서 1~100사이의 숫자를 임의의 추출 => 난수 
 */
import java.util.Random;
import java.util.Scanner;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        Random r=new Random();
        int com=r.nextInt(100)+1;
        
        // 무한루프 => 횟수가 지정되지 않은 경우 =>while
        for(;;)  // 반드시 종료시점을 지정한다
        {
        	System.out.print("1~100사이의 정수 입력:");
        	int user=scan.nextInt();
        	//System.out.println("user input:"+user);
        	if(com>user)
        		System.out.println("up");
        	else if(com<user)
        		System.out.println("down");
        	else
            {   
        		//같은 경우 종료
            	System.out.println("게임 오버!!");
            	System.exit(0);
            }
            
        }
       
        
	}

}
