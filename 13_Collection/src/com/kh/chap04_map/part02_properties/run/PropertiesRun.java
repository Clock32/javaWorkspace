package com.kh.chap04_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun {

	public static void main(String[] args) {
		/*
		 * Properties
		 * Map계열 인터페이스를 구현한 클래스로 key value쌍으로 ㄱ밧을 저장한다
		 * 단 properties같은 경우 key value 값을 모두 String으로 관리하는것을 "권징"
		 * 하며 파일 입출력 메서드를 지원한다.
		 * 주로 프로젝트의 설정ㄷ정ㄷ보를 기록하는데 사용한다;.
		 * 
		 */
		
		Properties prop = new Properties();
		
		//Map계열 인터페이스를 구현하였기 때문에 put메서드 사용가능
		
		//prop.put("다이제", new Snack("초코맛",400));
		
		// 1. setProperty(String , String)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop);
		
		//2. getProperty (String key)
		// key에 저장된 vlaue값을 가져오는 메서드
		
		System.out.println(prop.getProperty("Set"));
		
		// 3.stor(OutputStream os, String Comments)
		// prop에 담긴 key.,value를 모두 출력 스트림을 활용하여 출력하는 메서드
		
		try {
			prop.store(new FileOutputStream("Test.properties"), "Properties Test");
		
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4. load(InputStream is) : properties를 읽어오는데 사용하는 메서드
		Properties prop2 = new Properties();
		
		System.out.println(prop2);
		
		try {
			prop2.load(new FileInputStream("Test.properties"));
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop2);
		
		
		
		
		
	}
}
