package LockOne;

public class test {

	public static void main(String[] args) {
			Thread 	ThreadOne=new LearnThread();
			Thread 	ThreadTwo=new LearnThread();
			ThreadOne.setName("第一个线程");
			ThreadOne.start();
			ThreadTwo.setName("第二个线程");
			ThreadTwo.start();
	}

}
