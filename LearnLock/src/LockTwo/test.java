package LockTwo;

public class test {

	public static void main(String[] args) {
		Thread 	ThreadOne=new Thread(new LearnRunnable());
		Thread 	ThreadTwo=new Thread(new LearnRunnable());
		ThreadOne.setName("��һ���߳�");
		ThreadOne.start();
		ThreadTwo.setName("�ڶ����߳�");
		ThreadTwo.start();
	}

}
