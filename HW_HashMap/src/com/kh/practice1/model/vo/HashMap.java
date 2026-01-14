package com.kh.practice1.model.vo;

public class HashMap<K, V> {

	private Entry<K, V>[] table;
	private int capacity; // 객체배열의 크기
	private int size; // 객체배열 내부의 초기화된 객체의 수

	class Entry<K, V> {

		K key;
		V value;
		Entry<K, V> next;

		public Entry(K key, V value, Entry<K, V> next) {

			this.key = key;
			this.value = value;
			this.next = next;

		}

	}

	// 객체생성시 반드시 객체배열의 크기로 지정
	public HashMap(int capacity) {
		this.capacity = capacity;
		
		this.table = new Entry[capacity];

	}

	public int getIndex(K key) {
		// 매개변수로 전달받은 key값을 hashCode인 정수값으로 변환시킨 후
		// 객체의 총 저장공간 수 capacity만큼 나눈 나머지 결과값을 반환하는 함수

		int hash = key.hashCode();

		/*
		 * 저장공간에 10이라면? 11355 % 10 == 5번 인뎃스 12345678 % 10 == 8번 인덱스 77777778 % 10 == 8번
		 * 인덱스 == next값
		 * 
		 * 
		 */

		return Math.abs(hash) % capacity;

	}

	public void put(K key, V value) {
		int index = getIndex(key);

		if (table[index] == null) {
			table[index] = new Entry<>(key, value, null);

		} else {
			// 이미 해당 위치에 값이 있는 경우
			// 1. 완전 같은 key값을 사용한 경우
			// key 값 중복으로 인해 현재 들어온 vlaue 로 인덱스의 위치의 값을 덮어씌우기
			if (table[index].key.equals(key)) {
				table[index].value = value;
			} else {
				table[index].value = value;
				return;

			}

			Entry<K, V> next = table[index];
			while (true) {

				// 다음으로 뽑은 entry의 key값이 현재 전달받은 keyㄱ밧과 동일한 경우(중복)
				if (next.key.equals(key)) {

					next.value = value;
					return;

				}

				// 현재 entry가 마지막 entry 인 경우

				if (next.next == null) {

					next.next = new Entry<>(key, value, null);
					break;

				}

				next = next.next;
			}

			// 2.key값은 다르지만 hash값이 우연히 일치한 경우

		}

		size++;

	}

	public V get(K key) {

		int index = getIndex(key);

		Entry<K, V> entry = table[index];

		if (entry == null) {

			return null;
		}

		while (true) {

			if (entry == null) {
				break;
			}

			if (entry.key.equals(key)) {

				return entry.value;

			}
			entry = entry.next;

		}

		return null;

	}

	public boolean containsKey(K key) {

		int index = getIndex(key);

		Entry<K, V> entry = table[index];

		if (entry == null) {

			return false;
		}

		do {
			if (entry.key.equals(key)) {

				return true;

			}
			entry = entry.next;

		} while (entry != null);
		return false;
	}

	public void remove(K key) {
		int index = getIndex(key);
		Entry<K, V> entry = table[index];

		if (entry == null) {

			return;
		}
		
		//이전 entryㄱ밧을 보관하기 위한 변수
		Entry<K,V> prev = null;
		

		do {
			
			if(entry.key.equals(key)) {
				
				if(table[index] == entry) {
					table[index] = entry.next;
					
					
				}else {
					
					prev.next = entry.next;
				}
			}
			
			
			

			if (entry.key.equals(key)) {
				//첫번째 entry인 경우 table의 index를 통해 삭제
				table[index] = null;
				//두버너매ㅐㅣㅏㅑ
				prev.next = entry.next;
				
				size--;
				break;

			}
			prev = entry;
			
			entry = entry.next;

		} while (entry != null);

	}

	public int size() {

		return size;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		for (Entry e : table) {
			if (e == null)
				continue;
			// {key : value}
			sb.append("{").append(e.key).append(" : ").append(e.value).append("}").append(",");

			Entry next = e.next;
			do {
				if (next != null) {
					sb.append("{").append(next.key).append(" : ").append(next.value).append("}").append(",");
					next = next.next;
				}
			} while (next != null); //
		}
		// sb.append(Arrays.toString(table));

		sb.append('}');

		return sb.toString();
	}

	public static void main(String[] args) {

	}

}
