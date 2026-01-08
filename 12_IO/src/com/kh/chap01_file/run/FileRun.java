package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {
	
	
	
	public static void main(String[] args) {
		
		/*
		 * java.io.File
		 * 파일의 개념을 추상화하여 만들어진 클래스
		 * 별도의 입출력 기능은 존재하지 않는다
		 * 파일의 속성이나 경로 이름 크기 등을 알 수 있다.
		 */
		try {
			//1. 경로를 지정하지 않고 파일 생성
//			File file1 = new File("rest.txt");
//			file1.createNewFile();
//			
//			
//			//2. 경로를 지정하고 파일 생성 / 경로가 생성되는것이아니라 경로가 이미 존재해야만한다
////			File file2 = new File("C:/aaa/rest2.txt");
////			file2.createNewFile();
//			
//			//3. 한개의 폴더 생성하기
//			File bbbFolder = new File("C:/bbb");
//			bbbFolder.mkdir();
//			
//			//4. 여러개의 폴더 생성하기
//			File cccdddFolder = new File("C:/ccc/ddd");
//			cccdddFolder.mkdirs();
			
			//5. 폴더가 존재하지 않는 상황에서, 폴더 및 파일 생성
			File aaa = new File("C:/aaa");
			//폴더가 이미 존재하는지 확인 후 존재하지 않으면 생성
			if(!aaa.exists()) {
				aaa.mkdir();
			}
			File file2 = new File("C:/aaa/rest2.txt");
			file2.createNewFile();
			
			//File에서 제공하는 메서드들
			System.out.println(aaa.isFile());
			System.out.println(aaa.isDirectory());
			
			System.out.println("파일명 : "+file2.getName());
			System.out.println("상위 폴더 : "+file2.getParent());
			System.out.println("파일 용량 : "+file2.length());
			System.out.println("절대경로 : "+file2.getAbsolutePath());	
			//나머지 File 작동법은 PDF 참조
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
