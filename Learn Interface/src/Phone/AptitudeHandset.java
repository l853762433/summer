package Phone;

public class AptitudeHandset extends Handset implements TheakPictures, Network {
		
	   public void networkConn() {
			System.out.println("已经开始启动移动网络。。。");
		}
	 
	 public void takePicture() {
			System.out.println("咔嚓。。。。拍照成功");
		}
}
