package strategy;

public abstract class Animal {

	private String name;
	public Fly flyingType;

	public String tryToFly() {
		return this.flyingType.fly();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFlyingAbility(Fly newFlyType) {
		this.flyingType = newFlyType;
	}
}
