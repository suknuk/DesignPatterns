package singleton.enumVer;

public class EnumTest {

	public static void main(String[] args) {
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		SingletonEnum singleton2 = SingletonEnum.INSTANCE;
		
		System.out.println(singleton1.getValue());
		System.out.println(singleton2.getValue());
		singleton1.setValue(2);
		System.out.println(singleton1.getValue());
		System.out.println(singleton2.getValue());

	}

}
