package com.kh.practice.score.model.dao;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreDAO {

	
	public void saveScore(String name,int kor,
				int eng,int math,int sum,double avg) {
		
		// 이름 국어 영어 수학 총점 평균
		//파일 형식 : 박신우 100 90 80 270 90.0
		
		BufferedWriter bw = null;
  		
		try {
  			
			bw = new BufferedWriter(new FileWriter(new File("Score"),true));
  		    
			String sAvg = Double.toString(avg); //더블값이 들어가지않아 더블값을 문자열로 바꾸어 집어넣었고 다시 꺼낼땐 parsedouble을 사용하여
  												//다시 double값으로 변환 후 계산식에 추가하면 될거같다
			
  			bw.write(name);
			bw.write(kor);
  			bw.write(eng);
			bw.write(math);
  			bw.write(sum);
			bw.write(sAvg);
  		
			
  			
		} catch (IOException e) {
			// TODO Auto-generated catch block
  			e.printStackTrace();
		}finally {
 			try {
				bw.close();
  			} catch (IOException e) {
				// TODO Auto-generated catch block
  				e.printStackTrace();
			}
  		}
	
//		String score =  name, kor,eng, math, sum, avg;
//		
//		DataOutputStream dos = new DataOutputStream(new FileOutputStream("score"));
		
		
		
	}
	
	public DataInputStream  readScore() throws FileNotFoundException{
		
		DataInputStream dis = new DataInputStream(new FileInputStream(new File("Score")));
		
		
		
		
		
		
		
		
		return dis;
	} 
	
	
	
	
	
	
	
	
	
}
