package LockOne;

import java.util.Random;

public class LearnThread extends Thread {
	
	public void run() {
		System.out.println("线程开始");
		int a;
		for(int i=0;i<10;i++) {
			Random rand =new Random();
			a=rand.nextInt(10);
			try {
				Thread.sleep(a);
				System.out.println(i);
				System.out.println("随机数"+a);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("线程结束");
	}
}
		
					