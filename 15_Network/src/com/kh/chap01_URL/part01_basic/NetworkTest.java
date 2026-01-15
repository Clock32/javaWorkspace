package com.kh.chap01_URL.part01_basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkTest {
	/*
	 * IP
	 * 10.10.10.10 형태로 4바이트ㅡ로 이루어진 주소값
	 * gostname L naver.com , iei.or.kr == 도메인명
	 * InetAddress 자바에서 ip주소를 가지고 있는 클래스
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		NetworkTest nt = new NetworkTest();
		
		nt.test3();
		
		
	}
	
	public void test1() {
		
		try {
			InetAddress naver = InetAddress.getByName("Naver.com");
			System.out.println(naver.getHostAddress());
			
			InetAddress google = InetAddress.getByName("Google.com");
			System.out.println(google.getHostAddress());

			
			
			InetAddress[] arr =  InetAddress.getAllByName("Naver.com");
			System.out.println(Arrays.toString(arr));
			
			//내 컴퓨터의 ip주소를 얻어오는 방법
			//InetAddress.getLocalHost();
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void test2() {
		/*
		 * URL
		 * 인터넷 상에 존재하는 서버들의 자원에 접근할 수 있는 주소
		 * 자바에서는 RUL클래스를 통해 URL자원을 다룰 수 있다
		 * 실제 URL자원에 대한 객체를 생성하며 자원에 연결하고 데이터를 읽어올 수 있다.
		 * 기본적으로 입출력이 가능하다
		 * 
		 * URL 구조
		 *  - https://kh-academy.co.kr/project/teamView.kh?no=5398&cpage=1
		 * protocol : 통신규약 (http,https,smtp,file,...);
		 * hostname : 도메인 이름 (ip주소) kh-academy.co.kr 
		 * port : 서비스 번호, 호스트 내에  특정 서비스를 가리키는 논리적인 번호
		 * 			포트번호 별로 다양한 서비스를 제공 할 수 있다
		 * 			각 프로토콜의 기본포트는 생략이 가능하다
		 * 			hrrps 의; 기본 포트 : 443, http : 80 ftp : 20..
		 * 
		 * 
		 * 자원경로(patch) : hostname과 port내부에 자원이 존재하는 세부 경로.
		 * project/teamView.kh?no=5398&cpage=1
		 * 
		 *  querrystring : 자원을 얻기 위해 서버에 전달해야하는 ㄱ밧들
		 *  				?no=ㅇㅇㅇ&cpage=1
		 * 
		 */
		
		try {
			URL url = new URL("https://kh-academy.co.kr/project/teamView.kh?no=5398&cpage=1");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort()+"::"+url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			
			
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	public void test3() {
		/*
		 * URLConnection
		 * 네트워크상의 원격서버와 통신하여 자원을 입출력할 수 있는 스트림을 제공하는 클래스
		 * URL로 연결할 자원을 기술하고 URLConnection우로 입출력 스트림을 사용하며 입출력을 할 수 있다.
		 * 
		 * 
		 */
		
		String address = "https://khedu.co.kr/upload/project/2025062512331962_1.png";
		BufferedInputStream bi = null;
		BufferedOutputStream bo = null;
		
		try {
			URL url = new URL(address);
			
			URLConnection conn = url.openConnection();
			
			
			//입력받기
			bi = new BufferedInputStream(conn.getInputStream());
			
			//출력받기
			bo = new BufferedOutputStream(new FileOutputStream("Project.png"));
			
			int data = 0;
			while((data = bi.read()) != -1) {
				
				bo.write(data);
				
			}
			System.out.println("검색결과 저장 완료");
			
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				bi.close();
				bo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
	
}
