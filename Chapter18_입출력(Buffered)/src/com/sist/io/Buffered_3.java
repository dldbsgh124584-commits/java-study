package com.sist.io;
import java.io.*;
/*
 *    FileInputStream fis=new FileInputStream("파일명")
 *     => 파일에 있는 데이터 읽기
 *    FileOutputStream fos=new FileOutputStream("파일명")
 *     => 파일에 데이터를 쓰기
 */
public class Buffered_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;		
        try
        {        	
        	fis=new FileInputStream("c:\\javadev\\movie.txt");
        	/*int i=0;
        	StringBuilder sb=new StringBuilder();
        	while((i=fis.read())!=-1) // 파일 끝까지 읽어라
        	{
        		sb.append((char)i);
        		
        	}
        	System.out.println(sb.toString());*/
        	long start=System.currentTimeMillis();
        	
        	BufferedReader in=new BufferedReader(new InputStreamReader(fis));
        	StringBuilder sb=new StringBuilder();
        	while(true)
        	{
        		String msg=in.readLine();
        		if(msg==null) break; // null 값인 경우에 마지막
        		sb.append(msg+"\n");
        	}
        	long end=System.currentTimeMillis();
        	
        	System.out.println(sb.toString());
        	System.out.println("수행시간:"+(end-start)+"MS");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage()); 	
        }
        finally
        {
        	try
        	{
        		
        	}catch(Exception ex) {}
        }
        
	}

}
