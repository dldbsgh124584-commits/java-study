  /*
   * 
   *    변수
   *    1. 국어 / 수학 / 영어 / 총점 / 평균 / 학점 / 등수
   */
public class 변수_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int 국어;
		* 
		*int 수학;
		*int 영어;
		*int 등수;
		*int 총점;
		*double 평균;
		*String 학점;
		*/
		/*
		 * int drink=12;
		 *
		 *  drink-=5; // =drink=drink-5;
		 *  System.out.println("남은 음료수:"+drink);
		*/
		
	   // int 샌드위치=250;
	    //int 사과=100;
	    //int 쥬스=150;
	    //System.out.println("총 칼로리:"+(샌드위치+(사과*2)+쥬스)+"kcal");
	    	//int 샌드위치=250;
	    	//int 사과=100;
	    	//int 쥬스=150;
	    	//int sum=샌드위치+사과*2+쥬스;
	    	//System.out.println(sum);
         /*
          * 이름 홍길동/ 성별 남자/ 나이 20
          * 장바구니
          * 우유=1200 2개
          * 빵=1500 3개
          * 계란=200 10개 
          * ------------------
          * 
          */
		String name="홍길동";
		String sex="남자";
		double height=180.5;
		boolean iscard=false;
		int 나이=20;
		int 우유=1200;
		int 빵=1500;
		int 계란=200;
		int 장바구니=우유*2+빵*3+계란*10;
		
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.out.println("키:"+height);
		System.out.println("카드 존재여부:"+iscard);
		System.out.println("장바구니의 총합:"+장바구니);
		
		String msg="""
				    [마이데일리 = 김희수 기자] 투수진에서 홀로 무실점 피칭을 선보였다. 컨디션이 나쁘지 않아 보인다.

3일 일본 미야자키에서 치러진 롯데 자이언츠와 SSG 랜더스의 구춘리그 경기는 SSG의 10-5 승리로 끝났다. 득점권에서의 집중력을 발휘한 몰아치기에 성공한 랜더스가 경기 중반 확실하게 주도권을 가져갔고, 결국 끝까지 역전을 허용하지 않은 경기였다.

이날 롯데의 선발 투수는 나균안이었다. 그러나 나균안은 1회부터 2실점을 내주며 불안한 출발을 보였다. 이후 4회에는 박세웅이 올라왔지만, 박세웅은 2+이닝 동안 피홈런 2개 포함 7피안타 7실점이라는 충격적인 투구 내용을 보이고 말았다.

박세웅이 6회에 아웃 카운트를 하나도 잡지 못한 채 마운드를 내려간 뒤, 다음 주자로 마운드에 오른 선수는 정현수였다. 지난 시즌 82경기 47.2이닝을 소화하며 3.97의 ERA를 기록한 정현수는 시즌 내내 ‘애니콜’로 활약하며 팀 불펜의 중심을 잡았다.
			      """;
			
		
	}

}
