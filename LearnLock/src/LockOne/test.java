package LockOne;

public class test {

	public static void main(String[] args) {
			Thread 	ThreadOne=new LearnThread();
			Thread 	ThreadTwo=new LearnThread();
			ThreadOne.setName("��һ���߳�");
			ThreadOne.start();
			ThreadTwo.setName("�ڶ����߳�");
			ThreadTwo.start();
	}

}
