package com.kh.practice1.model.vo;



public class HashMap <K,V>{

	private Entry<K,V>[] table;
	private int capacity; //객체배열의 크기
	private int size; //객체배열 내부의 초기화된 객체의 수
	
	
	class Entry <K,V>{
		
		K key;
		V value;
		Entry<K,V> next;
		
		
		public Entry(K key,V value,Entry<K,V>next) {
			
			this.key = key;
			this.value = value;
			this.next = next;
			
		}
		
		
	}
	
	
	
	//객체생성시 반드시 객체배열의 크기로 지정
	public HashMap(int capacity) {
		this.capacity = capacity;
		
	}
	
	public int getIndex(K key) {
		//매개변수로 전달받은 key값을 hashCode인 정수값으로 변환시킨 후 
		//객체의 총 저장공간 수 capacity만큼 나눈 나머지 결과값을 반환하는 함수
		
		int hash = key.hashCode();
		
		/*
		 * 저장공간에 10이라면?
		 * 11355 % 10 == 5번 인뎃스
		 * 12345678 % 10 == 8번 인덱스
		 * 77777778 % 10 == 8번 인덱스 == next값
		 * 
		 * 
		 */
		
		return Math.abs(hash) % capacity;
		
		
		
	}
	
	public void put(K key,V value) {
		int index = getIndex(key);
		
		if(table[index]==null) {
			table[index] = new Entry<>(key,value,null);
			
		}else {
			//이미 해당 위치에 값이 있는 경우
			//1. 완전 같은 key값을 사용한 경우
			//key 값 중복으로 인해 현재 들어온 vlaue 로 인덱스의 위치의 값을 덮어씌우기
			if(table[index].key.equals(key)) {
				table[index].value = value;
			}else {
				table[index].value = value;
				
				
			}
			
			
			
			
			//2.key값은 다르지만 hash값이 우연히 일치한 경우
			
		}
		
		
	}
	
	public V get(K key) {
		
	}
	
	public boolean containsKey(K key) {
		
		
	}
	
	public void remove(K key) {
		
		
	}
	
	public int size() {
		
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for(Entry e : table) {
			if(e == null) continue;
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");	
			
			Entry next = e.next;
			do {
				if(next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");	
					next = next.next;
				}
			}while(next != null); //
		}
		//sb.append(Arrays.toString(table));
		
		sb.append('}');
		
		return sb.toString();
	}

	
	
	public static void main(String[] args) {
		
		
	}
	
	
	
	
	
	
}
