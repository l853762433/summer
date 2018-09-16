package TextTwo;

public class test {

	public static void main(String[] args) {
		MyObjectFactory mof1=new MyObjectFactory();
		mof1.getObject("TextTwo.Dog");
		mof1.getObject("TextTwo.Person");
	}

}
