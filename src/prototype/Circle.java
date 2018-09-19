package prototype;

public class Circle extends Shape {

	public Circle() {
		this.type = "Circle";
		System.out.println("In Circle constructor");
	}

	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}

}
