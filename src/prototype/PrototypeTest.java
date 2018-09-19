package prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		
		Shape shape1 = PrototypeFactory.getPrototype("Circle");
		System.out.println(shape1.getType());
		
		Shape shape2 = PrototypeFactory.getPrototype("Circle");
		System.out.println(shape2.getType());
		
		System.out.println(shape1.getId());
		System.out.println(shape2.getId());
		
		shape1.setId("shape1");
		
		System.out.println(shape1.getId());
		System.out.println(shape2.getId());

	}

}
