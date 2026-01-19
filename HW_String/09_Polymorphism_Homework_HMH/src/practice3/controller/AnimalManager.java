package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		Animal ani[] = new Animal[5];
		for (int i = 0; i < ani.length; i++) {
			int ran = (int) (Math.random() * 2 + 1);
			if (ran < 2) {
				ani[i] = c;
			} else {
				ani[i] = d;
			}
		}
		for (Animal a : ani) {
			a.speak();
		}
	}
}
