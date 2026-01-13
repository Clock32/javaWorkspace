package com.kh.practice.set.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.kh.practice.set.compare.SortedLottery;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();

	public boolean insertObject(Lottery l) {

		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		boolean result = false;

		// 그냥 받아온 값을 HashSet 에서 지우기
		result = lottery.remove(l);

		if (result && win != null) {

			win.remove(l); // Null Point Exception 방지
		}

		return result;
	}

	public HashSet winObject() {
//		if (lottery.size() < 4) {
//			System.out.println("최소 4명의 추첨인이 있어야 추첨이 가능합니다.");	
//			return null;
//		}
//		
//		while(win.size() < 4) {
//		int ran = (int)(Math.random()*lottery.size());
//				win.add(list.get(ran));
//		}	
//		
		List<Lottery> list = new ArrayList(lottery);
		Collections.shuffle(list);

		if (lottery.size() < 4) {
			System.out.println("최소 4명의 추첨인이 있어야 추첨이 가능합니다.");
			return null;
		}

		for (int i = 0; win.size() < 4; i++) {

			win.add(list.get(i));

		}

		return win;

	}

	public TreeSet<Lottery> sortedWinObject() {

		winObject(); // 당첨자 목록 채우기

		TreeSet<Lottery> set = new TreeSet<>();
		set.addAll(win);

		return set;

	}

	public boolean searchWinner(Lottery l) {

		return win.contains(l);

	}

}
