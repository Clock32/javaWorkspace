package com.kh.chap04_assist.part02_object.model.vo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectDao {

	
	
	public void fileSave() {
		/*
		 * 파일에 저장할 객체
		 */
		Phone p = new Phone("아이폰",13000,"1234");
		
		/*
		 *  ObjectOutputStream : 객체단위 출력을 지원하는 보조 스트림
		 *  
		 */
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt")) ){
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
