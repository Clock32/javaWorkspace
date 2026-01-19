package com.kh.practice.charCheck.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	CharacterController cc = new CharacterController();
	
	
	public void menu() throws IOException {
		
		System.out.print("문자열 : ");
		String str = br.readLine();
		
		
		try {
			cc.countAlpha(str);
		} catch (CharCheckException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
