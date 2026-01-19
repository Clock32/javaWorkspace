package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List list = new ArrayList();
	
	public int addList(Music music) {
		
		return 1;
	}

	public int addAtZero(Music music) {
		
		return 1;
	}
	
	public List printAll() {
		
		return null;
	}
	
	public Music searchMusic(String title) {
		
		
		
		return null;	
		
	}
	
	public Music removeMusic(String tile) {
		
		return null;
	}
	
	public Music setMusic(String title , Music music) {
		
		Music result = null;
		int index = -1;
		
		for(int i = 0 ; i < list.size();i++) {
			
			Music m = (Music) list.get(i);
			
			if(m.getTitle().equals(title)) {
				
				index = i;
				result = m;
				break;
			}
		}
		list.set(index, music);
		
		return result;
	}
	
	public int ascTitle() {
		
		Collections.sort(list,(Comparator) new AscTitle());
		
		return 1;
	}
	
	public int descSinger() {
		
		
		
		
		
		
		return  1;
	}
	
}
