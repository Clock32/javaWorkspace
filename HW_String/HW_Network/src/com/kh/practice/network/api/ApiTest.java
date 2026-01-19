package com.kh.practice.network.api;

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
public class ApiTest {
	public static void main(String[] args) {
		// 0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
		// serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
		try {
			String serviceKey = "fIxYebQ9XDYkxEZ6Xgz%2FCDaEr6GGMFQzaUDgxdjG1WHJT9lSYBaE0fboWeonqIXeL%2FDSucRY6urm5wABDVrpzw%3D%3D";
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";
			String stationName = URLEncoder.encode("종로구", "UTF-8");
			String dataTerm = "DAILY";
			serviceUrl += "?serviceKey=" + serviceKey + "&stationName" + stationName + "&dataTerm" + dataTerm;
			System.out.println(serviceUrl);
			URL url = new URL(serviceUrl);
			URLConnection conn = url.openConnection();
			try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));) {
				String line = null;
				while ((line = br.readLine()) != null) {
					// 4)전달받은 데이터를 화
					System.out.println(line);
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
