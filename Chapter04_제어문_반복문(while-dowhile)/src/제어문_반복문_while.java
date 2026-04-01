/*
 *  1. 조건문 : if , if~else , if~else if~else if...
 *  2. 선택문 : switch~case
 *            case 값: 처리문장...
 *            case 값 -> 처리문장
 *            ----------------- 간절한 코딩
 *            1) 가독성
 *            2) 간결성 =======> 중복 코딩을 어떻게 처리 
 *            3) 최적화          ------
 *                              | 반복문 
 *                              | 메소드
 *                              | 클래스 => 라이브러리
 *                              | 모아서 저장 => 공통 모듈
 *                                => Spring : AOP
 *               => 클래스 
 *     반복문
 *       for : 화면 UI , 알고리즘 => 배열 / 컬렉션 처리
 *             반복횟수 지정
 *     while : Back-End
 *             파일 / 데이터베이스 / 네틍뤄크
 *             간단한 게임
 *           반복횟수가 지정이 안 된 경우
 *             
 *  do-while : 시작화면 출력
 *        한번이상을 반드시 출력할 때
 *        => 시작 => 문장 => 조건검색
 *  -------------------------------
 *   제어
 *     => break : 반복을 종료
 *     => continue : 건너뛴다 (특정부분에서 제외)
 *     
 *    1) 형식
 *       1. 시작값 int i=1  
 *       2. 끝값    i<=10
 *       3. 몇 번 수행 i++ ===> i+=2 ===> i+=3
 *       
 *       for(시작값;끝값;중가값)
 *             |
 *           실행문장
 *           
 *       시작값      - 1 => 한번만 수행
 *       while(끝값) - 2 => 반드시 true/false가 나오는 연산자 사용
 *       {                 - 부정연산자/논리연산자/비교연산자
 *         실행문장   - 3 
 *         증가값    - 4
 *       }
 *       
 *       시작값       -1
 *       do
 *       {
 *         실행문장    -2
 *         증가값      -3
 *       }while(끝값); -4
 *       
 *       ----------------
 *       선호도 (개발자)
 *       => 반복횟수 지정 : for
 *       => 없는 경우    : while
 *       => 게임 : do~while 
 *                   
 */
import java.io.*;
public class 제어문_반복문_while {

	public static void main(String[] args) throws Exception{
		/*// TODO Auto-generated method stub
        File file=new File("c:\\javaDev\\movie.txt");
        FileReader fr=new FileReader(file);
        
        StringBuffer db=new StringBuffer();
        String movie="";
        int i=0;
        while((i=fr.read())!=-1)
        {
	         movie+=(char)i;
	         db.append((char)i);
        }
        fr.close();
        System.out.println(db.toString());*/
		
		System.out.println("===== for문 ======");
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		System.out.println("\n===== while =====");
		char c='A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		// c='Z'+1
		System.out.println("\n ===== do~while =====");
		
		c='A';
		do
		{
			System.out.print(c+" ");
			c++;
		}while(c<='Z');
	}

}
