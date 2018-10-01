package composite;

public abstract class Component {

	public abstract void operation();

	public void add(Component component) {
		// empty default implementation
	}

	public void remove(Component component) {
		// empty default implementation
	}
	
	public Component getChild(int index) {
		// empty default implementation
		return null;
	}

}
