package com.sist.collection;
import java.util.*;
public class Collection_total_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<String> set=new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        
        
        //for-each만 가능
       Iterator<String> it=set.iterator();
       while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        // 순서가 없어서 어떤 데이터가 먼저 출력할지 알 수 없다
        // => for-each 보다는 => Iterator / for-each 는 list
       
//        for(String s:set)
//        {
//        	System.out.println(s);
//        }
	}

}
