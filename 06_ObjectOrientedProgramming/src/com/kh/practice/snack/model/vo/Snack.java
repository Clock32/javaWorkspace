package com.kh.practice.snack.model.vo;

public class Snack {
//value 오브젝트
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {
		
		
	}
	
	public Snack(String kind,String name,String flavor
				,int numOf,int price) {
		
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		
		
	}
	
	public String information() {
		
		String result = (kind+"("+name+" - "+flavor+") "+numOf+"개 "+price+"원");
		
		return  result;
	}
	
	public void setKind (String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return this.kind;
	}
	
	
	public void setName (String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	
	public void setFlavor (String flavor) {
		this.flavor = flavor;
	}
	public String getFlavor() {
		return this.flavor;
	}
	
	public void setNumOf (int numOf) {
		this.numOf = numOf;
	}
	public int getNumOf() {
		return this.numOf;
	}
	
	
	public void setPrice (int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	
	
	//set/get 작성
	
}
