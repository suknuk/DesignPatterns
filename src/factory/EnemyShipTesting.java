package factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {

		EnemyShipFactory shipFactory = new EnemyShipFactory();

		EnemyShip theEnemy = null;

		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship? (U / R / B)");

		if (userInput.hasNextLine()) {
			String enemyShipOption = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(enemyShipOption);
		}
		userInput.close();

		if (theEnemy != null) {
			doStuffEnemy(theEnemy);
		} else {
			System.out.println("No ship found");
		}

	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}

}
