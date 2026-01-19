package com.kh.practice.chap02_abstractInterface.model.vo;

public interface Phone {

	public static final char NUMBERPAD[] = {'1','2','3','4','5','6','7','8','9','*','0','#'};
	
	char NUMNUM[] = {'똑','같','다'};
	
	public abstract String makeCall();
	
	 String takeCall(); //똑같다
	
}
