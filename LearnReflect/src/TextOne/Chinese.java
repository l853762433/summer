package TextOne;

public class Chinese extends Person implements Fightable {

	@Override
	public void fight() {
			System.out.println("中国人");
	}
	public static void pingpang() {
		System.out.println("中国人乒乓很牛逼");
	}

}
