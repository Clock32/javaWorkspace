package com.kh.chap01_URL.part03_request;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class AirPolution {

	
	public static void main(String[] args) {
		/*
		 * 1) API서버로 데이터 요철(Request)
		 * 
		 * 1.API(Application Programing Interface)
		 * 어플리케이션 상호작용을 위한 인터페이스 ----------------------------------------------
		 * 자바 api : 자바 어플리케이션 개발에 도움을 주는 클래스
		 * API 서버
		 * URL로 데이터에 대한 요청ㅇㄹ 보내면 응답 데이터를 반환해주는 서버로 애플리케이션드 중 
		 * 데이터나 서비스를제공하는 역할을 API서버라고 부른다 (카카오API서버 네이버API서버 등)
		 * 
		 * A어플리케아션이 B어플리케이션에 필요한 데이터가 있는 경우 B어플리케이션의 APU서버를 통해
		 * 요청 request를 보내고 B API서버는 요청에 대한 응답 response를 돌려준다
		 * 단 API서버 요청시에는 해당 API서버가 정한 규칙 interface에 맞춰 요청을 보내야 한다.
		 * 
		 * API 서버 요청 방식 http method
		 * API서버에서 지정한 규칙에 따라야 하며 전통적인 방식의 API요청 방법은 크게 2가지가 있다
		 * 1. get방식
		 * URL에 요청 변수 queryParameter 를 붙여서 요청하는 방식
		 * 요청변수 key = value 형태로 작성하며 여러개의 요청벼ㄴ수가 있을 경우 &로 구분한다
		 * get방식은 주로 데이터를 단순히 조회할때 사용한다
		 * ex)  https://app.slack.com/client/T0A4XKM4932/C0A46U1PNS0
		 *
		 * 2. post방식
		 *	요청변수를 HTTP바디에 담아서 요청하는 방식
		 *주로 데이터를 생성 수정 삭제할때 사용한다
		 *ex) https://khedu.co.kr/data 쿼리 스트링은 url에 노출되지않는다
		 * 
		 * 
		 * 3. API응답데이터 형식 및 처리방법
		 * 1) XML유형의 데이터
		 * <course>
		 *  ////.......
		 * </course>
		 * 
		 * 2)JSON유형의 데이터
		 * 
		 * ("name" : "mkm") //문자ㅎ열 형태의 javascript 객체
		 * 
		 * 3) 처리방법
		 * XML JSON등 해당 타입에 맞는 파서를 이용하여 내 프로그래밍 언어에 맞는 객체로 변환한다.
		 * 
		 * 4) API 응답 상태코드
		 * 200 : 성공
		 * 404 : 찾고자하는 자원이 없는 경우 전달하는 상태값
		 * 400 : 요청 오류
		 * 401 : 인증 오류시 전달하는상태값
		 * 500 : API서버상에 오류가 발생하는경우
		 * 
		 * 
		 * 
		 */
		try {
			String serviceKey = "fIxYebQ9XDYkxEZ6Xgz%2FCDaEr6GGMFQzaUDgxdjG1WHJT9lSYBaE0fboWeonqIXeL%2FDSucRY6urm5wABDVrpzw%3D%3D";
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
					
			
			serviceUrl += "?serviceKey="+serviceKey;
			serviceUrl += "&sidoName"+URLEncoder.encode("서울","UTF-8");
			
			System.out.println(serviceUrl);
		
			URL url = new URL(serviceUrl);
			URLConnection conn = url.openConnection();
			
			try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));){
				
			try	(BufferedWriter bw = new BufferedWriter(new FileWriter("환경오염.xml"));){	
				String line = null;
			
				
			while((line = br.readLine()) != null) {
				
				bw.write(line);
				bw.newLine();
			}
				
			}
			}
			
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}
	
