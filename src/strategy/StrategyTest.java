package strategy;

public class StrategyTest {

	public static void main(String[] args) {
		Animal paws = new Dog();
		Animal bird = new Bird();
		
		System.out.println("Dog: " + paws.tryToFly());
		System.out.println("Bird: " + bird.tryToFly());
		
		paws.setFlyingAbility(new ItFlies());
		
		System.out.println("Dog: " + paws.tryToFly());

	}

}
