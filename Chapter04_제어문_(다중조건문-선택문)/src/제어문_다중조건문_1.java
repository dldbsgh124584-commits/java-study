/*
 *  
 */
import java.util.Scanner;
public class 제어문_다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("월 입력:");
        int mon=scan.nextInt();
        
        if(mon==3 || mon==4 || mon==5)
        
        	System.out.println(mon+"는(은) 봄입니다");
        
        else if(mon==6 || mon==7 || mon==8)
        
        	System.out.println(mon+"는(은) 여름입니다");
        
        else if(mon==9 || mon==10 || mon==11)
        
        	System.out.println(mon+"는(은) 가을입니다");
        
        else if(mon==12 || mon==1 || mon==2)
        
            System.out.println(mon+"는(은) 겨울입니다");
        
        else
        
        	System.out.println("없는 달입니다");
        
        
	}

}
