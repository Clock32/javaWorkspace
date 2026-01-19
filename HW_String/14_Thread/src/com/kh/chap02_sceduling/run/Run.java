package com.kh.chap02_sceduling.run;

public class Run {

	public static void main(String[] args) {
		/*
		 * 스레드 스캐줄링 스레드의 작업 순서를 조절하는 방법
		 * 
		 * 
		 * Round Robin 스케줄링(순환할당방식) 각 스레드에게 시간 할당량을 정하여 정해진 시간만큼만 스레드를 실행시키는 방식이고 시간
		 * 할당량은 모든 스레드에게 동일하게 주어진다
		 * 
		 * 만약 스레드간에 우선순위가 부여된 경우 우선순위가 높은 스레드가 더 많은 작업시간을 할당받는다 / 우선순위 시반 스케줄링 스레드간의
		 * 우선순위가 동일한 경우 동일한 시간 할양향이 주어진다 RoundRobin은 OS 가 정하는 스레드 스케줄링방식으로 소스코드로 제어가
		 * 불가능하다
		 *
		 * 
		 * 우선순위 기반 스케줄링 스레드마다 우선 순위를 부여하는 방식 우선순위가 높은 스레드가 더 많은 작업기단을 할다받는다 소스코드로 스레드의
		 * 우선위늬를 부여할 수 있다. 단 우선순위가 더 높다해서 우선순위가 더 노ㅠ은 스레드가 항상 먼저 끝나는것은 아니다
		 */

		Thread t1 = new Thread(() -> {

			// 현재 스레드 이름
			System.out.println(Thread.currentThread().getName());

			for (int i = 0; i < 20; i++) {

				System.out.println("Car Driving......");

				try {
					Thread.sleep(100);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 스레드를 일시정지 시키는 메서드 - 100 = 1초

			}

		});
		
		t1.setName("Car");
		
		
		
		
		
		Thread t2 = new Thread(() -> {

			// 현재 스레드 이름
			System.out.println(Thread.currentThread().getName());

			for (int i = 0; i < 20; i++) {

				System.out.println("Plane Flying......");

				try {
					Thread.sleep(100);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 스레드를 일시정지 시키는 메서드 - 100 = 1초

			}

		});
		
		t2.setName("Plane");
		
		Thread t3 = new Thread(() -> {

			// 현재 스레드 이름
			System.out.println(Thread.currentThread().getName());

			for (int i = 0; i < 20; i++) {

				System.out.println("Tank Shooting......");

				try {
					Thread.sleep(100);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 스레드를 일시정지 시키는 메서드 - 100 = 1초

			}

		});
		
		t3.setName("Tank");
		
		//우선순위 적용 전 실행 결과 - Round Robin 알고리즘 적용 결과
//		t1.start();
//		t2.start();
//		t3.start();

		/*
		 * 우선순위 설정
		 * 각 스레드는 기본적으로 5의 우선순위를 가지고있다
		 * 1~10사이의 정수값을 대입하여 우선순위를 변경할 수 있다. - 10이 가장 중요
		 * 
		 */
		t1.setPriority(Thread.MAX_PRIORITY); //10
		//t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MIN_PRIORITY); //1
		
		
		
		
		/*
		 * 데몬 스레드
		 * 특정 스레드에 종속적인 스레드를 데몬 스레드라고 부른다
		 * 백그라운드 작업용 스레드
		 * 메인스레드 종료시 데몬스레드도 함께 종료된다
		 */
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true); //모든 스레드를 데몬 스레드로 성정해야 설정된다
		
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("메인 스레드 종료 =============================");
	}
}

