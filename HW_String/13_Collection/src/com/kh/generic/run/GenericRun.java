package com.kh.generic.run;

public class GenericRun <T ,G> {

	T t;
	G g;
	
	public static void main(String[] args) {
		
		
		
	}
	
	public void setT (T t) {
		this.t = t;
	}
	
	public void setG (G g) {
		this.g = g;
	}
	
	public static <V> void printTest(V item) {
		
		System.out.println(item);
		
	}
	
	
	
	
	
	
	
	
	
}
