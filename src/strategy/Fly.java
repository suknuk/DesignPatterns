package strategy;

public interface Fly {
	String fly();
}

class ItFlies implements Fly{
	@Override
	public String fly() {
		return "Flying High";
	}
}

class CantFly implements Fly{
	@Override
	public String fly() {
		return "I can't fly";
	}
}