package com.kh.chap04_assist.part03_data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {

	
	public static void main(String[] args) {
		DataRun dr = new DataRun();
		dr.fileSave();
		dr.fileRead();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public void fileSave() {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample.txt"))){
			
			//java의 자료형별 데이터 작성
			dos.writeBoolean(true);
			dos.writeInt(10);
			dos.writeDouble(10.1);
			dos.writeChar('히');
			dos.writeUTF("유니코드 텍스트");
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public void fileRead() {
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream("sample.txt"))) {
			
			
			// 저장한 자료형 순서대로 읽어와야한다
			System.out.println(dis.readBoolean());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF()); //더이상 읽을 값이 없는데 utf읽을려고 하면EOFEXception 발생
			
			//왠만하면 데이터는 문자열 UTF로 통일하여 작성한다/
			
			//InputSteamReader = vyte를 reader 로 형변환
			
			//OutputStreamWriter = byte를 Wrier = 문자열 f로 변환
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

