package LockOne;

import java.util.Random;

public class LearnThread extends Thread {
	
	public void run() {
		System.out.println("�߳̿�ʼ");
		int a;
		for(int i=0;i<10;i++) {
			Random rand =new Random();
			a=rand.nextInt(10);
			try {
				Thread.sleep(a);
				System.out.println(i);
				System.out.println("�����"+a);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("�߳̽���");
	}
}
		
					