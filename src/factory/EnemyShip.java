package factory;

public abstract class EnemyShip {

	private String name;
	private double amtDamage;

	public void followHeroShip() {
		System.out.println(this.getName() + " is following the hero");
	}

	public void displayEnemyShip() {
		System.out.println(this.getName() + " is on the screen");
	}

	public void enemyShipShoots() {
		System.out.println(this.getName() + " attacks and does " + this.getAmtDamage());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmtDamage() {
		return amtDamage;
	}

	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

}
