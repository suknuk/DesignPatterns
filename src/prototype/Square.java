package prototype;

public class Square extends Shape {

	public Square() {
		this.type = "Square";
		System.out.println("In Square constructor");
	}

	@Override
	void draw() {
		System.out.println("Drawing Square");

	}

}
