package TextOne;

import java.util.Scanner;

public class ReverseHello extends Thread {
	public ReverseHello(int n) {
		System.out.println("Hello from Thread"+n);
		
	}
	public ReverseHello() {
		
	}
	public void run() {
	/*	int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();*/
		
		System.out.println("Hello from Thread");
		for(int i=0;i<1;i++) {
		/*n=n-1;*/
		ReverseHello reversehello =new ReverseHello();
		reversehello.start();
		}
		/*sc.close();*/
	}
	
}
