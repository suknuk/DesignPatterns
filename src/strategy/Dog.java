package strategy;

public class Dog extends Animal {
	public Dog() {
		this.flyingType = new CantFly();
	}
}
