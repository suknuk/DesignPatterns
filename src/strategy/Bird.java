package strategy;

public class Bird extends Animal {
	public Bird() {
		this.flyingType = new ItFlies();
	}
}
