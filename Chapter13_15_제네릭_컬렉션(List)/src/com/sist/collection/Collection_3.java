package com.sist.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor  
@NoArgsConstructor  // 디폴트 생성자
class Sawon
{
	private int sabun;
	private String name;
	private String sex;
	private String dept;
	private String job;
	private String loc;
	private long pay;
	
}
public class Collection_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList list=new ArrayList();
        list.add(new Sawon(1,"홍길동","남자","개발부","남자","서울",3000));
        list.add(new Sawon(2,"이순신","남자","기획부","남자","부산",3000));
        list.add(new Sawon(3,"강감찬","남자","총무부","남자","제주",3000));
        list.add(new Sawon(4,"박문수","남자","영업부","남자","경기",3000));
        list.add(new Sawon(5,"심청이","여자","개발부","남자","서울",3000));
        System.out.println("===== 사원 목록 출력 =====");
        for(Object obj:list)
        {
             Sawon s=(Sawon)obj;
             System.out.println(
               s.getSabun()+" "+s.getName()+" "+s.getSex()+" "+s.getDept()+" "+s.getJob()+" "+s.getLoc()+" "+s.getPay()
             );
        }
        System.out.println("===== 이름 검색 =====");
        Scanner scan=new Scanner(System.in);
        System.out.print("이름 입력:");
        String name=scan.next();
        for(Object obj:list)
        {
        	Sawon s=(Sawon)obj;
        	if(s.getName().contains(name))
        	{
        		System.out.println(s.getSabun()+" "+s.getName()+" "+s.getSex()+" "+s.getDept()+" "+s.getJob()+" "+s.getLoc()+" "+s.getPay());
        	}
        }
        
	}

}
