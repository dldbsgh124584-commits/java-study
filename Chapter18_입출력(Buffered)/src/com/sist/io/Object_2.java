package com.sist.io;
import java.io.*;
public class Object_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        FileInputStream fis=new FileInputStream("c:\\java_data\\student.txt");
        
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        System.out.println("학번:"+s.getHakbun());
        System.out.println("이름:"+s.getName());
        System.out.println("국어 점수:"+s.getKor());
        System.out.println("수학 점수:"+s.getMath());
        System.out.println("영어 점수:"+s.getEng());
        
	}

}
