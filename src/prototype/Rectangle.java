package prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		this.type = "Rectangle";
		System.out.println("In Rectangle constructor");
	}

	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}

}
