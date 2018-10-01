package composite;

public class ComponentTest {

	public static void main(String[] args) {
		Composite rootComposite = new Composite();
		rootComposite.add(new Leaf());
		rootComposite.add(new Leaf());
		
		Composite lowerComposite = new Composite();
		rootComposite.add(lowerComposite);
		
		lowerComposite.add(new Leaf());
		lowerComposite.add(new Leaf());

		rootComposite.operation();
		
	}

}
