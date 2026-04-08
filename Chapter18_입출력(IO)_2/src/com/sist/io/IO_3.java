package com.sist.io;
//파일 생성 / 폴더 생성 / 삭제
import java.io.*;
/*
 *   파일 제어 : 입출력
 *      => FileInputStream / FileOutputStream
 *      => BufferedInputStream / BufferedOutputStream
 *      => FileReader / FileWriter
 *      => BufferedReader / BufferedWriter
 *      => ObjectFileInputStream / ObjectFileOutputStream
 *      => PrintWriter : 
 * 
 */
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	File dir=new File("c:\\upload\\sawon.txt");
        	/*if(!dir.exists())
        	{
        		dir.mkdir();
        	}
        	else
        	{
        		System.out.println("이미 존재하는 폴더입니다");
        	}*/
        	/*if(!dir.exists())
        	{
        		dir.createNewFile();
        		System.out.println("파일이 생성 되었습니다");
        	}
        	else
        	{
        		System.out.println("이미 존재하는 파일입니다");
        	}*/
        	if(dir.exists())
        	{
        		dir.delete();
        	}
        }catch(Exception ex) {}
	}

}
