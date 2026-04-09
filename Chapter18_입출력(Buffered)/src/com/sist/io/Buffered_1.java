package com.sist.io;
// Scanner (X) => BufferedReader 
// int / double String만 가능 => 예외처리
import java.io.*;
/*
 *   BufferedInputStream / BufferedOutputStream => 다운로드
 *           |                     |
 *       FileInputStream      FileOutputStream
 * 
 */
public class Buffered_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileInputStream fis=new FileInputStream("c:\\javadev\\고객.txt");
        	BufferedInputStream bis=new BufferedInputStream(fis);
        	
        	FileOutputStream fos=new FileOutputStream("c:\\java_data\\고객.txt");
        	BufferedOutputStream bos=new BufferedOutputStream(fos);
        	
        	int i=0; // 읽은 바이트
        	// read() => 문자의 번호 => char
        	byte[] buffer=new byte[1024];
        	while((i=bis.read(buffer,0,1024))!=-1)
        	{
        		bos.write(buffer,0,i);
        		
        	}
        	
        	fis.close();
        	bis.close();
        	fos.close();
        	bos.close();
        	
        }
        catch(Exception ex)
        {
        	System.out.println(ex.getMessage());
        }
	}

}
