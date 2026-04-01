import java.util.Scanner; // 입력
public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *   사과 5개
		 *   => 사과를 2개를 먹었다 
		 *   => 현재 남아있는 사과의 갯수
		 *
		int 사과=5;
		System.out.println(사과-2);
        *
        int 사과=5;
        int 먹은사과=2;
        System.out.println(사과-먹은사과);
        *
		int 사과=5;
		사과-=2;
		System.out.println("남은 사과:"+사과);
        *
        * 국어 80
        * 영어 90
        * 수학 70
        *
        *
        *
	    int 국어=80;
	    int 영어=90;
	    int 수학=70;
        System.out.println((국어+영어+수학)/3);
       */
		Scanner scan=new Scanner(System.in);
		//System.in => 키보드에서 입력된 값을 읽어오는 역할
		// => 공백 / 엔터 
		System.out.print("국어 영어 수학 입력:");
		int 국어=scan.nextInt();
		int 영어=scan.nextInt();
		int 수학=scan.nextInt();
		System.out.println("총점:"+(국어+영어+수학));
		System.out.printf("평균:%.2f",+(국어+영어+수학)/3.0);
		
	}

}
