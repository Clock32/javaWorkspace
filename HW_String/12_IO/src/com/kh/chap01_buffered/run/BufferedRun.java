package com.kh.chap01_buffered.run;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.kh.chap01_buffered.model.vo.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		/*
		 * 보조 스트림
		 * -기반 스트림의 부족한 성능이나 기능을 추가 할  수 있는스ㅡㅌ림
		 * 보조스트림은 단도ㅓㄱ으로 사용이 불가능하다
		 * 
		 * 표현법
		 * 보조스트림 변수명 = new 보조스트림(기반스트림객체);
		 * 보조스트림1 변수명 = new 보조스트림1(new 보조스트림2기반스트림객체);
		 * 
		 * BufferedXXX
		 * 속도 향상목적의 스트림
		 * 내부적으로 버퍼공간을 제ㅣㅅ하여 데이터를 모아뒀다가 한번에 ㅇㅇ비ㅣ출력 진행
		 * 
		 * 
		 * try - with - re
		 * 
		 * 
		 * 스트림 객체를 tru에 ㅡㅁㄹ라
		 * 반납 close한다/.
		 */
		
		BufferedDao bd = new BufferedDao();
		
		bd.fileSave();
		
		
		
	}
	
}
