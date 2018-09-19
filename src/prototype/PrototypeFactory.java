package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	private static final Map<String, Shape> prototypes = new HashMap<String, Shape>();

	static {
		prototypes.put("Rectangle", new Rectangle());
		prototypes.put("Circle", new Circle());
		prototypes.put("Square", new Square());
	}

	public static Shape getPrototype(String id) {
		return (Shape) prototypes.get(id).clone();
	}
}
