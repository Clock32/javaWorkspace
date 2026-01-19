package com.kh.chap02_byte.model.vo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO (Data Access Object)
// 데이터에 연결하기 위한 용도의 클래스를 관리하는 ㅠㅐ키지
public class FileByteDao {

	/*
	 * 자바 프로그램에서 외부매체로 데이터를 출력하는 프로그램
	 */
	public void fileSave() {
		// FileOutputStream : File로 데이터를 1byte단위로 출력하는 스트림
		//new FileOutputStream(입출력할 파일 객체 혹은 파일 명);
		FileOutputStream fout = null;

		try {
			//1. FileOutputStream 객체생성 == 입출력할 파일과 연결하기
			// - 매개변수로 전달한 파일이 존재하지 않으면 해당파일을 새로 생성하면서 통로가 개설된다
			// 존재하는 파일이면 즉시 통로로 연결한다.
			// - true 미 작성시 기존에 해당 파일의 내용을 덮어씌우기 한다
			// - true 작성시 이어쓰기 방식으로 출력한다
			fout = new FileOutputStream(new File("a_byte.txt"),true);
			
			/*
			 * 2.연결통로로 데이터 출력
			 * -wirte() 범위가 0 ~ 127 까지의 숫자만 사용가능 즉 아스키코드를이용한 영문자만 제대로 사용할수있다
			 * 
			 */
			
			fout.write(65); //A
			fout.write(66); //B
			fout.write('허'); //일반 바이트스트림으로는 한글과 같은 유니코드 문자는 표현이 불가능하다
			
			byte bArr[] = {99,100,101};
			fout.write(bArr); //c,d,e
			
			/*
			 * 3. 다 쓴 스트림 반납하기
			 */
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//어떤예외가 발생했든 안했는 반드시 실행하는구분을 작성하는 블럭
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //에러가 났든 아니든 무조건 자원 반납
				
		}
		
		
		
	}
	
	/*
	 * 자바프로그램으로 데이터를 입력받는 기능
	 * 
	 * public void fileRead() {
	 * 
	 * }
	 */
	
	public void fileRead() {
		  FileInputStream fin = null; //try출력과 finally에서 동시에 사용하기위해
		  
		  //1.입출력 객체 생성학;
		  try {
			fin = new FileInputStream("a_byte.txt"); //반드시 존재하는 파일 제시
			
			/*
			 * 2. 입력예제로부터 데이터 읽어오기
			 * read() : int
			 * 1byte의 데이터를 읽어온다
			 * 
			 */
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read()); //더이상 읽을 값이 없는 경우 -1 반환
			
//			int value = fin.read();
//			
//			while(value != -1) {
//				System.out.println(value);
//				value = fin.read();
//				
//			}
			
			
			
			int value = 0;
			
			while((value = fin.read()) != -1) {
				System.out.println(value);		
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
				
			//IOException 이거 왜이리 많이 필요햐 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		  }
}
