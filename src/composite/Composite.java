package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> childComponents = new ArrayList<Component>();

	@Override
	public void operation() {
		System.out.println("I am a composite. My children are:");
		for (Component childComponent : this.childComponents) {
			childComponent.operation();
		}
	}

	@Override
	public void add(Component component) {
		this.childComponents.add(component);
	}

	@Override
	public void remove(Component component) {
		this.childComponents.remove(component);
	}

	@Override
	public Component getChild(int index) {
		return this.childComponents.get(index);
	}

}
