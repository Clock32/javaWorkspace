package com.kh.practice.list.music.model.compare;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle {

	public int compare (Object o1,Object o2) {
		
		
		
		
		Music m1 = (Music) o1;
		Music m2 = (Music) o2;
		
		
		int result = m1.getTitle().compareTo(m2.getTitle());

		
		if (result == 0) {
			
			result = m1.getSinger().compareTo(m2.getSinger());
		}
		return result;
	}
}
