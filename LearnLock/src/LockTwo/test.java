package LockTwo;

public class test {

	public static void main(String[] args) {
		Thread 	ThreadOne=new Thread(new LearnRunnable());
		Thread 	ThreadTwo=new Thread(new LearnRunnable());
		ThreadOne.setName("第一个线程");
		ThreadOne.start();
		ThreadTwo.setName("第二个线程");
		ThreadTwo.start();
	}

}
