package Phone;

public class test {

	public static void main(String[] args) {
			AptitudeHandset ah =new AptitudeHandset();
			CommonHandset ch =new CommonHandset();
			ah.setBrand("HTC");
			ch.setBrand("索尼爱立信");
			ah.setType("I9100");
			ch.setType("G502c");
			
			System.out.println(ch.toString());
			ch.play();
			ch.sendinfo();
			ch.call();
			System.out.println("----------");
			System.out.println(ah.toString());
			ah.networkConn();
			ah.takePicture();
			ah.call();
			ah.sendinfo();
			
			
			
	}

}
