package Phone;

public class Handset {
	String brand;
	String type;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void sendinfo() {
		System.out.println("发送信息");
	}
	public void call() {
		System.out.println("通电话");
	}
	

	@Override
	public String toString() {
		return "这是一款型号为" + type + "的" + brand + "手机";
	}
	
}
