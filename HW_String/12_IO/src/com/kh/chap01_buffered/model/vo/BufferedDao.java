package com.kh.chap01_buffered.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	
public void fileSave() {
		
		BufferedWriter tw = null;
		
		try {
			/*
			 * 보조스트림이 Writer 계열이라면 기반 스트림도 writer로 생성해야한다
			 */
			tw = new BufferedWriter(new FileWriter(new File("C_buffer.txt")));
			
			tw.write("안녕하세요");
			tw.newLine(); //개형문자 넣어주는 메서드
			tw.write("반갑습니다\n");
			
			
			
			tw.flush(); //버퍼 공간(약 8kb)을 비워두는 메서소드 - close 호출시 자동으로 호출된다
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				tw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}


public void fileRead() {
	
	try (BufferedReader br = new BufferedReader(new FileReader("C_buffered.txt"));){
		
		//System.out.println(br.readLine()); // 한 줄 씩 값을 문자열로 반환
		String value = null;
		while((br.readLine() != null)) {
			
			System.out.println(value);
		}
		
		
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
